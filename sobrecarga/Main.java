package poo.sobrecarga;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Gian", 35);
        persona1.correr();

        Persona persona2 = new Persona("42151496");
        persona2.correr(4);
    }
}
