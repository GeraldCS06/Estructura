package recursividad2;

public class recursividad {

    public void imprime(int x) {
        if (x > 0) {
            System.out.printf("El numero es: %d\n", x);
            imprime(x - 1);
        }
    }

    public int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

}
