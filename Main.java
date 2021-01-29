public class Main {
    public static void main (String [] args) {
        int balance = 100;
        int top_up = 2000;
        int bonus;
        if (top_up > 1000) {
            bonus = top_up / 100;
        } else {
            bonus = 0;
        }
        balance = balance + top_up + bonus;
        System.out.println("Bonus = " + bonus);
        System.out.println("Balance = " + balance);
    }
}