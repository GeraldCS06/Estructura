package recursividad2;

public class main {

    public static void main(String[] args) {
        recursividad recursividad = new recursividad();
        //recursividad.imprime(5);
        int factorial = recursividad.fact(5);
        System.out.printf("El factorial es: %d\n", factorial);
    }
}
