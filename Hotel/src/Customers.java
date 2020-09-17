public class Customers {

    private int customerType;
    private String type;

    public Customers() {
        this.customerType = customerType;
    }

    String customerType(int customerType){

        if (customerType == 1){
            type = "Regular";
        } else if (customerType==2){
            type = "Fidelidade";
        } else {
            type="vazia";
        }
        return type;
        }
}

// teste github

