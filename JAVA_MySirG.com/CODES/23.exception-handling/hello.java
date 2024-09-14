public class hello {
    public static void main(String[] args) {
        String s=null;
        // defalt exception handing will accur but after all statement will not executed
        System.out.println("string lengh: "+s.length());

        // here after accuring excepton rest code will work
        try{
            System.out.println(3/0);
        }
        catch(ArithmeticException e){
            System.out.println("Exception : "+e.getMessage());
        }
        finally{ // finaly code always execute it does not depend on exceptions
            System.out.println("finally code");
        }
        System.out.println("last line");

    }
}
