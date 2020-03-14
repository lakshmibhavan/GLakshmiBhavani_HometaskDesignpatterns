package Designpatterns;

public class SupportLink extends Column{
	 
    public SupportLink(DecoratorReporter decoratorReporter) {
        super(decoratorReporter);
    }
 
    public String getFirstColumnData() {
        return addMoreInfo (super.getFirstColumnData()) ;
    }
     
    private String addMoreInfo(String data){
        return data  + " - support link - ";
    }
}
