package SalidaDeDatosPorPantalla;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

public class Ejercicio004 {

    // Método estático para crear una celda
    private static JLabel createCell(String text) {
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setBorder(new LineBorder(Color.BLACK, 1));
        label.setOpaque(true);
        label.setBackground(Color.WHITE);
        return label;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Horario de clase");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(11, 5));  // 11 filas, 5 columnas

        // Encabezado
        panel.add(createCell("Lunes"));
        panel.add(createCell("Martes"));
        panel.add(createCell("Miércoles"));
        panel.add(createCell("Jueves"));
        panel.add(createCell("Viernes"));

        // Contenido
        String[][] horario = {
                {"Libre", "ProMulMob", "AccDat", "Inglés", "Libre"},
                {"ProMulMob", "ProMulMob", "AccDat", "Inglés", "AccDat"},
                {"ProMulMob", "EmpInEmp", "EmpInEmp", "ProMulMob", "AccDat"},
                {"RECREO", "RECREO", "RECREO", "RECREO", "RECREO"},
                {"ProMulMob", "DesInt", "EmpInEmp", "ProMulMob", "AccDat"},
                {"ProSerPro", "DesInt", "DesInt", "AccDat", "DesInt"},
                {"ProSerPro", "AccDat", "DesInt", "SisXesEmp", "DesInt"},
                {"RECREO", "RECREO", "RECREO", "RECREO", "RECREO"},
                {"AccDat", "ProSerPro", "DesInt", "SisXesEmp", "SisXesEmp"},
                {"AccDat", "ProSerPro", "DesInt", "SisXesEmp", "SisXesEmp"}
        };

        for (String[] fila : horario) {
            for (String celda : fila) {
                panel.add(createCell(celda));
            }
        }

        frame.add(panel);
        frame.setVisible(true);
    }
}
