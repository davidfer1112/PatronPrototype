# Documentación del Repositorio PatronPrototype

## Descripción

El repositorio PatronPrototype implementa el patrón de diseño Prototype en Java. Este patrón permite clonar objetos existentes sin que el código dependa de sus clases. En este proyecto, se utiliza para crear diferentes listas de precios de productos, variando el porcentaje de IVA aplicado, sin necesidad de crear los objetos desde cero.

## Estructura del Proyecto

El proyecto está estructurado de la siguiente manera:

- `src/main/java/implementacion`: Contiene las clases principales del proyecto.
  - `CatalogoProductos.java`: Define los productos con su nombre y precio.
  - `ListaPrecios.java`: Define una lista de productos y permite clonar esta lista.
- `src/main/java/patronprototype`: Contiene la clase principal que ejecuta el ejemplo del patrón Prototype.
  - `PatronPrototypeMain.java`: Implementa el ejemplo de uso del patrón Prototype creando diferentes listas de precios con distintos IVAs aplicados.
- `pom.xml`: Archivo de configuración de Maven para gestionar las dependencias y la construcción del proyecto.

## Cómo Funciona

El proyecto define dos clases principales, `CatalogoProductos` y `ListaPrecios`, que implementan la interfaz `InterfacePrototype`, permitiendo así su clonación.

### CatalogoProductos

Esta clase representa un producto con un nombre y un precio. Implementa métodos para clonar el objeto producto.

```java
public class CatalogoProductos implements InterfacePrototype<CatalogoProductos> {
    // Constructor, getters, setters y métodos clone y deepClone
}
```

### ListaPrecios

Representa una lista de productos (`CatalogoProductos`). Permite agregar productos a la lista y clonar la lista completa, incluyendo una clonación profunda que duplica cada producto en la lista.

```java
public class ListaPrecios implements InterfacePrototype<ListaPrecios> {
    // Constructor, getters, setters, métodos para agregar productos y métodos clone y deepClone
}
```

### Ejemplo de Uso

El archivo `PatronPrototypeMain.java` muestra cómo utilizar estas clases para crear una lista de precios estándar y luego clonarla para aplicar diferentes porcentajes de IVA, generando nuevas listas sin modificar la original.

```java
public class PatronPrototypeMain {
    public static void main(String[] args) {
        // Creación y clonación de listas de precios con diferentes IVAs
    }
}
```


