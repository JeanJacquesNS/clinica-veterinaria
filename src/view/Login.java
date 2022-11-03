package view;

import com.sun.xml.internal.ws.util.StringUtils;
import controller.UtilizadorController;
import model.valueObject.UtilizadorVO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * @author Jean Jacques N. Shimwa
 * @created 03-11-2022 - 12:26 PM
 */
public class Login {
    private JPanel principal;
    private JTextField textNome;
    private JPasswordField jpassword;
    private JButton btnLogar;

    UtilizadorController utilizadorController;

    public Login() {
        utilizadorController= new UtilizadorController();
        btnLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validar())
                   if(utilizadorController.confere(textNome.getText(),String.valueOf(jpassword.getPassword())))
                       JOptionPane.showMessageDialog(null, "O utilizador Existe!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

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
        JFrame frame = new JFrame("Sistema de Gestão de Clinica Veterinaria");
        frame.setContentPane(new Login().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
