public class Example{
    private  int l,b,h;
    public Example(){
        l=1; b=1; h=1;
    }
    public Example(int x, int y, int z){
        l=x; b=y; h=z;
    }
    public static void main(String ram[]){
        Example e1= new Example(12, 43, 45);
        Example e2= new Example();
        System.out.println(e1.b);
    }
}