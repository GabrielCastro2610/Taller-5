import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PrestarLibro extends JFrame {
    private JPanel prestar;
    private JTextField campo;
    private JButton boton;

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
    }

    public void pedirLibro(ArrayList<Libro> listaLibro){

        for (Libro aux : listaLibro) {

        }
        // Si no existe el ISBN de entrada de texto abre una ventana de error
        JOptionPane.showMessageDialog(prestar, "Ingrese ISBN válido.");
    }
}
