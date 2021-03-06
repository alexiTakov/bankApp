/**
 * Created by alex on 09/04/2017.
 */
public class Savings extends Account {
    private static String accountType = "Savings";

    Savings(double initialDeposit) {
        super(); // вызов у наследумого Account
        this.setBalance(initialDeposit);
        this.checkInterest();
    }


    @Override
    public String toString() {
        return "Account Type:" +  accountType + "Account\n" +
                "Account Number: " + this.getAccountNumber() + "\n" +
                "Balance: "  + this.getBalance() + "\n" +
                "Interest Rate: " + this.getInterest() + "%\n";
    }
}
