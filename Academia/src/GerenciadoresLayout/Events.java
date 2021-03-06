package GerenciadoresLayout;

/*O exemplo abaixo foi extraído do Livro Java 2
 * Ensino Didático e demonstra o uso de diversos eventos.
 */
import java.awt.*;	import java.awt.event.*;import javax.swing.*;

public class Events extends JFrame implements MouseListener, KeyListener,TextListener, FocusListener, MouseMotionListener {
    JButton b1;    JLabel l1,l2;    JTextField t1,t2;  TextField t3;
    static int E=100,T=100;

    public static void main(String[] args) {
        JFrame janela = new Events();

        WindowListener x = new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                mostraMensagem("A janela irá fechar e o sistema será encerrado!!!");
                System.exit(0);
            }
            public void windowActivated(WindowEvent e) {
                // A janela foi ativada
            }
            public void windowDeactivated(WindowEvent e) {
                // A janela foi desativada
            }
            public void windowIconified(WindowEvent e) {
                // A janela foi minimizada
            }
            public void windowDeiconified(WindowEvent e) {
                // A janela foi restaurada;
            }
            public void windowOpened(WindowEvent e) {
                mostraMensagem("A janela foi aberta");
            }
            public void windowClosed(WindowEvent e) {
                mostraMensagem("A janela foi fechada");
            }
        };

        janela.addWindowListener(x);

        //Tratando a janela como um componente
        ComponentListener y = new ComponentAdapter()
        {
            public void componentHidden(ComponentEvent e)
            {
                mostraMensagem("A janela tornou-se oculta");
            }

            public void componentMoved(ComponentEvent e)
            {
                //mostraMensagem("A janela foi movida");
            }

            public void componentResized(ComponentEvent e)
            {
                mostraMensagem("A janela foi redimensionada");
            }

            public void componentShown(ComponentEvent e)
            {
                mostraMensagem("A janela tornou-se visível");
            }
        };
        janela.addComponentListener(y);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
    }

    Events() {
        setTitle("Manipulando de Eventos");
        setSize(280,200);
        setLocation(E,T);
        getContentPane().setLayout(new GridLayout(6,1));
        l1 = new JLabel(""); l2 = new JLabel(""); b1 = new JButton ("Eventos do Botão");
        t1 = new JTextField(); t2 = new JTextField(); t3 = new TextField();
        b1.addMouseListener(this);
        b1.addMouseMotionListener(this);
        b1.setBackground(Color.gray);
        t1.addKeyListener(this);
        t3.addTextListener(this);
        t3.addKeyListener(this);
        t3.addFocusListener(this);
        getContentPane().add(b1);
        getContentPane().add(l1);
        getContentPane().add(l2);
        getContentPane().add(t1);
        getContentPane().add(t3);
        getContentPane().add(t2);
    }
    // métodos relativos a MouseListener
    public void mousePressed(MouseEvent e) {
        l1.setText("O botão do Mouse foi pressionado");
        mostraMensagem(""+e.getClickCount() + "  " + e.getX()+ "  " + e.getY());
        //mostraMensagem(""+e.isLeftMouseButton()+ "  "+ e.isControlDown());
    }
    public void mouseClicked(MouseEvent e) {
        l1.setText("O botão do Mouse foi solto");   }

    public void mouseEntered(MouseEvent e) {
        // o ponteiro do mouse entrou na área
        b1.setBackground(Color.yellow);   }
    public void mouseExited(MouseEvent e) {
        // o ponteiro do mouse saiu da área
        b1.setBackground(Color.gray);   }
    public void mouseReleased(MouseEvent e) {
        l1.setText("O ponteiro do Mouse foi arrastado");   }
    // métodos relativos a MouseMotionListener
    public void mouseMoved(MouseEvent e) {
        l2.setText("Mouse se moveu em "+e.getX()+" , "+e.getY());}
    public void mouseDragged(MouseEvent e) {
        l2.setText("Mouse foi arrastado em "+e.getX()+" , "+e.getY());}
    // métodos relativos a KeyListener
    public void keyPressed(KeyEvent e) {
        // uma tecla foi pressionada
        if (e.getSource()==t1)
        { if(e.getKeyCode()==9)
        { e.setKeyCode(9);
            return;  }
            return;       }     }
    public void keyReleased(KeyEvent e) {
        // uma tecla foi solta
    }
    public void keyTyped(KeyEvent e) {
        // uma tecla Unicode foi pressionada
    }

    // método relativo a TextListener
    public void textValueChanged(TextEvent e) {
        // o conteúdo do campo texto foi alterado
        int n1,n2;
        try
        {n1 = Integer.parseInt(t1.getText());
            n2 = Integer.parseInt(t3.getText());
            t2.setText(""+n1*n2);       }
        catch(NumberFormatException erro)
        { t2.setText("0");
            return; }      }

    public void focusGained(FocusEvent e) {
        // o objeto recebeu o foco
        l1.setText("O objeto t3 recebeu o foco");    }

    public void focusLost(FocusEvent e) {
        // o objeto perdeu o foco
        l1.setText("O objeto t3 perdeu o foco");    }

    public static void mostraMensagem(String men) {
        JOptionPane.showMessageDialog(null,men,"Mensagem",JOptionPane.INFORMATION_MESSAGE); }
}
