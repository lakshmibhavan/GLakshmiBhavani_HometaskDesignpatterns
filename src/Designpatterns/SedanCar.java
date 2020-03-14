package Designpatterns;

public class SedanCar extends Car {
	SedanCar() {
        super(Cartype.SEDAN);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building sedan car");
        // add accessories
    }

}
