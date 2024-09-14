package _9EncapsulatioInheritance.Challenges;

public class Customer {
    public static void main(String[] args) {
        BankAccount krishnAccount=new BankAccount("1000001","Krishn Kant Kumar");
        krishnAccount.withdrawal(400);
        krishnAccount.withdrawal(0);
        krishnAccount.deposite(500);
        krishnAccount.withdrawal(400);
        krishnAccount.withdrawal(200);
    }
}
