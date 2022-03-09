public class numero {
    public static void main(String[] args) {
        //asignacion de variable flotante
        double numeroPi = 3.14;

        //asignacion variable parteDecimalPi y
        //obtengo el modolo 1 de numeroPi
        double parteDecimalPi = numeroPi % 1;

        //asignacion variable parteEnteraPi, restando a numeroPi su parte decimal
        double parteEnteraPi = numeroPi - parteDecimalPi;

        //imprimo resultados
        System.out.println("La parte entera de Pi es: " + (int) parteEnteraPi);
        System.out.println(" ");
        System.out.println("La parte decimal de Pi es: " + parteDecimalPi);
    }
}
