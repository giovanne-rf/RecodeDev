import java.awt.*;	import java.awt.event.*;
import javax.swing.*;

public class ExJRadioButton extends JFrame
{
    private JRadioButton normal, negrito, italico, itaNeg;	//criação dos objetos tipo JRadioButton
    private ButtonGroup radioGrupo;							//criação do objeto tipo ButtonGroup, grupo de botões
    private JTextField texto;										//criação do objeto tipo JTextField
    private Font normalF , negritoF, italicoF, itaNegF;		//criação dos objetos tipo Font

    private Container c ; 	//criação do objeto tipo Container
    private RadioButtonTratar tratarRB ; //criação do objeto tipo RadioButtonTratar
    public ExJRadioButton()		//criação do método construtor da classe
    {
        super( "RadioButton Exemplo" );	//indicação do texto para o título da janela
        c = getContentPane();	//atribuição ao objeto do método para disposição dos objetos no container
        c.setLayout( new FlowLayout() );	//definição do tipo de layout do frame
        texto = new JTextField( "Clique nos botões para ver o resultado ....", 30 );	//instanciação do objeto, texto e largura da cx.
        c.add( texto );		//adicionando o objeto texto para o container c.
        tratarRB = new RadioButtonTratar();	//instanciação do objeto
        radioGrupo = new ButtonGroup();		//instanciação do objeto

        // criação dos JRadioButtons
        normal  = adicRadio( "Normal", true);		//atribuição do método que passa o nome e o status do botão
        negrito = adicRadio( "Negrito",false);		// instanciando-o e adicionando o evento de seleção do botão e
        italico = adicRadio( "Itálico",false);				// adicionando o botão ao grupo.
        itaNeg  = adicRadio( "Negrito+Itálico",false);

        // criação das Fontes
        normalF  = new Font( "Arial", Font.PLAIN, 14 ); 	//atribuição dos métodos de estilo da fonte ao objeto normalF
        negritoF = new Font( "Arial", Font.BOLD, 14 );
        italicoF = new Font( "Arial", Font.ITALIC, 14 );
        itaNegF  = new Font( "Arial", Font.BOLD + Font.ITALIC, 14 );

        texto.setFont( normalF );	//método que recebe o estilo da fonte para o texto
        setSize( 350, 100 );
        show();	   }

    public static void main( String args[] )
    {
        ExJRadioButton aplic = new ExJRadioButton();	//instanciação do objeto aplic que será uma janela
        aplic.addWindowListener(			//método que habilitará o fechamento da janela
                new WindowAdapter() {
                    public void windowClosing( WindowEvent e )
                    {               System.exit( 0 );            }         }      );   }


    // definição do método para adicionar componentes
    private JRadioButton	adicRadio( String nome, boolean b)	//método que recebe o nome e o estado do botão rádio
    {
        JRadioButton radioBot = new JRadioButton (nome, b);		//instanciando o objeto radioBot da classe JRadioButton
        radioBot.addItemListener( tratarRB );		//adiciona o evento tratarRB para indicar se o Objeto foi selecionado
        c.add(radioBot);	//adiciona o botao criado ao conteiner
        radioGrupo.add( radioBot );		//adiciona o botao criado ao grupo RadioGrupo
        return radioBot;   }	//retorna o foco para o objeto radioBot


    private class RadioButtonTratar implements ItemListener { 	//classe que analisará o evento de escolha do botão
        public void itemStateChanged( ItemEvent e )
        {
            if ( e.getSource() == normal )	//se o botão selecionado for o botão normal então
            texto.setFont( normalF );	//formate o texto como normal
            else if ( e.getSource() == negrito )
            texto.setFont( negritoF );
            else if ( e.getSource() == italico )
            texto.setFont( italicoF );
            else if ( e.getSource() == itaNeg )
            texto.setFont( itaNegF ); }   }	}

