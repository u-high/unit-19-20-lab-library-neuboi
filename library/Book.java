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
   
   public String getAuthor(){
     return author;
   }
   public String getTitle(){
     return title;
   }
   public String getISBN(){
     return isbn;
   }
   
   public void setAuthor(String a){
     author = a;
   }
   public void setTitle(String t){
     title = t;
   }
   public void setISBN(String i){
     isbn = i;
   }
   
   public String toString(){
    return "Author: "+author+"\nTitle: "+title+"\nISBN: "+isbn+"\n"; 
   }
   
}