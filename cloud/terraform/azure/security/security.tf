resource "azurerm_network_security_group" "security" {
  name                = "mySecurtityGroup"
  location            = "${var.location}"
  resource_group_name = "${azure_resource_group.main.name}"
  security_rule {
    name                       = "ssh"
    priority                   = 100
    direction                  = "Inbound"
    access                     = "Allow"
    protocal                   = "Tcp"
    source_address_prefix      = "*"
    source_port_range          = "*"
    destination_address_prefix = "*"
    destination_port_ranges    = ["22"]
  }

}
