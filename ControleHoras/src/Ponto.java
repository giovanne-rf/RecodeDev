import java.util.Calendar;

public class Ponto {

    Calendar data;

    public Ponto(Calendar data) {
        this.data = data;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
}
