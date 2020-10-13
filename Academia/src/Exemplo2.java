public class Exemplo2 {

    public static void main(String[] args) {

        Integer objNum1 = new Integer(2);
        Integer objNum2 = new Integer(2);

        int priNum1 = 2;
        int priNum2 = 2;

        if(priNum1 == priNum2)
        {
            System.out.println("priNum1 diferente de priNum2");
        }else
        {
            System.out.println("priNum1 diferente do priNum2");
        }

        if(objNum1==objNum2)
        {
            System.out.println("objNum1 é igual ao objNum2");
        }else
        {
            System.out.println("objNum1 é diferente ao objNum2");
        }

    }
}

