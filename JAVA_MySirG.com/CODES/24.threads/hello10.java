// syncronization
import java.util.Scanner;
class Account{
    private float balance;
    public Account(float balance){
        this.balance=balance;
    }
    public boolean isSufficientBalance(float withdrowBalance){
        if(balance>withdrowBalance)
            return true;
        else
            return false;
    }
    public void withdrow(float withdrowBalance){
        balance=balance-withdrowBalance;
        System.out.println("Withdrow balance is "+withdrowBalance);
        System.out.println("Your current balance is "+balance);
    }
}
class Customer implements Runnable{
    Account account;
    private String name;
    public Customer(Account account,String name){
        this.account=account;
        this.name=name;
    }
    public void run(){
        Scanner maa=new Scanner(System.in);
        synchronized (account){
        System.out.print(name+",Enter the withdrow ammount: ");
        float withdrowBalance=maa.nextFloat();
        if(account.isSufficientBalance(withdrowBalance))
            account.withdrow(withdrowBalance);
        else
            System.out.println("Insufficient balance!");  
        } 
    }
}
public class hello10 {
    public static void main(String[] args) {
        Account a1=new Account(1000);
        Customer c1=new Customer(a1, "Ranjana"),c2=new Customer(a1, "Avinash");
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.start();
        t2.start();
    }
}
