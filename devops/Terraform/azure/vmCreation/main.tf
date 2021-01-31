#managed disk
resource "azurerm_managed_disk" "disk" {
  name                 = "managed_disk"
  location             = "${var.location}"
  resource_group_name  = "${azure_resource_group.main.name}"
  storage_account_type = "STANRARD_LRS"
  create_option        = "Empty"
  disk_size_gb     =  10
}

resource "azurerm_virtual_machine" "core" {
  count                           = 1
  name                            = "virtual-machine-${count.index + 1}"
  location                        = "${var.location}"
  resource_group_name             = "${azure_resource_group.main.name}"
  network_interface_ids           = ["${azurerm_network_interface.main[0].id}"]
  vm_size                         = "Standard_DS1_V2"
  delete_data_disk_on_termination = true

  storage_image_reference {
    publisher = "Canonical"
    offer     = "UbuntuServer"
    sku       = "16.04-LTS"
    version   = "LTS"
  }

  storage_os_disk {
    name              = "machine-disk-${count.index + 1}"
    caching           = "ReadWrite"
    create_option     = "FromImage"
    managed_disk_type = "STANDARD_LRS"
  }

  storage_data-disk {
    name              = "data-additional"
    lun               = 1
    managed_disk_type = "STANDARD_LRS"
    create_option     = "Empty"
    disk_size_gb      = 10

  }

  storage_data-disk {
    name            = "${azurerm_managed_disk.disk}"
    lun             = 2
    managed_disk_id = "${azurerm_managed_disk.disk.id}"
    create_option   = "Attach"
    disk_size_gb    = "${azurerm_managed_disk.disk.disk_size_gb}"
  }

  os_profile {
    computer_name  = "udemy"
    admin_username = "udemy"
    admin_password = "${random_password.pass.result}"

  }

  os_profile_linux_config {
    disable_password_authentication = false
  }

  #Tags
  tags = {
    name     = "virtual-machine-${count.index + 1}"
    location = "${var.location}"
  }



}

output "pass" { value = "${random_password.pass.result}" }

