package poo.constructor;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        Operacion op = new Operacion();

        System.out.println("SUMA: "+op.sumar(n1, n2));
        System.out.println("RESTA: "+op.restar(n1, n2));
        System.out.println("MULTIPLICACIÓN: "+op.multiplicar(n1, n2));
        System.out.println("DIVISIÓN: "+op.dividir(n1, n2));

    }
}
