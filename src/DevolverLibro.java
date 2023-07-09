import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

public class DevolverLibro extends JFrame {
    private JPanel panel1;
    private JTextField campoISBN;
    private JButton devolver;

    public DevolverLibro() {

        setContentPane(devolver);
        setTitle("Devolver Libro");
        setSize(450,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        devolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LecturaArchivos lectura = new LecturaArchivos();
                ArrayList<Libro> listaLibro = new ArrayList<>();
                lectura.leerArchivoLibros(listaLibro);
                DevolverLibro(listaLibro);
            }
        });

    }

    public void DevolverLibro(ArrayList<Libro> listaLibro){

        JOptionPane.showMessageDialog(devolver, "ISBN inválido");
    }
}
