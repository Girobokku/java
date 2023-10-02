package SalidaDeDatosPorPantalla;

import javax.swing.*;
import java.awt.*;

public class Ejercicio003 {
    public static void main(String[] args) {
        String formattedMessage = String.format("%-20s %-20s\n%-20s %-20s\n%-20s %-20s\n%-20s %-20s\n%-20s %-20s\n%-20s %-20s\n%-20s %-20s\n%-20s %-20s\n%-20s %-20s",
                "computer", "ordenador",
                "student", "alumno/a",
                "cat", "gato",
                "penguin", "pingüino",
                "machine", "máquina",
                "light", "luz",
                "green", "verde",
                "book", "libro",
                "pyramid", "pirámide");

        JTextArea textArea = new JTextArea(formattedMessage);
        textArea.setFont(new java.awt.Font("Monospaced", 0, 12));  // Fuente monoespaciada
        textArea.setEditable(false);  // Asegúrate de que no sea editable
        textArea.setOpaque(false);  // Hace que sea transparente

        JOptionPane.showMessageDialog(null, textArea, "Exercise 3", JOptionPane.INFORMATION_MESSAGE);
    }
}
