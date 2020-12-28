#Create a resource group

resource "azurerm_sql_server" "sql_server"{
    name=
    resource_group_name=
    location=
    version=
    administrator_login=
    administrator_login_password=
}

resource "azurerm_sql_database" "sql_db"{
    name=
    resource_group_name=
    location=
    server_name=
    edition="Basic"
    tags={

    }
}

resource "azurerm_sql_firewall_rule" "firewall"{
    #name
    #rg
    #server_name
    start_ip_address=
    end_ip_address=
}
