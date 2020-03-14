package Designpatterns;

public class TurnOffAC implements Commanddesignpattern {
	AC ac;
	 
    public TurnOffAC(AC ac) {
        super();
        this.ac = ac;
    }
 
    public void execute() {
        System.out.println("Turning off AC.");
        ac.turnOff();
    }

}
