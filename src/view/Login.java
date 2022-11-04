package view;

import com.sun.xml.internal.ws.util.StringUtils;
import controller.UtilizadorController;
import model.valueObject.UtilizadorVO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Objects;

/**
 * @author Jean Jacques N. Shimwa
 * @created 03-11-2022 - 12:26 PM
 */
public class Login extends JFrame {
    private JPanel principal;
    private JTextField textNome;
    private JPasswordField jpassword;
    private JButton btnLogar;

    UtilizadorController utilizadorController;

    static JFrame frame;
    static String titulo="Sistema de Gestão de Clinica Veterinaria";
    public Login() {
        utilizadorController= new UtilizadorController();
        btnLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validar())
                   if(utilizadorController.confere(textNome.getText(),String.valueOf(jpassword.getPassword()))) {
                       MenuPrincipal menuPrincipal= new MenuPrincipal(titulo);
                       menuPrincipal.setVisible(Boolean.TRUE);
                       frame.dispatchEvent(new WindowEvent(frame,WindowEvent.WINDOW_CLOSING));
                       frame.setVisible(Boolean.FALSE);

                   }
//                       JOptionPane.showMessageDialog(null, "O utilizador Existe!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

            }
        });
    }
    private Boolean validar(){
        if (String.valueOf(jpassword.getPassword()).matches("\\s*")){
            JOptionPane.showMessageDialog(null, "Introduz a password!", "Erro!", JOptionPane.INFORMATION_MESSAGE);
            jpassword.requestFocus();
            return Boolean.FALSE;
        }
        if (textNome.getText().matches("\\s*")){
            JOptionPane.showMessageDialog(null, "Introduz o nome de utilizador!", "Erro!", JOptionPane.INFORMATION_MESSAGE);
            textNome.requestFocus();
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
    public static void main(String[] args) {
        frame = new JFrame(titulo);
        frame.setContentPane(new Login().principal);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
