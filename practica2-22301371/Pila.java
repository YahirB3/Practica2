public class Pila {
    private Nodo inicio; 

    public Pila() {
        this.inicio = null;
    }
    public boolean isEmpty() {
        return inicio == null;
    }
    public void push(int dato) {
        Nodo nuevo = new Nodo(dato); 
        if (isEmpty()) {
            inicio = nuevo; 
        } else {
            nuevo.setSiguiente(inicio); 
            inicio = nuevo;
        }
        System.out.println("Se agregó el elemento a la pila: " + dato);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return -1; 
        } else {
            int dato = inicio.getDato(); 
            inicio = inicio.getSiguiente(); 
            return dato; 
        }
    }
    public int push() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return -1; 
        } else {
            return inicio.getDato(); 
        }
    }

    /**
     *
     * @return
     */
    public String laPila() {
    StringBuilder sb = new StringBuilder();
    Nodo actual = inicio;
    sb.append("Pila: ");
    while (actual != null) {
        sb.append(actual.getDato()).append(" ");
        actual = actual.getSiguiente();
    }
    return sb.toString();
}
}
