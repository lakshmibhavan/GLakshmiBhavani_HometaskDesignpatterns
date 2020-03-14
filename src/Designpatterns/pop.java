package Designpatterns;

public class pop extends Column{
	 
    public pop(DecoratorReporter decoratorReporter) {
        super(decoratorReporter);
    }
 
    public String getFirstColumnData() {
        return addPopup (super.getFirstColumnData()) ;
    }
     
    private String addPopup(String data){
        return data  + " - support popup - ";
    }
}