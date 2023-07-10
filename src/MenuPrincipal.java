import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Esta clase representa la interfaz gráfica del menú principal de la aplicación.
 */
public class MenuPrincipal extends JFrame {
    private JButton buscarLibroButton;
    private JButton prestarLibroButton;
    private JButton agregarNuevoLibroButton;
    private JButton devolverLibroButton;
    private JPanel menu;
    private JButton cerrarSesionButton;

    /**
     * Constructor de la clase MenuPrincipal.
     */
    public MenuPrincipal() {
        setContentPane(menu);
        setTitle("Menu");
        setSize(450,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        // Buscar libro
        buscarLibroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuscarLibro buscarLibro = new BuscarLibro();
                dispose();
            }
        });

        // Prestar Libro
        prestarLibroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrestarLibro prestarLibro = new PrestarLibro();
                dispose();
            }
        });

        // Agregar nuevo libro
        agregarNuevoLibroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AgregarLibro agregarLibro = new AgregarLibro();
                dispose();
            }
        });

        // Devolver libro
        devolverLibroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DevolverLibro devolverLibro = new DevolverLibro();
                dispose();
            }
        });

        // Cerrar sesión
        cerrarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame inicio = new MainFrame();
                dispose();
            }
        });
    }
}


