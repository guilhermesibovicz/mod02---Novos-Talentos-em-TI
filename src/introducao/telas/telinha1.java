package introducao.telas;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

//BORDERLAYOUT
public class telinha1 extends JFrame {
    public telinha1() {

        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu("Arquivo");
        JMenuItem menuItem = new JMenuItem("Abrir");
        menu.add(menuItem);
        setJMenuBar(barraMenu);

        //JLabel texto =  new JLabel("Eu não acredito...");
        //add(texto, "North");

        JButton botao = new JButton("Me clica AGORA!!!");
        add(botao, "South");

        JPanel painel = new JPanel();
        add(painel, "Center");
        painel.setBackground(Color.DARK_GRAY);
        painel.add(new JButton("BOTAO"));
        painel.add(new JButton("BOTAO"));
        painel.add(new JButton("BOTAO"));
        painel.add(new JButton("BOTAO"));
        painel.add(new JButton("BOTAO"));
        
        setSize(400,400);
        setTitle("Listagem de Clientes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new telinha1();
    }
}
