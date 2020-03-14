package Designpatterns;

public class Main1 {
	public static void main(String[] args) {
		Builderpattern user1 = new Builderpattern.UserBuilder("Lakshmi", "Gupta")
	    .age(30)
	    .phone("123456758")
	    .address("Fake address 1234")
	    .build();
	 
	    System.out.println(user1);
	 
	    Builderpattern user2 = new Builderpattern.UserBuilder("Jack", "Reacher")
	    .age(40)
	    .phone("1234567891")
	    //no address
	    .build();
	 
	    System.out.println(user2);
	}
	 

}
