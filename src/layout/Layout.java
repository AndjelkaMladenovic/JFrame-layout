package layout;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Layout {

    public static void main(String[] args) {

        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setTitle("Button-i");
        jf.setVisible(true);
        jf.setSize(400, 300);
        jf.setLocation(100, 100);
        jf.add(new JButton("Pocetak stranice"),BorderLayout.PAGE_START);
        jf.add(new JButton("Kraj stranice"),BorderLayout.PAGE_END);
        jf.add(new JButton("Sredina"),BorderLayout.CENTER);
        jf.add(new JButton("Leva Strana"),BorderLayout.LINE_START);
        jf.add(new JButton("Desna Strana"),BorderLayout.LINE_END);
    }
}
