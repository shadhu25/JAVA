package _9EncapsulatioInheritance.Challenges;

public class LibraryItem {
    private String itemID;
    private  String title;
    private String author;
    public void checkout(){
        System.out.println("the book is checkout.");
    }
    public void returnItem(){
        System.out.println("the item is returned.");
    }
}
