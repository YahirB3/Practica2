import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Cola cola = new Cola();
        Pila pila = new Pila(); 
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú Principal");
            System.out.println("1. Encolar");
            System.out.println("2. Desencolar");
            System.out.println("3. Mostrar la Cola");
            System.out.println("4. Agregar elemento a la pila");
            System.out.println("5. Eliminar elemento de la pila");
            System.out.println("6. Mostrar elementos en la pila");
            System.out.println("que quieres hacer? ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa un numero: ");
                    int numero = scanner.nextInt();
                    cola.encolar(numero);
                    break;
                case 2:
                    cola.sacar();
                    break;
                case 3:
                    cola.mostrarCola();
                    break;
                    case 4:
                    System.out.print("Ingrese el elemento a agregar: ");
                    int elementoAgregar = scanner.nextInt();
                    pila.push(elementoAgregar);
                    break;
                case 5:
                    int elementoEliminar = pila.pop();
                    if (elementoEliminar != -1) {
                        System.out.println("Se eliminó el elemento de la pila: " + elementoEliminar);
                    }
                    break;
                case 6:
                    String pilalista = pila.laPila();
                        if (!pilalista.isEmpty()) {
                    System.out.println(pilalista);
                        } else {
                    System.out.println("La pila está vacía");
                        }
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

            System.out.println();
        } while (opcion != 0);

        scanner.close();
    }
}
