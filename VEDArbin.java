package escenario.siete;

/*
Nombres:
Santiago Posada Garcia
Angelo Acevedo Cano
Santiago Garcia Castañeda
*/
public class VEDArbin<E> { // Declaracion de la clase

    // Atributos de la clase
    protected E val;
    protected VEDArbin<E> izq;
    protected VEDArbin<E> der;

    // Constructor para arbol vacío
    public VEDArbin() {
        val = null;
        izq = null;
        der = null;
    }

    // Constructor para arbol no vacío
    public VEDArbin(E pVal, VEDArbin<E> pIzq, VEDArbin<E> pDer) {
        if (pVal == null){
            throw new NullPointerException("¡Un árbol no vacío debe tener raíz!");
        }
        if (pIzq == null){
            throw new NullPointerException("¡Un árbol no vacío necesita subárbol izquierdo!");
        }
        if (pDer == null){
            throw new NullPointerException("¡Un árbol no vacío necesita subárbol derecho!");
        }

        // Inicializamos los atributos del arbol
        val = pVal;
        izq = pIzq;
        der = pDer;
    }

    // Metodo para consultar si esta vacio el arbol
    public boolean esVacio() {
        return val == null;
    }


    /*3. Desarrolle una solución la cual deberá contener un metodo que recibe como parámetro
    de entrada un árbol binario y retorne la cantidad de nodos del árbol ingresado.*/

    //Este es un metodo de la calse VEDArbin, por ende, se llama cuando se crea en el Main un arbol
    public int cantidadNodos() {
        if (esVacio()) {
            return 0; // // Si es vacio, su cantidad de nodos es 0
        } else {
            /* Metodo recursivo que suma el nodo y los nodos de izquierda y derecha
             Cuando se llama al nodo izq y der, analiza nuevamente si es vacio y si tiene hijos los suma.*/
            return 1 + izq.cantidadNodos() + der.cantidadNodos();
        }
    }
}