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
  
  public String getCallNumber(){
    return callNumber;
  }
  
  public void setCallNumber(String c){
    callNumber = c;
  }
  
  abstract void checkout(String patron, String due);
  abstract void returned();
  abstract String circulationStatus();
  
  
  public int compareTo(LibraryBook lib){
    return title.compareTo(lib.getTitle());
  }
  
  public String toString(){
    return super.toString() + "Call Number: "+callNumber+"\nCirculation Status: ";
  }
  
  
  
}