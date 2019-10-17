import java.text.NumberFormat;

public class SavingsAccountTest extends SavingsAccount {

    public static void main(String[] args)
    {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        SavingsAccount save1 = new SavingsAccount();
        SavingsAccount save2 = new SavingsAccount();
        save1.setBalance(2000);
        save2.setBalance(3000);

        modifyInterestRate(0.04);

        System.out.println("Account 1 has " + formatter.format(save1.calculateMonthlyInterest()) + " after 1 month with an interest of " + annualInterestRate + " on a balance of $2000.00.");
        System.out.println("Account 2 has " + formatter.format(save2.calculateMonthlyInterest()) + " after 1 month with an interest of " + annualInterestRate + " on a balance of $3000.00.\n");

        modifyInterestRate(0.05);
        System.out.println("Account 1 has " + formatter.format(save1.calculateMonthlyInterest()) + " after an additional month with an interest rate of " + annualInterestRate + ".");
        System.out.println("Account 2 has " + formatter.format(save1.calculateMonthlyInterest()) + " after an additional month with an interest rate of " + annualInterestRate + ".");

    }

}
