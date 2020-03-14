package Designpatterns;

public class SwitchOnTV implements Commanddesignpattern{
		 
	    Television tv;
	 
	    public SwitchOnTV(Television tv) {
	        super();
	        this.tv = tv;
	    }
	 
	    public void execute() {
	        System.out.println("starting television.");
	        tv.start();
	    }
	}

