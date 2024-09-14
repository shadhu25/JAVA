public class hello2 {
    public static void main(String[] args) {
        int balance=5000;
        int withdrowlAmount=6000;

        try{
            if(balance<withdrowlAmount)
                throw new ArithmeticException("Insufficient balance!");
            balance=balance-withdrowlAmount;
            System.out.println("Transaction Succssfully completed");
        }
        catch(ArithmeticException e){
            System.out.println("Exception : "+e.getMessage());
        }
        System.out.println("Program continue....");
    }
}
