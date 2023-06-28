package poo.modificadores_acceso.paquete1;

public class Clase1 {
    // public: modificador de acceso que me permite acceder a la Clase1 desde cualquier paquete
    public int atributo1;
    private String nombre;

    // private: solo se puede usar por métodos de la Clase1
    private int atributo2;


    // Setters
    public void setEdad(int atributo2) {
        this.atributo2 = atributo2;
    }


    // Getters
    public int getEdad() {
        return atributo2;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }


}
