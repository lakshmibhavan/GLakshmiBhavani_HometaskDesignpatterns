package Designpatterns;

public class home {
	    public static void main(String[] args) 
	    {
	        AC ac1 = new AC();    //receiver 1
	 
	        Television tv1 = new Television();  //receiver 2
	 
	        AC ac2 = new AC();   //receiver 3
	 
	        Television tv2 = new Television();     //receiver 4
	 
	       AutomationRemote remote = new AutomationRemote();   //Invoker
	 
	        remote.setCommand(new TurnonAC( ac1 ));
	        remote.buttonPressed();
	 
	        remote.setCommand(new TurnonAC( ac2 ));
	        remote.buttonPressed();
	 
	        remote.setCommand(new SwitchOnTV( tv1 ));
	        remote.buttonPressed();
	 
	        remote.setCommand(new SwitchOffTV( tv1 ));
	        remote.buttonPressed();
	 
	        remote.setCommand(new SwitchOnTV( tv2));
	        remote.buttonPressed();
	 
	        remote.setCommand(new SwitchOffTV( tv2 ));
	        remote.buttonPressed();
	    }
	}

