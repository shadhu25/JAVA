package _9EncapsulatioInheritance.Challenges;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void deposite(double money){
        balance+=money;
        System.out.println("deposited successfully......");
    }
    public double withdrawal(double money){
        if(money<=0)
            System.out.println("Invalid money!");
        else if (money>balance){
            System.out.println("Insufficient balance!");
        }
        else
            balance-=money;
        return money;
    }
}
