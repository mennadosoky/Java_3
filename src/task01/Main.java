package task01;

public class Main {
    public static void main(String[] args) {
        BankAccount3 account = new BankAccount3("Mohammed", 1000);
        System.out.println(account.getBalance());
        try{
            account.deposit(-500);
        }catch (InvalidAmountException e){
            e.printStackTrace();
        }
        System.out.println(
                "Balance: " + account.getBalance()
        );
        try {
            account.withdraw(200);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }
        System.out.println(
                "Balance: " + account.getBalance()
        );
        try {
            account.withdraw(2000);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }
        System.out.println(
                "Balance: " + account.getBalance()
        );
    }
}
