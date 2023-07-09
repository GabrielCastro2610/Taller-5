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

    public AgregarLibro(){
        setContentPane(agregar);
        setTitle("Agregar libro");
        setSize(450, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        // Funcionamiento boton "agregar libro"
        agregarBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LecturaArchivos lectura = new LecturaArchivos();
                ArrayList<Libro> listaLibro = new ArrayList<>();
                lectura.leerArchivoLibros(listaLibro);
                AgregarLibro(listaLibro);
            }
        });
    }

    public void AgregarLibro(ArrayList<Libro> listaLibro){

    }
}
