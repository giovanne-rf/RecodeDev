public class ContaBouns extends  Conta {

    private double bonus;
    public static final double BONUS_TAXA = 0.03;

    public ContaBouns(String numero, double depositoInicial) {
        super(numero, depositoInicial);
    }

    public double getBonus(){
        return this.bonus;
    }

    @Override
    public double creditar(double credito) {
        this.bonus = this.bonus + (credito*BONUS_TAXA);
        return super.creditar(credito);
    }

    public void renderBonus(){
        super.creditar(this.bonus);
        bonus = 0;

    }
}
