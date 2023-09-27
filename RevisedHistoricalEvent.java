

public class RevisedHistoricalEvent extends HistoricalEvent{ 

  //instance variables
  protected String revisedDescription;
protected String citation;


public RevisedHistoricalEvent(String revisedDescription, String citation, String description, Date date){
  super(description, date);
  this.revisedDescription = revisedDescription;
  this.citation = citation;
}
  public void teach(){
    System.out.println("Revised Description: \n " + getDescription() + "Date: " + getDate() + "Citation : \n" + citation );
    
  }
  public String getRevisedDescription(){
    return revisedDescription;
  }
  public String getCitation(){
    return citation;
  }
    public void setRevisedDescription(String revisedDescription){
      this.revisedDescription = revisedDescription;
    }
      
  }
