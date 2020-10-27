import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class App2 {

    public static void main(String[] args) {
        try {

            String url = "jdbc:mysql://localhost/gama";

            String usuario = "root";

            String senha = "12345678";

            Connection conexao = getConnection(url, usuario, senha);
            String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
            String ra = JOptionPane.showInputDialog("Digite o ra do aluno");
            String telefone = JOptionPane.showInputDialog("Digite o telefone do aluno");
            String curso = JOptionPane.showInputDialog("Digite o curso do aluno");
            String ano = JOptionPane.showInputDialog("Digite o ano do aluno");
            String sql = "INSERT INTO `alunos`(`ra`, `nome`, `telefone`, `curso`, `ano`) VALUES (?,?,?,?,?);";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, ra);
            preparedStatement.setString(2, nome);
            preparedStatement.setString(3, telefone);
            preparedStatement.setString(4, curso);
            preparedStatement.setString(5, ano);
            preparedStatement.execute();
        } catch (Exception cnfe) {

            cnfe.printStackTrace();

        }

    }

    public static Connection getConnection(String url, String user, String password) throws SQLException, SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
