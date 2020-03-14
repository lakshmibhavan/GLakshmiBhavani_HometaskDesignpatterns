package Designpatterns;

public class AutomationRemote {
    Commanddesignpattern command;
 
    public void setCommand(Commanddesignpattern command) {
        this.command = command;
    }
 
    public void buttonPressed() {
        command.execute();
    }
}
