package GerenciadoresLayout;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.*;

public class ModeloJFrame extends JFrame
{
    private static final long serialVersionUID = 1L;
    public ModeloJFrame()
    {
        setLayout(null);
        getContentPane().setBackground(new Color(0, 130, 170));
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String a[])
    {
        new ModeloJFrame();
    }

}