
package implementacion;

/**
 *
 * @author Fabrizio Bolaño
 */
public interface InterfacePrototype <T extends InterfacePrototype> extends Cloneable {
    public T clone();
    public T deepClone();
}