## Convertidor de Monedas

Este proyecto consiste en un convertidor de monedas que permite a los usuarios convertir entre diferentes divisas utilizando tasas de cambio en tiempo real obtenidas de una API externa.

### Funcionalidades:

- Conversión entre diferentes pares de monedas, como peso mexicano a dólar, dólar a peso mexicano, peso mexicano a dólar canadiense, entre otros.
- Interfaz de usuario intuitiva con un menú de opciones para facilitar la selección de las monedas y la cantidad a convertir.
- Utiliza la API de Exchange Rate para obtener las tasas de cambio actualizadas automáticamente.

### Componentes del Proyecto:

- **`ConsultaMoneda`**: Clase encargada de realizar las consultas a la API externa y procesar las respuestas JSON para obtener las tasas de cambio entre diferentes monedas.
  
- **`ConvertirMoneda`**: Contiene métodos estáticos para realizar las conversiones de moneda utilizando las tasas de cambio obtenidas con `ConsultaMoneda`.
  
- **`Moneda`**: Un registro (record) que modela la información de la tasa de cambio entre dos monedas. Contiene campos para la moneda base, la moneda objetivo y la tasa de conversión.
  
- **`Principal`**: Clase principal del proyecto que contiene el método `main`. Se encarga de interactuar con el usuario, mostrar el menú de opciones y llamar a los métodos correspondientes en `ConvertirMoneda` según la opción seleccionada.

### Uso:

1. Ejecuta la clase `Principal` para iniciar el programa.
2. Selecciona el par de monedas entre los que deseas realizar la conversión.
3. Ingresa la cantidad que deseas convertir.
4. El programa mostrará el resultado de la conversión.
5. Puedes realizar más conversiones o salir del programa según desees.

### Requisitos:

- Java 11 o superior.
- Acceso a Internet para obtener las tasas de cambio de la API.

---

Si necesitas agregar más información sobre cómo configurar el proyecto, instrucciones de instalación, o cualquier otro detalle, no dudes en hacerlo.
