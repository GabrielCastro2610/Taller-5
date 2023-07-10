import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BuscarLibro extends JFrame {
    private JTextField campo;
    private JTextArea Despliegue;
    private JPanel busquedaLibro;
    private JButton Buscar;
    private JButton volverButton;

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
                ArrayList<Libro> archivo = new ArrayList<>();
                lectura.leerArchivoLibros(archivo);
                BuscarLibro(archivo);
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

    public void BuscarLibro(ArrayList<Libro> listaLibro) {
        String isbn = campo.getText().trim();

        for (Libro aux : listaLibro) {
            if (aux.getISBN().trim().equals(isbn)) {
                String resultado = "Título: " + aux.getTitulo()
                        + "\nAutor: " + aux.getAutor()
                        + "\nCategoría: " + aux.getCategoria()
                        + "\nNúmero de copias: " + aux.getStock()
                        + "\nNúmero de páginas: " + aux.getCantPaginas();

                Despliegue.setText(resultado);
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "ISBN inválido");
    }

}
