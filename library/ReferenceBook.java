package library;

public class ReferenceBook extends LibraryBook implements Comparable<LibraryBook>
{
  protected String collection;
  
  public ReferenceBook(){
    super();
    collection = "";
  }
  
   public ReferenceBook(String a, String t, String i, String c, String col){
    super(a, t, i, c);
    collection = col;
  }
  
   public String getCollection(){
     return collection;
  }
  
  public void setCollection(String col){
    collection = col;
  }
  
  public void checkout(String patron, String due){
    System.out.println("Cannot Check Out a Reference Book");
  }
  
  public void returned(){
    System.out.println("Reference book could not have been checked out --return impossible");
  }
  
  public String circulationStatus(){
    return "non-circulating reference book";
  }
  
  public String toString(){
    return super.toString()+ "\nCollection: "+collection;
  }

 
    
}