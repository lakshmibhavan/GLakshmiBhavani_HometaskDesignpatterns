package Designpatterns;

public class Test {
	    public static void main(String[] args) {
	        System.out.println(carFactory.buildCar(Cartype.SMALL));
	        System.out.println(carFactory.buildCar(Cartype.SEDAN));
	        System.out.println(carFactory.buildCar(Cartype.LUXURY));
	    }
	}
