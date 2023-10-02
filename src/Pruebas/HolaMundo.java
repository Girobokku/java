/*
Muestra por pantalla la frase "Hola mundo!"

@autor Quique Vázquez Peñamaría
*/

package Pruebas;

import javax.swing.*;

public class HolaMundo {
    public static void main(String[] args) {

        System.out.println("Hola mundo!");
        String nameUser = JOptionPane.showInputDialog("Introduce tu nombre:");
        JOptionPane.showMessageDialog(null,"Hola " + nameUser + "!");

    }
}
