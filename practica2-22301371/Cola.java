public class Cola {
    private Nodo inicio;
    private Nodo ultimo;

    public Cola() {
        inicio = null;
         ultimo = null;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void encolar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (estaVacia()) {
            inicio = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
        }
        System.out.println("Se ha agregado el número.");
    }

    public int sacar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return -1;
        }
        int dato = inicio.getDato();
        inicio = inicio.getSiguiente();
        if (inicio == null) {
            ultimo = null;
        }
        System.out.println("Se ha sacado el elemento: " + dato);
        return dato;
    }

    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Datos de la Cola:");
            Nodo temporal = inicio;
            while (temporal != null) {
            System.out.println(temporal.getDato());
            temporal = temporal.getSiguiente();
            }
        }
    }
}

