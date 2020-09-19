import java.util.*;

public class cadastrarFuncionarios  extends Funcionarios {


    public cadastrarFuncionarios(String nomeCompleto, String cpf, String matricula, String funcao, double salario, int jornada) {
        super(nomeCompleto, cpf, matricula, funcao, salario, jornada);
    }

    public void getDadosFuncionario() {
        ArrayList funcionario = new ArrayList();
        funcionario.add(nomeCompleto);
        funcionario.add(cpf);
        funcionario.add(matricula);
        funcionario.add(funcao);
        funcionario.add(salario);
        funcionario.add(jornada);

        for (int i = 0; i < funcionario.size(); i++) {
            System.out.println(funcionario.get(i));
        }
    }


    @Override
    public String toString() {
        return "Funcionário: " +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", cpf='" + cpf + '\'' +
                ", matricula='" + matricula + '\'' +
                ", funcao='" + funcao;
    }

}

