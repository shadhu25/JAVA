// Generic method
public class hello{
    public <E> void printArray( E s[]){ // generic method
        for(E x : s){ // for each loop
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        String country[]={"India","Pakistan","Sri lanka"};
        Integer names[]={22,33,44,55};
        hello e=new hello();
        e.printArray(country);
        e.printArray(names);
    }
}