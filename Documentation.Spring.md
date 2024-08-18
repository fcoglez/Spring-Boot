## Anotaciones - Etiquetas @ de SpringBoot

- @Controller -> en una clase Java le indica a Spring que esa clase manejará solicitudes HTTP y enviará respuestas, actuando como un controlador en el patrón MVC.  


- @RestController -> le indica a Spring que la clase manejará solicitudes HTTP y enviará respuestas, pero a diferencia de @Controller, se especializa en servicios REST. Combina las anotaciones @Controller y @ResponseBody, lo que significa que los métodos devolverán directamente datos (como JSON o XML) en lugar de vistas o páginas HTML.  
 

- @GetMapping -> simplifica la forma de manejar solicitudes GET en aplicaciones Spring.  


- @RequestMapping -> puedes usar `@RequestMapping` para mapear solicitudes HTTP a métodos específicos en un controlador, lo que proporciona flexibilidad para manejar diferentes tipos de solicitudes y rutas en tu aplicación.  
 
