provider "azurerm" {}


respurce "azure_resource_group" "storage" {
  name     = "storageresourcegroup"
  location = "UK SOUTH"
}

resource azurerm_storage_account account {
  name                     = "${azure_resource_group.storage.name}"
  location                 = "${azure_resource_group.storage.location}"
  resource_group_name      = "${azure_resource_group.main.name}"
  account_tier             = "Standard"
  account_replication_type = "LRS"

}


resource "azurerm_storage_container" "container" {
  name                  = "testcontainer"
  location              = "${azure_resource_group.storage.location}"
  storage_account_name  = "${azurerm_storage_account.account.name}"
  container_access_type = "private"
}

resource "azurerm_storage_blob" "blob" {
  name                   = "udemytestblob"
  resource_group_name    = "${azurerm_resource_group.storage.name}"
  storage_account_name   = "${azurerm_storage_account.account.name}"
  storage_container_name = "${azurerm_storage_container.container.name}"
  type                   = "page"
  size                   = "5120"
}


resource "azurerm_storage_share" "share" {
  name                 = "testshared"
  storage_account_name = "${azurerm_storage_account.account.name}"
  quota                = 50
}
