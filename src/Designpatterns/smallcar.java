package Designpatterns;

public class smallcar extends Car {
	    smallcar() {
	        super(Cartype.SMALL);
	        construct();
	    }
	 
	    @Override
	    protected void construct() {
	        System.out.println("Building small car");
	        // add accessories
	    }
}
