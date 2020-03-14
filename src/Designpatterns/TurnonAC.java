package Designpatterns;

public class TurnonAC implements Commanddesignpattern {
	AC ac;
	 
    public TurnonAC(AC ac) {
        super();
        this.ac = ac;
    }
 
    public void execute() {
        System.out.println("Turning on AC.");
        ac.turnOn();
    }
}

