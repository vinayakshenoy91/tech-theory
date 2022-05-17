provider "azurerm" {}


resource azurerm_resource_group "scaleset" {
  #name
  #location
}

#VNET
resource "azurerm_virtual_network" "scale_vnet" {
  name                = ""
  address_space       = "10.0.0.0/16"
  resource_group_name = "'"
  location            = ""
}


#subnet

resource azurerm_subnet "subnet" {
  #name
  #rg
  #virtual_network_name
  #address_prefix="10.0.2.0/24"
}


#Vmss

resource resource "azurerm_virtual_machine_scale_set" "MyResource" {
  name                = "my-MyResource-name"
  location            = "West US"
  resource_group_name = "${azurerm_resource_group.test.name}"
  upgrade_policy_mode = "Manual" #Automatic


  sku {
    name     = "Standard_A0"
    tier     = "Standard"
    capacity = 1
  }

  os_profile {
    computer_name_prefix = "testvm"
    admin_username       = "myadmin"
    admin_password       = "Passwword1234"
  }

  os_profile_linux_config {
    disable_password_authentication = true
    ssh_keys {
      path     = "/home/myadmin/.ssh/authorized_keys"
      key_data = "${file("~/.ssh/demo_key.pub")}"
    }
  }

  network_profile {
    name    = "TestNetworkProfile"
    primary = true
    ip_configuration {
      name      = "TestIPConfiguration"
      subnet_id = "${azurerm_subnet.test.id}"
    }
  }

  storage_profile_os_disk {
    name           = "osDiskProfile"
    caching        = "ReadWrite"
    create_option  = "FromImage"
    vhd_containers = ["${azurerm_storage_account.test.primary_blob_endpoint}${azurerm_storage_container.test.name}"]
    #managed_disk_type = "Standard_LRS"
  }

  storage_profile_image_reference {
    publisher = "Canonical"
    offer     = "UbuntuServer"
    sku       = "18.04.2-LTS"
    version   = "latest"
  }
}

resource "azurerm_monitor_autoscale_setting" "scale_setting" {
  #name
  #rg
  #location
  target_resource_id = "${azurerm_virtual_machine_scale_set.vmss.id}"
  profile {
    name = "settingProfile"
    capacity {
      default = 1
      minimum = 1
      maximum = 2
    }
  }
  rule {
    metric_trigger {
      metric_name        = "PercentageCPU"
      metric_resource_id = "${azurerm_virtual_machine_scale_set.vmss.id}"
      time_grain         = "PT1M"
      statistic          = "Average"
      time_window        = "PT5M"
      time_aggregation   = "Average"
      operator           = "GreaterThan"
      threshold          = 90
    }
    scale_action {
      direction = "Increase"
      type      = "ChangeCount"
      value     = 1
      cooldown  = "PT1M"
    }
  }

  rule {
    metric_trigger {
      metric_name        = "PercentageCPU"
      metric_resource_id = "${azurerm_virtual_machine_scale_set.vmss.id}"
      time_grain         = "PT1M"
      statistic          = "Average"
      time_window        = "PT5M"
      time_aggregation   = "Average"
      operator           = "LessThan"
      threshold          = 10
    }
    scale_action {
      direction = "Decrease"
      type      = "ChangeCount"
      value     = 1
      cooldown  = "PT10M"
    }
  }
}
