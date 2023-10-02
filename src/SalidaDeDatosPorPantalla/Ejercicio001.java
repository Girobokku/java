package SalidaDeDatosPorPantalla;

import javax.swing.*;

public class Ejercicio001 {
    public static void main(String[] args) {
        // System.out.println("\33[32mQuique");
        String userName = JOptionPane.showInputDialog("Introduce tu nombre: ");
        System.out.println(userName);
        JOptionPane.showMessageDialog(null,"Hola " +  userName);
    }
}