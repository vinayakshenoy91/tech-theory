module "aks" {
  source        = "Azure/aks/azurerm"
  version       = "2.0.0"
  CLIENT_ID     = "FROM AZURE  ACTIVE DIR"
  CLIENT_SECRET = "PASSword from command output"
  prefix        = "your-custom-resource-prefix"
}


#A aks install-cli
#az aks get-credentials --resource-group your-custom-resource --name your-custom-aks
