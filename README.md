# gestion_tarjetas_backend
### Clientes
```sh
GET https://gestion-tarjetas-ibm.herokuapp.com/api/clientes/
GET https://gestion-tarjetas-ibm.herokuapp.com/api/clientes/{id}
DELETE https://gestion-tarjetas-ibm.herokuapp.com/api/clientes/{id}
PUT https://gestion-tarjetas-ibm.herokuapp.com/api/clientes/
{
  	"id": 1
	"nombre": "Brayan",
	"direccion": "calle 30 77-12",
	"ciudad": "Medellin",
	"telefono": "3214361170"
}
POST https://gestion-tarjetas-ibm.herokuapp.com/api/clientes/
{
	"nombre": "Brayan",
	"direccion": "calle 30 77-12",
	"ciudad": "Medellin",
	"telefono": "3214361170"
}

```

### Asesores
```sh
GET https://gestion-tarjetas-ibm.herokuapp.com/api/asesores/
GET https://gestion-tarjetas-ibm.herokuapp.com/api/asesores/{id}
DELETE https://gestion-tarjetas-ibm.herokuapp.com/api/asesores/{id}
PUT https://gestion-tarjetas-ibm.herokuapp.com/api/asesores/
{
  	"id": 1
	"nombre": "Brayan",
	"especialidad": "Tarjetas"
}
POST https://gestion-tarjetas-ibm.herokuapp.com/api/asesores/
{
	"nombre": "Brayan",
	"especialidad": "Tarjetas"
}

```
