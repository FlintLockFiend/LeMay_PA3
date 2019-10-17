import java.security.SecureRandom;
import java.util.Scanner;

public class LeMay_p1 {
    public static void correct()
    {
        SecureRandom random = new SecureRandom();
        int x = random.nextInt(4);

        switch(x)
        {
            case 0:
                System.out.println("Very good!");
                break;
            case 1:
                System.out.println("Excellent!");
                break;
            case 2:
                System.out.println("Nice work!");
                break;
            case 3:
                System.out.println("Keep up the good work!");
                break;
        }
    }
    public static void incorrect()
    {
        SecureRandom random = new SecureRandom();
        int x = random.nextInt(4);

        switch(x)
        {
            case 0:
                System.out.println("No. Please try again.");
                break;
            case 1:
                System.out.println("Wrong. Try once more.");
                break;
            case 2:
                System.out.println("Don’t give up!");
                break;
            case 3:
                System.out.println("No. Keep trying.");
                break;
        }
    }
    public static int difficulty(int d)
    {
        SecureRandom random = new SecureRandom();
        int x = 0;
        while(x == 0)
        {
            x = random.nextInt((int) Math.pow(10, d));
        }
        return x;
    }
    public static double arithmeticSelect(int a, int x, int y)
    {
        SecureRandom random = new SecureRandom();
        switch(a)
        {
            case 1:
                System.out.println("How much is " + x + " plus " + y + "?");
                return x + y;
            case 2:
                System.out.println("How much is " + x + " minus " + y + "?");
                return x - y;
            case 3:
                System.out.println("How much is " + x + " times " + y + "?");
                return x * y;
            case 4:
                System.out.println("How much is " + x + " divided by " + y + "? (2 decimal places and no rounding)");
                return Math.floor(((double)x / y) * 100) / 100;
            case 5:
                switch(random.nextInt(4) + 1)
                {
                    case 1:
                        System.out.println("How much is " + x + " plus " + y + "?");
                        return x + y;
                    case 2:
                        System.out.println("How much is " + x + " minus " + y + "?");
                        return x - y;
                    case 3:
                        System.out.println("How much is " + x + " times " + y + "?");
                        return x * y;
                    case 4:
                        System.out.println("How much is " + x + " divided by " + y + "? (2 decimal places and no rounding)");
                        return Math.floor(((double)x / y) * 100) / 100;
                    default:
                        return 0;
                }
            default:
                return 0;
        }
    }
    public static double question(int d, int arithmetic)
    {
        SecureRandom random = new SecureRandom();
        int x = difficulty(d);
        int y = difficulty(d);

        return(arithmeticSelect(arithmetic, x, y));

    }
    public static void percentage(int right, int numQuestions)
    {
        double percent = ((double)right / numQuestions);
        if(percent >= 0.75)
        {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else
        {
            System.out.println("Please ask your teacher for extra help");
        }
    }
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        char c = 'y';
        double j = -1;
        int difficulty;
        int arithmetic;
        int wrong = 0;
        int right = 0;

        while(c != 'n')
        {
            System.out.println("Please select a difficulty (1, 2, 3, 4): ");
            difficulty = scnr.nextInt();
            System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, or 5 for a mixture of all: ");
            arithmetic = scnr.nextInt();

            double answer = question(difficulty, arithmetic);
            for (int i = 0; i < 10; i++)
            {
                j = scnr.nextDouble();
                if (j == answer)
                {
                    correct();
                    right++;
                    if(i < 9)
                        answer = question(difficulty, arithmetic);
                }
                else
                {
                    incorrect();
                    wrong++;
                }
            }
            System.out.println("\nYou got " + right + " questions correct and " + wrong + " questions wrong.");
            percentage(right,right + wrong);
            System.out.println("Would you like another student to answer 10 questions? (y/n)");
            c = scnr.next().charAt(0);
            wrong = 0;
            right = 0;
        }
    }
}