public class Main {
    public static void main(String[] args) {
        int balance = 5000;
        double interestRate = .17;
        int month = 1;
        double monthlyInterest = balance;
        System.out.println("Your balance is " + balance);
        while (month < 3){
            monthlyInterest = monthlyInterest * .17 + monthlyInterest;
            if (month == 1) {
                System.out.println("Your interest after month one is " + monthlyInterest);
            } else if (month == 2){
                System.out.println("Your interest after month two is " + monthlyInterest);
            }
            month = month + 1;
        }
    }
}