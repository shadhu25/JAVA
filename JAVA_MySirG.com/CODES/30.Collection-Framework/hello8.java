import java.util.*;
class Book{
    private String title;
    private double price;
    Book(String title, double price){
        this.title=title;
        this.price=price;
    } 
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
}
class myComparator implements Comparator<Object>{
    public int compare(Object o1, Object o2){
        Book b1=(Book)o1;
        Book b2=(Book)o2;
        if(b1.getPrice()<b2.getPrice())
            return -1;
        else
            return 1;
    }
}
public class hello8 {
    public static void main(String[] args) {
        Book b1,b2,b3,b4;
        b1=new Book("PHP",500.00);
        b2=new Book("JAVA",300.00);
        b3=new Book("C",200.00);
        b4=new Book("C++",400.00);
        TreeSet <Book> t=new TreeSet<>(new myComparator());
        t.add(b1);
        t.add(b2);
        t.add(b3);
        t.add(b4);
        Iterator <Book> it=t.iterator();
        while(it.hasNext()){
            Book b=(Book)it.next();
            System.out.println(b.getTitle()+"\t"+b.getPrice());
        }
    }
}
