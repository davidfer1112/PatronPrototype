/*
 * Asignatura: Patrones de Diseño de Software
 * Patrón Creacional - > Prototype
 * Tipo de Clase: Main()
 */
package patronprototype;

import implementacion.CatalogoProductos;
import implementacion.FabricaPrototype;
import implementacion.ListaPrecios;
/**
 *
 * @author Fabrizio Bolaño
 */
public class PatronPrototypeMain {

    public static void main(String[] args) {

        // Creación de la Lista Inicial de Precios
        ListaPrecios listadoEstandar = new ListaPrecios("Lista Estándar de Precios");
        for(int c = 1; c<=5; c++){
            CatalogoProductos item = new CatalogoProductos("Producto " + c, c*2);
            listadoEstandar.addCatalogoItem(item);
        }

        // Agregamos la lista estándar al prototipo
        FabricaPrototype.addPrototype(listadoEstandar.getListado(), listadoEstandar);

        // Clonación para la lista con 19% de IVA
        ListaPrecios listaCon19IVA = (ListaPrecios)
                FabricaPrototype.getPrototype("Lista Estándar de Precios");
        listaCon19IVA.setListado("Listado de Precios con 19% de IVA");

        for(CatalogoProductos item : listaCon19IVA.getProductos()){
            item.setPrecioProducto(item.getPrecioProducto() * 1.19);
        }

        // Clonación para la lista con 5% de IVA
        ListaPrecios listaCon5IVA = (ListaPrecios)
                FabricaPrototype.getPrototype("Lista Estándar de Precios");
        listaCon5IVA.setListado("Listado de Precios con 5% de IVA");

        for(CatalogoProductos item : listaCon5IVA.getProductos()){
            item.setPrecioProducto(item.getPrecioProducto() * 1.05);
        }

        // Imprimimos las diferentes listas
        System.out.println(listadoEstandar);
        System.out.println(listaCon19IVA);
        System.out.println(listaCon5IVA);
    }
}

