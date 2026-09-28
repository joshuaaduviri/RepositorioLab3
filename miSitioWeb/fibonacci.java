public class fibonacci {

    // Algoritmo recursivo para la serie de Fibonacci
    public static int fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    public static void main(String[] args) {
        int limite = 10; 
        System.out.println("Serie de Fibonacci (Algoritmo Recursivo) para " + limite + " términos:");
        
        for (int i = 0; i < limite; i++) {
            System.out.print(fibonacciRecursivo(i) + " ");
        }
        System.out.println();
    }
}
