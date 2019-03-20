package library;

public class Book
{
   protected String author;
   protected String title;
   protected String isbn;
   
   public Book(){
     author = "";
     title = "";
     isbn = "";
   }
   
   public Book(String a, String t, String i){
     author = a;
     title = t;
     isbn = i;
   }
   
   public void getAuthor(){
   }
   public void getTitle(){
   }
   public void getISBN(){
   }
   
   public void setAuthor(){
   }
   public void setTitle(){
   }
   public void setISBN(){
   }
   
   public String toString(){
    return "Author: "+author+"\nTitle: "+title+"\nISBN: "+isbn+"\n"; 
   }
   
}