package BandoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
public class ConectaBanco
{
    private static String USUARIO="";
    private static String SENHA="";
    private static String DATABASE = "Clientes";

    public static void setUSUARIO(String uSUARIO) {
        USUARIO = uSUARIO;
    }

    public static void setSENHA(String sENHA) {
        SENHA = sENHA;
    }

    private static final String DRIVER_CONEXAO =
            "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String STR_CONEXAO =
            "jdbc:sqlserver://DESKTOP-SQ7VUFS\\SQLCASA;";

    static Connection con;


    public static Connection getConexao() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        Connection conn = null;
        try
        {
            Class.forName(DRIVER_CONEXAO).getInterfaces();
            String url = STR_CONEXAO + "databaseName = " + DATABASE;
            conn = DriverManager.getConnection(url, USUARIO, SENHA);
            JOptionPane.showMessageDialog(null, "Conectado com usuário: " +
                    USUARIO + "\nSenha: "+  SENHA);
            return conn;
        }
        catch (ClassNotFoundException e)
        {
            throw new ClassNotFoundException(
                    "Driver Sql nao foi encontrado " + e.getMessage());

        } catch (SQLException e)
        {
            throw new SQLException("Erro ao conectar "
                    + "com a base de dados" + e.getMessage());
        }
    }

    public static Connection getConexao(String banco, String usuario, String senha)
            throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        Connection conn = null;
        try
        {
            DATABASE = banco;
            System.out.println(usuario + senha);
            Class.forName(DRIVER_CONEXAO).getInterfaces();
            String url = STR_CONEXAO + "databaseName = " + DATABASE;
            conn = DriverManager.getConnection(url, usuario, senha);
            return conn;
        }
        catch (ClassNotFoundException e)
        {
            throw new ClassNotFoundException(
                    "Driver Sql nao foi encontrado " + e.getMessage());

        } catch (SQLException e)
        {
            throw new SQLException("Erro ao conectar "
                    + "com a base de dados" + e.getMessage());
        }
    }

    public static void fechaConexao(Connection conn, PreparedStatement pstm)
    {
        try {
            if (conn != null)
            {
                conn.close();
            }
            if (pstm != null) {
                pstm.close();
                System.out.println("Statement e conexão fechados com sucesso");
            }


        } catch (Exception e) {
            System.out.println("Nao foi possível fechar o statement " + e.getMessage());
        }
    }

    public static void fechaConexao(Connection conn, PreparedStatement pstm, ResultSet rs)
    {
        try {
            if (conn != null || pstm != null) {
                fechaConexao(conn, pstm);
            }
            if (rs != null) {
                rs.close();
                System.out.println("ResultSet fechado com sucesso");
            }


        } catch (Exception e) {
            System.out.println("Nao foi possivel fechar o ResultSet " + e.getMessage());
        }
    }
    public static Connection getConexao(String usuario, String senha) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        Connection conn = null;
        try
        {
            System.out.println(usuario + senha);
            Class.forName(DRIVER_CONEXAO).getInterfaces();
            String url = STR_CONEXAO + "databaseName = " + DATABASE;
            conn = DriverManager.getConnection(url, usuario, senha);
            return conn;
        }
        catch (ClassNotFoundException e)
        {
            throw new ClassNotFoundException(
                    "Driver Sql nao foi encontrado " + e.getMessage());

        } catch (SQLException e)
        {
            throw new SQLException("Erro ao conectar "
                    + "com a base de dados" + e.getMessage());
        }
    }
}