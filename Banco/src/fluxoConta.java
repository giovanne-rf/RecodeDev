public class fluxoConta {

    public static void main(String[] args) {

        Conta conta = new Conta("19784-3", 5000);
        System.out.println("Seu saldo é de " + conta.getSaldo());
        conta.debitar(100);
        System.out.println("Seu saldo é de " + conta.getSaldo());
        conta.creditar(200);
        System.out.println("Seu saldo é de " + conta.getSaldo());
        conta.creditar(1200);
        System.out.println("Seu saldo é de " + conta.getSaldo());

        Poupanca poupanca = new Poupanca("9785-5", conta.getSaldo());
        poupanca.getSaldo();
        System.out.println("Seu saldo é de sua poupança é " + poupanca.getSaldo());
        poupanca.creditarJuros(0.23);
        System.out.println("Seu saldo é de sua poupança é " + poupanca.getSaldo());

        ContaBouns contaBouns = new ContaBouns("19785-5", 1500);
        contaBouns.creditar(1200);
        System.out.println("Seu saldo da conta bonus é de sua poupança é " + contaBouns.getSaldo());
        contaBouns.renderBonus();
        System.out.println("Seu saldo da conta bonus é de sua poupança é " + contaBouns.getSaldo());
        contaBouns.creditar(1000);
        System.out.println("Seu saldo da conta bonus é de sua poupança é " + contaBouns.getSaldo());
        contaBouns.renderBonus();
        System.out.println("Seu saldo da conta bonus é de sua poupança é " + contaBouns.getSaldo());

    }

}
