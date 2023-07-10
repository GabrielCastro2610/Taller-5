import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Esta clase representa la interfaz gráfica principal de la aplicación.
 */
public class MainFrame extends JFrame {
    private JTextField tfRut;
    private JButton btnIs;
    private JButton btnCp;
    private JPasswordField tfContraseña;
    private JPanel mainPanel;

    /**
     * Constructor de la clase MainFrame.
     */
    public MainFrame() {
        setContentPane(mainPanel);
        setTitle("Bienvenido");
        setSize(450,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnIs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LecturaArchivos lectura = new LecturaArchivos();
                ArrayList<Usuario> listaUsuario = new ArrayList<>();
                lectura.leerArchivoUsuarios(listaUsuario);
                ingresar(listaUsuario);
            }
        });

        btnCp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                close();
            }
        });
    }

    /**
     * Realiza el ingreso de un usuario.
     *
     * @param listaUsuario La lista de usuarios existente.
     */
    public void ingresar(ArrayList<Usuario> listaUsuario) {
        String rut = tfRut.getText().trim();
        String contraseña = new String(tfContraseña.getPassword());

        if (!rut.isEmpty() && !contraseña.isEmpty()) {
            for (Usuario u : listaUsuario) {
                if (u.getRut().equals(rut) && u.getContraseña().equals(contraseña)) {
                    MenuPrincipal menu = new MenuPrincipal();
                    menu.setVisible(true);
                    dispose();
                    return;
                }
            }

            JOptionPane.showMessageDialog(this, "Rut o contraseña inválido.");
        } else {
            JOptionPane.showMessageDialog(this, "Campos inválidos, por favor vuelva a intentarlo.");
        }
    }

    /**
     * Cierra la aplicación.
     */
    public void close() {
        System.exit(0);
    }
}


