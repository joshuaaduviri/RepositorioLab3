public class Fibonacci {
    public static void main(String[] args) {
        int limite = 10; // Cantidad de números a generar en la serie
        int a = 0, b = 1;

        System.out.println("Serie de Fibonacci de " + limite + " elementos:");

        for (int i = 1; i <= limite; i++) {
            System.out.print(a + " ");
            
            // Calcular el siguiente valor
            int siguiente = a + b;
            a = b; // El primer número toma el valor del segundo
            b = siguiente; // El segundo número toma el valor de la suma
        }
    }
}
