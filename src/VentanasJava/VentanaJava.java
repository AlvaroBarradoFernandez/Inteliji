package VentanasJava;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VentanaJava {
    private JPanel panel1;
    private JTextField tfNombre;
    private JTextField tfApelldos;
    private JButton Registrar;
    private JButton Cancelar;
    private JTextField tfNacimiento;
    private JTable table1;


    public VentanaJava() {
        Registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        System.out.print("Has pulsado el boton");
            }
        });
        Cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaJava");
        frame.setContentPane(new VentanaJava().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
