package Designpatterns;

public class SwitchOffTV implements Commanddesignpattern {
	 Television tv;
	 
	    public SwitchOffTV(Television tv) {
	        super();
	        this.tv = tv;
	    }
	 
	    public void execute() {
	        System.out.println("switching off tv.");
	        tv.stop();
	    }
	}
