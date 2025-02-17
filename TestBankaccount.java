/* Write a java program to create a class known as Bankaccount with methods called
   deposit() and withdraw().create a subclass called Savingaccount that override
   the Withdraw() method to prevent Withdrawal if the account balance falls below one 
   hundred. */  

class Bankaccount{
    double balance;

    Bankaccount(double balance){
        this.balance=balance;
    }
    void deposit(double amount){
        balance += amount;
    }
    void Withdraw(double amount){
        balance -= amount;
    }

    double getbalance(){
        return balance;
    }
    
}
class Savingaccount extends Bankaccount{
    Savingaccount(double balance){
        super(balance);
    }
    void withdraw(double amount){
        if(balance - amount < 100){
            System.out.println("withdrawal denied! Minimum balance of 100 required.");
        }
        else
        {
            super.Withdraw(amount);
        }
    }
}
class TestBankaccount{
    public static void main(String args[]){
        Savingaccount acc = new Savingaccount(4500);
        acc.Withdraw(1500);
        System.out.println("Balance : "+acc.getbalance());
        
    }
}