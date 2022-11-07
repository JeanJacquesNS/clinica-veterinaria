package view;

import javax.swing.*;
import java.awt.*;

/**
 * @author Jean Jacques N. Shimwa
 * @created 03-11-2022 - 1:11 PM
 */
public class MenuPrincipal extends JFrame {


    private JPanel panel1;
    private JMenuBar jmenubar;
    private JMenu JMenuRegistos,JSubMenuRegistos;
    private JMenuItem JMenuItemAnimal,JMenuItemDono,JMenuItemFuncionario;


    public MenuPrincipal() {
    }

    public MenuPrincipal(String titulo) {
        super(titulo);
        jmenubar=new JMenuBar();
        JSubMenuRegistos=new JMenu();
        JMenuRegistos=new JMenu("Registos");
        JMenuItemAnimal=new JMenuItem("Animal");
        JMenuItemDono=new JMenuItem("Dono");
        JMenuItemFuncionario=new JMenuItem("Funcionario");
        setBounds(100, 100, 750, 550);
        Container controlHost = getContentPane();
        controlHost.setLayout(new BorderLayout());
        setJMenuBar(jmenubar);
        JMenuRegistos.add(JMenuItemAnimal);
        JMenuRegistos.add(JMenuItemDono);
        JMenuRegistos.add(JMenuItemFuncionario);
        JSubMenuRegistos.add(JSubMenuRegistos);
        jmenubar.add(JMenuRegistos);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
