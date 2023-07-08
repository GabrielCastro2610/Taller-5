import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

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
        try {

            String rut = tfRut.getText();
            String contraseña = new String(tfContraseña.getPassword());

            if (!rut.isEmpty() && !contraseña.isEmpty()) {
                for (Usuario u : listaUsuario) {
                    if (u.getRut().equals(rut) && u.getContraseña().equals(contraseña)) {
                        MenuPrincpal menu = new MenuPrincpal();
                        dispose();
                        //LinkedList<Usuario> usuarioActivo = new LinkedList<>();
                        //usuarioActivo.add(u);
                        System.out.println(u);
                        return;
                    }
                }

                JOptionPane.showMessageDialog(mainPanel, "Rut o contraseña inválido.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(mainPanel, "Campos invalidos, por favor vuelva a intentarlo");
        }
    }
    public void close() {

        System.exit(0);
    }


}


