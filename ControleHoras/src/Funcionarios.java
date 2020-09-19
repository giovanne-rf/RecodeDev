public class Funcionarios {

    /* O sistema irá inserir */

    String nomeCompleto;
    String cpf;
    String matricula;
    String funcao;
    double salario;
    int jornada;

    public Funcionarios(String nomeCompleto, String cpf, String matricula, String funcao, double salario, int jornada) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.matricula = matricula;
        this.funcao = funcao;
        this.salario = salario;
        this.jornada = jornada;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getFuncao() {
        return funcao;
    }

    public double getSalario() {
        return salario;
    }

    public int getJornada() {
        return jornada;
    }
}
