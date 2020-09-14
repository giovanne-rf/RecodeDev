public class Customers {

    int customerType;
    String type;

    public Customers() {
        this.customerType = customerType;
    }

    String customerType(int customerType){

        if (customerType == 0){
            type = "Regular";
        } else if (customerType==1){
            type = "Fidelidade";
        } else {
            type="vazia";
        }
        return type;
        }
}

