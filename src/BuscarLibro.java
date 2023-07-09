import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BuscarLibro extends JFrame {
    private JTextField campo;
    private JTextArea Despliegue;
    private JPanel busquedaLibro;
    private JButton Buscar;

    public BuscarLibro(){

        setContentPane(busquedaLibro);
        setTitle("Buscar Libro");
        setSize(450,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        Buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LecturaArchivos lectura = new LecturaArchivos();
                ArrayList<Libro> listaLibro = new ArrayList<>();
                lectura.leerArchivoLibros(listaLibro);
                BuscarLibro(listaLibro);
            }
        });
    }

    public void BuscarLibro(ArrayList<Libro> listaLibro){

        for (Libro aux : listaLibro) {

            if (aux.getISBN().trim().equals(campo.getText().trim())) {
                Despliegue.setText("Titulo: " + aux.getTitulo()
                        +  "\nAutor: " + aux.getAutor()
                        + "\nCategoría: " + aux.getCategoria()
                        + "\nNúmero de copias: " + aux.getStock()
                        + "\nNúmero de páginas: " + aux.getCantPaginas());
                return;
            }
        }

        JOptionPane.showMessageDialog(busquedaLibro, "ISBN Invalido");
    }
}
