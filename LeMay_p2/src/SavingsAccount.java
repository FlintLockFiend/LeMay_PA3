public class SavingsAccount {
    static double annualInterestRate;
    private double savingBalance;

    public void setBalance(double b) {
        this.savingBalance = b;
    }

    public static void modifyInterestRate(double newInterestRate)
    {
        annualInterestRate = newInterestRate;
    }
    public double calculateMonthlyInterest()
    {
        savingBalance += (savingBalance * annualInterestRate) / 12;
        return savingBalance;
    }
}
