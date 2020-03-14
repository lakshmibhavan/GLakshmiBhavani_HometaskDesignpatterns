package Designpatterns;

public class PatternTest {
	    public static void main(String[] args) {
	        
	        pop supportPopupDecoratored = new pop(new SupportLink(new Support()));
	        System.out.println(supportPopupDecoratored.getFirstColumnData());
	    }
	}

