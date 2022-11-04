package view;

import javax.swing.*;
import java.awt.*;

/**
 * @author Jean Jacques N. Shimwa
 * @created 03-11-2022 - 1:11 PM
 */
public class MenuPrincipal extends JFrame{


    private JPanel panel1;

    public MenuPrincipal(String titulo) {
        super(titulo);
        setBounds(100,100,450,250);
        Container controlHost = getContentPane();
        controlHost.setLayout(new BorderLayout());
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
