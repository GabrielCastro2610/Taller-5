import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JTextField tfRut;
    private JButton btnIs;
    private JButton btnCp;
    private JPasswordField tfContraseña;
    private JPanel mainPanel;

    public MainFrame () {

        setContentPane(mainPanel);
        setTitle("Bienvenido");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        btnIs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String rut = tfRut.getText();
                String contraseña = tfContraseña.getText();

            }


        });
        btnCp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                
            }
        });
    }

    public static void main(String[] args) {

        MainFrame myFrame = new MainFrame();
    }


}


