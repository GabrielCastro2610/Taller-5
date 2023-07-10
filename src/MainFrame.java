import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame{
    private JTextField tfRut;
    private JButton btnIs;
    private JButton btnCp;
    private JPasswordField tfContraseña;
    private JPanel mainPanel;

    public MainFrame () {

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
                Ingreso(listaUsuario);
            }


        });
        btnCp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                close();
            }
        });
    }

    public void Ingreso(ArrayList<Usuario> listaUsuario) {
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

    public void close() {

        System.exit(0);
    }


}


