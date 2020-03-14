package Designpatterns;

public class carFactory {
	public static Car buildCar(Cartype model) {
        Car car = null;
        switch (model) {
        case SMALL:
            car = new smallcar();
            break;
 
        case SEDAN:
            car = new SedanCar();
            break;
 
        case LUXURY:
            car = new luxury();
            break;
 
        default:
            // throw some exception
            break;
        }
        return car;
    }

}
