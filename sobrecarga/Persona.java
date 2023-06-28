package poo.sobrecarga;

// Sobrecarga de métodos: Java los diferencia por los parámetros

public class Persona {

    // Atributos
    String nombre;
    int edad;
    String dni;

    // Método

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }

    public void correr(){
        System.out.println("Soy " + nombre + ", tengo " + edad +" años y estoy corriendo una maraton");
    }

    public void correr(int km){
        System.out.println("He corrido " + km +" Kilometros");
    }




}
