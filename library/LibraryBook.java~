package library;
  
  public abstract class LibraryBook extends Book implements Comparable<LibraryBook> 
{
  protected String callNumber;
  
  public LibraryBook(){
    super();
    callNumber = "";
  }

  public LibraryBook(String a, String t, String i, String c){
    super(a, t, i);
    callNumber = c;
  }
  
  public void getCallNumber(){
  }
  
  public void setCallNumber(){
  }
  
  abstract void checkout();
  abstract void returned();
  abstract void circulationStatus();
  
  
  public void compareTo(){
  }
  
  public String toString(){
    return super.toString() + "Call Number: "+callNumber+"\nCirculation Status: ";
  }
  
  
  
}