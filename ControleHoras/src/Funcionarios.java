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

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getJornada() {
        return jornada;
    }

    public void setJornada(int jornada) {
        this.jornada = jornada;
    }
}
