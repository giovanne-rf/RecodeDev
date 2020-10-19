package ArraysLists;

import java.util.ArrayList;

public class imprimeFuncionario {

    private static void imprimeFuncionarios  (ArrayList funcionarios){
        Funcionarios func;
        System.out.println("Qtd de funcionarios: " + funcionarios.size());

        for (int nCont = 0; nCont<funcionarios.size(); nCont++){
            func = (Funcionarios) funcionarios.get(nCont);
            System.out.println(nCont + ";\n" + func);
        }

        System.out.println(" -----  FIM -------");
    }


}
