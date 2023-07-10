import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PrestarLibro extends JFrame {
    private JPanel prestar;
    private JTextField campo;
    private JButton boton;
    private JButton volverButton;

    public PrestarLibro(){
        setContentPane(prestar);
        setTitle("Prestar Libro");
        setSize(450, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LecturaArchivos lectura = new LecturaArchivos();
                ArrayList<Libro> listaLibro = new ArrayList<>();
                lectura.leerArchivoLibros(listaLibro);
                pedirLibro(listaLibro);
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

    public void pedirLibro(ArrayList<Libro> listaLibro) {
        String isbn = campo.getText().trim();

        for (Libro aux : listaLibro) {
            if (aux.getISBN().equals(isbn)) {
                if (aux.getStock() > 0) {
                    JOptionPane.showMessageDialog(this, "Libro '" + aux.getTitulo() + "' prestado correctamente.");
                    aux.setStock(aux.getStock() - 1);
                    new LecturaArchivos().agregarLibro(listaLibro);
                    return;
                } else {
                    JOptionPane.showMessageDialog(this, "No hay stock de este libro.");
                    return;
                }
            }
        }

        JOptionPane.showMessageDialog(this, "Ingrese ISBN válido.");
    }
}
