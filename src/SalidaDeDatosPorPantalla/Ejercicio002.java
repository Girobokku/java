package SalidaDeDatosPorPantalla;

import javax.swing.*;

public class Ejercicio002 {
    public static void main(String[] args) {
        String userName = "Quique";
        String eMail = "vazquez.penamaria.enrique.ald@gmail.com";
        int phoneNumber = 686063158;

        JOptionPane.showMessageDialog(null, "Nombre de usuario: " + userName + "\nCorreo electrónico: " + eMail + "\nNúmero de teléfono: " + phoneNumber,"Información del usuario:",JOptionPane.INFORMATION_MESSAGE);
    }
}