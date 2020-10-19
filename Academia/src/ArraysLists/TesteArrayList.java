package ArraysLists;

import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {

        Funcionarios funcionario1 = new Funcionarios("Giovanne", 35);
        Funcionarios funcionario2 = new Funcionarios("Jersson", 40);

        ArrayList<Funcionarios> funcionarios = new ArrayList<Funcionarios>();
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);


       // imprimeFuncionario(funcionarios);

        System.out.println("Funciionario 1 será removido");
        Funcionarios funcRemovido = (Funcionarios) funcionarios.remove(1);

       // imprimeFuncionario(funcionarios);


    }




}
