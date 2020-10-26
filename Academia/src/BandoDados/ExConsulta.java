/*este exemplo mostra como pode ser feita uma consulta*/
import java.sql.*; 	// observe a importação do pacote para instruções SQL
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import BandoDados.ConectaBanco;
import servicos.MetodosComuns;
public class ExConsulta
{
    MetodosComuns mc = new MetodosComuns();
    Connection conn=null;
    PreparedStatement pstm = null;
    ResultSet rs=null;
    private static String usuario = "usuario", senha = "2020";
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public static void main(String[] args) throws InstantiationException, IllegalAccessException
    {
        new ExConsulta();
    }
    public ExConsulta()
    {
        try
        {
            //mc.gravarDados();
            conn = ConectaBanco.getConexao("usuario", "2020");
            System.out.println("Conexao realizada com sucesso");
            String consulta = "SELECT * FROM Clientes";
            // cria um objeto que permite o uso de cmdos SQL
            pstm = conn.prepareStatement(consulta);
            System.out.println("Consulta criada com sucesso");
            /* cria um objeto rs que armazenará o resultado da consulta no formato de Tabela*/
            rs = pstm.executeQuery();
            System.out.println("Nome\t\t\t\tTelefone");
            System.out.println("--	---------------   	------------");
            // enquanto não for EOF move para o próximo e após imprime na tela
            while(rs.next())
            {
                //System.out.print(rs.first());
                //String cpf = rs.getString("clienteCPF");
                String Nome = rs.getString("clienteNome");
                String Telefone = rs.getString("clienteTelefone");
                System.out.println(Nome+ "\t\t" + Telefone);
            }
            ConectaBanco.fechaConexao(conn, pstm, rs);;          //Fecha a Conexão
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("Driver JDBC-ODBC não encontrado!");
        }
        catch(SQLException ex)
        {
            System.out.println("Problemas na conexao com a fonte de dados"
                    + ex.getMessage());
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }



        public void gravarDados ()
        {
            String clienteCPF = "";
            String clienteNome, clienteTelefone;
            clienteNome = JOptionPane.showInputDialog("Digite o nome");
            clienteTelefone = JOptionPane.showInputDialog("Digite o Telefone");

            try {
                conn = ConectaBanco.getConexao("usuario", "2020");
                pstm = null;

                String sql = "INSERT INTO Clientes " + "(clienteNome, ClienteTelefone)"
                        + "VALUES(?,?)";
                pstm = conn.prepareStatement(sql);
                //1ª LINHA
                //pstm.setInt(1, Integer.parseInt(clienteCPF));
                pstm.setString(1, clienteNome);
                pstm.setString(2, clienteTelefone);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Cliente Gravado as " + lerHora());
                ConectaBanco.fechaConexao(conn, pstm, rs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Incluir o Cliente: \n "
                        + "\n - " + e.getMessage() +
                        "\n  - " + e.getStackTrace() +
                        "\n  - " + e.getCause()
                );
            }
        }

        public String lerHora ()
        {
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            Date date = new Date();
            return dateFormat.format(date);
        }



}

