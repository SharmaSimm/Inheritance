public class HistoricalEvent{


//instant variables
private String description;
private Date date;

  
//full constructor
public HistoricalEvent(String description, Date date){
  this.description = description;
  this.date = date;
}
  //default constructor
  public HistoricalEvent(){
    
  }
//setter
  public void setDescription(String description){
    this.description = description;
  }

  public void setDate(Date date){
    this.date = date;
  }
  //getter
  public String getDescription(){
    return description;
  }

  public Date getDate(){
    return date;
    
  }

//tostring method
  public  String toString(){
    return this.description;
  }

  //equals method
  @Override
  
  public boolean equals(Object obj){
 
    if (this == obj)
      return true;
     if(obj == null) 
      return false;
    if(getClass() != obj.getClass())
      return false;
    HistoricalEvent other = (HistoricalEvent) obj;
    if ( date == null) {
      if(other.date != null)
        return false;
    } else if (!date.equals(other.date))
      return false;
    if ( description == null){
      if(other.description != null)
        return false;
  
    }else if (!description.equals(other.description))
      return false;
  return true;
    }



}