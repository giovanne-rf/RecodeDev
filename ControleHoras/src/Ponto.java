import org.joda.time.DateTime;
import org.joda.time.Hours;

public class Ponto extends Funcionarios {

    int anoIn;
    char mesIn=9;
    int diaIn=19;
    int horaIn;
    int minIn;
    int anoOut;
    int mesOut=9;
    int diaOut=19;
    int horaOut;
    int minOut;
    DateTime dataIn = new DateTime(anoIn, 9, 19, 8, 30);
    DateTime dataOut = new DateTime(2020, 9, 19, 22, 30);
    int horasTrabalhadas = Hours.hoursBetween(dataOut, dataIn).getHours();
    int horasExtrasTrabalhadas = Math.abs(horasTrabalhadas -8);
    double salario;
    int jornada;

    public Ponto(String nomeCompleto, String cpf, String matricula, String funcao, double salario, int jornada) {
        super(nomeCompleto, cpf, matricula, funcao, salario, jornada);

    }
}
