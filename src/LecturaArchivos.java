import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Marcelo Céspedes.
 */
public class LecturaArchivos {

    /*
        Para la correcta lectura de los archivos, estos deben estan en la carpeta del proyecto, fuera
        de la carpeta "src".
     */

    /**
     * Método encargado de leer el archivo de "libros.txt".
     */
    public ArrayList leerArchivoLibros(ArrayList<Libro> Libro) {

        // Leer el archivo "libros.txt"
        try (BufferedReader br = new BufferedReader(new FileReader("libros.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] chain = line.split(",");
                String isbn = chain[0];
                String title = chain[1];
                String author = chain[2];
                String category = chain[3];
                int copies = Integer.parseInt(chain[4]);
                int stock = Integer.parseInt(chain[5]);

                Libro libro = new Libro(isbn, title, author, category, copies, stock);
                Libro.add(libro);
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return Libro;
    }

    /**
     * Método encargado de leer el archivo de "usuarios.txt".
     */
    public ArrayList leerArchivoUsuarios(ArrayList<Usuario> Usuario) {

        // Leer el archivo "usuarios.txt"
        try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] chain = line.split(",");
                String rut = chain[0];
                String name = chain[1];
                String lastname = chain[2];
                String password = chain[3];

                Usuario usuaio = new Usuario(rut, name, lastname, password);
                Usuario.add(usuaio);

            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return Usuario;
    }
}