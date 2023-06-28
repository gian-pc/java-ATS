package poo.Estatico;
// Mienbros estáticos de una clase
public class Estatico {

    private static String frase = "Primera frase";

    public static int sumar(int a, int b) {
        int suma = a + b;
        return suma;
    }

    public static void main(String[] args) {
        System.out.println(Estatico.frase);
        System.out.println("La suma es: " + Estatico.sumar(3,4));

    }

}
