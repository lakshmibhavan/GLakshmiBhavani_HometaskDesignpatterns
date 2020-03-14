package Designpatterns;

public abstract class Column implements DecoratorReporter 
{
    private DecoratorReporter decoratedReport;
     
    public Column(DecoratorReporter decoratorReporter){
        this.decoratedReport = decoratorReporter;
    }
     
    public String getFirstColumnData() {
        return decoratedReport.getFirstColumnData(); 
    }
     
    @Override
    public Object[][] getReportData(String reportId) {
        return decoratedReport.getReportData(reportId);
    }
}