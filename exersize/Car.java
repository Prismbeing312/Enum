package exersize;

public class Car {
    CarType type;
    int worth;

    public Car(CarType type) {
        this.type = type;
    }

    public int getPrice(){
        switch (type) {
            case LEXUS: worth = 20000;
            break;
            case SKODA: worth = 5000;
            break;
            case BENTLY: worth = 1000000;
            break;
            case MITSUBISHI: worth = 10000;
            break;
            case FERRARI: worth = 3000000;
            break;
            default: worth = 0;
        }
        return worth;
    }
}
