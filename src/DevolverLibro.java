import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Esta clase representa la interfaz gráfica para devolver un libro del sistema.
 */
public class DevolverLibro extends JFrame {
    private JTextField campoISBN;
    private JButton devolverButton;
    private JPanel devolverPanel;
    private JButton volverButton;

    /**
     * Constructor de la clase DevolverLibro.
     */
    public DevolverLibro() {
        setContentPane(devolverPanel);
        setTitle("Devolver Libro");
        setSize(450,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        devolverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LecturaArchivos lectura = new LecturaArchivos();
                ArrayList<Libro> listaLibro = new ArrayList<>();
                lectura.leerArchivoLibros(listaLibro);
                devolverLibro(listaLibro);
            }
        });

        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuPrincipal menu = new MenuPrincipal();
                dispose();
            }
        });
    }

    /**
     * Realiza la devolución de un libro.
     *
     * @param listaLibro La lista de libros existente.
     */
    public void devolverLibro(ArrayList<Libro> listaLibro) {
        String isbn = campoISBN.getText().trim();

        for (Libro libro : listaLibro) {
            if (libro.getISBN().trim().equals(campoISBN.getText().trim())) {
                libro.setStock(libro.getStock() + 1);

                LecturaArchivos lectura = new LecturaArchivos();
                lectura.agregarLibro(listaLibro);

                JOptionPane.showMessageDialog(this, "Devolución del libro '" + libro.getTitulo() + "' exitosa");
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "ISBN inválido");
    }

}

