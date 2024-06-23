Este proyecto es un conversor de monedas desarrollado como un desafío para conectar y consumir una API externa. El objetivo principal es demostrar la capacidad de integrar servicios web externos en una aplicación Java, proporcionando una herramienta práctica para la conversión de diferentes monedas utilizando tasas de cambio en tiempo real.

Tecnologías Utilizadas
Java: Lenguaje de programación principal utilizado para desarrollar la aplicación.
IntelliJ IDEA: Entorno de desarrollo integrado (IDE) utilizado para escribir y gestionar el código.
Maven: Herramienta de gestión de dependencias y automatización de compilación.
Unirest: Biblioteca de Java utilizada para realizar solicitudes HTTP a la API de ExchangeRate.
ExchangeRate-API: API externa que proporciona tasas de cambio en tiempo real entre diferentes monedas.
Gson: Biblioteca para el manejo de JSON en Java.
Estructura del Proyecto
El proyecto se organiza en las siguientes clases y paquetes:

Config.java

Ubicación: config
Descripción: Clase que contiene las configuraciones necesarias para la API, incluyendo la clave de API y la URL base.
APIClient.java

Ubicación: api
Descripción: Clase responsable de realizar las solicitudes HTTP a la API de ExchangeRate y manejar las respuestas.
CurrencyConverter.java

Ubicación: converter
Descripción: Clase que utiliza el APIClient para obtener las tasas de cambio y realizar la conversión de montos entre diferentes monedas.
ConversorDeMonedas.java

Ubicación: raíz del proyecto
Descripción: Clase principal que proporciona la interfaz de usuario en la consola, permitiendo al usuario ingresar la moneda de origen, la moneda de destino y el monto a convertir.
Funcionalidades
Inicialización y Configuración: Configuración de la clave de API y la URL base para conectar con la API de ExchangeRate.
Interfaz de Usuario en Consola: Solicita al usuario la moneda de origen, la moneda de destino y el monto a convertir.
Consulta de Tasas de Cambio: Realiza una solicitud HTTP a la API de ExchangeRate para obtener las tasas de cambio en tiempo real.
Conversión de Monedas: Calcula el monto convertido utilizando las tasas de cambio obtenidas de la API.
Manejo de Errores: Captura y muestra mensajes de error en caso de que la solicitud a la API falle.
