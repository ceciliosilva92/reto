package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener {

    // Variables del JFrame
    protected JLabel optListar, optNuevaNave, optSalir;
    protected JButton btnListar, btnNuevaNave, btnSalir;

    public Menu() {

        // Constructor de JFrame
        JFrame f = new JFrame();

        //Opci�n Listar Naves
        optListar = new JLabel("Listar todas las naves");
        optListar.setFont(new Font("Arial", Font.PLAIN, 20));
        optListar.setSize(250, 25);
        optListar.setLocation(50, 50);
        f.add(optListar);

        btnListar = new JButton("Listar");
        btnListar.setFont(new Font("Arial", Font.PLAIN, 20));
        btnListar.setSize(100, 25);
        btnListar.setLocation(310, 50);
        f.add(btnListar);


        //Opci�n Nueva Nave
        optNuevaNave = new JLabel("Agregar nave");
        optNuevaNave.setFont(new Font("Arial", Font.PLAIN, 20));
        optNuevaNave.setSize(250, 25);
        optNuevaNave.setLocation(50, 80);
        f.add(optNuevaNave);

        btnNuevaNave = new JButton("Nuevo");
        btnNuevaNave.setFont(new Font("Arial", Font.PLAIN, 20));
        btnNuevaNave.setSize(100, 25);
        btnNuevaNave.setLocation(310, 80);
        f.add(btnNuevaNave);

        //Opci�n Salir
        optSalir = new JLabel("Finalizar Ejecuci�n");
        optSalir.setFont(new Font("Arial", Font.PLAIN, 20));
        optSalir.setSize(250, 25);
        optSalir.setLocation(50, 110);
        f.add(optSalir);

        btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Arial", Font.PLAIN, 20));
        btnSalir.setSize(100, 25);
        btnSalir.setLocation(310, 110);
        f.add(btnSalir);

        // Funci�n de salir o cerrar
        btnSalir.addActionListener(e -> {
            f.dispose();
        });

        // Funci�n Listar Naves
        btnListar.addActionListener(e -> {
            f.dispose();
            new ListarNaves();
        });

        // Funci�n de Nueva Nave
        btnNuevaNave.addActionListener(e -> {
            f.dispose();
            new NuevaNave();
        });

        // Definir los atributos del Frame
        f.setSize(480, 225);
        f.setLayout(null);
        f.setVisible(true);
        f.setTitle("Menu Principal");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
