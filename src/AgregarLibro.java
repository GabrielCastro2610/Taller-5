import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AgregarLibro extends JFrame {
    private JTextField  campoISBN;
    private JTextField campoTitulo;
    private JTextField campoAutor;
    private JTextField campoCategoria;
    private JTextField campoPaginas;
    private JTextField campoStock;
    private JButton agregarBoton;
    private JPanel agregar;
    private JButton volverAtrasButton;

    public AgregarLibro(){
        setContentPane(agregar);
        setTitle("Agregar libro");
        setSize(450, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        agregarBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LecturaArchivos archivo = new LecturaArchivos();
                ArrayList<Libro> listaLibro = new ArrayList<>();
                archivo.leerArchivoLibros(listaLibro);
                AgregarLibro(listaLibro);
            }
        });
        volverAtrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MenuPrincipal menu = new MenuPrincipal();
                dispose();
            }
        });
    }

    public void AgregarLibro(ArrayList<Libro> listaLibro) {
        String isbn = campoISBN.getText().trim();
        String titulo = campoTitulo.getText().trim();
        String autor = campoAutor.getText().trim();
        String categoria = campoCategoria.getText().trim();
        int paginas = 0;
        int stock = 0;

        try {
            paginas = Integer.parseInt(campoPaginas.getText().trim());
            stock = Integer.parseInt(campoStock.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "1 o más campos inválidos.");
            return;
        }

        if (isbn.length() == 13 && !titulo.isEmpty() && !autor.isEmpty() && !categoria.isEmpty() && paginas > 0 && stock > 0) {
            for (Libro aux : listaLibro) {
                if (aux.getISBN().trim().equals(isbn)) {
                    JOptionPane.showMessageDialog(this, "ISBN ya en el sistema.");
                    return;
                }
            }

            Libro libro = new Libro(isbn, titulo, autor, categoria, paginas, stock);
            listaLibro.add(libro);

            LecturaArchivos lectura = new LecturaArchivos();
            lectura.agregarLibro(listaLibro);

            JOptionPane.showMessageDialog(this, "Libro agregado correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "1 o más campos inválidos.");
        }
    }

}
