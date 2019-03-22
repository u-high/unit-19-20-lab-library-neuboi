package library;

public class CirculatingBook extends LibraryBook implements Comparable<LibraryBook>
{
  protected String currentHolder;
  protected String dueDate;
  protected boolean returned;
  
  public CirculatingBook(){
    super();
    currentHolder = null;
    dueDate = null;
  }
  
  public CirculatingBook(String a, String t, String i, String c){
    super(a, t, i, c);
    currentHolder = null;
    dueDate = null;
  }
  
  
  public String getCurrentHolder(){
    return currentHolder;
  }
  public String getDueDate(){
    return dueDate;
  }
  
  public void setCurrentHolder(String a){
    currentHolder = a;
  }
  public void setDueDate(String a){
    dueDate = a;
  }
  
  public void checkout(String patron, String due){
    currentHolder = patron;
    dueDate = due;
    returned = false;
  }
  
   public void returned(){
    returned = true;
    System.out.println("Book Has Been Returned");
  }
  
  public String circulationStatus(){
    if (returned == true){
    return "Current Holder: "+currentHolder+"\nDue Date: "+dueDate;
    }
      return "book available";
    
  }
  
  
  public String toString(){
    return super.toString() + "\nCurrent Holder: "+currentHolder+"\nDue Date: "+dueDate;
  }
    
}