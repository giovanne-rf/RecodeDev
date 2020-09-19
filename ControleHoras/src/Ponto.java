import org.joda.time.DateTime;

import java.util.Calendar;

public class Ponto extends Funcionarios {

    DateTime data;
    DateTime timeIn;
    DateTime timeOut;
    double salario;
    int jornada;

    public Ponto(String nomeCompleto, String cpf, String matricula, String funcao, DateTime data, DateTime timeIn, DateTime timeOut, double salario, int jornada) {
        super(nomeCompleto, cpf, matricula, funcao, salario, jornada);
        this.data = data;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.salario = salario;
        this.jornada = jornada;
    }

}
