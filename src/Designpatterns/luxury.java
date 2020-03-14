package Designpatterns;

public class luxury extends Car {
	luxury() {
        super(Cartype.LUXURY);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building luxury car");
        // add accessories
    }
}

