public class Main {
    public static void main (String [] args) {
        int balance = 100;
        int topUp = 2000;
        int bonus;
        if (topUp > 1000) {
            bonus = topUp / 100;
        } else {
            bonus = 0;
        }
        balance = balance + topUp + bonus;
        System.out.println("Bonus = " + bonus);
        System.out.println("Balance = " + balance);
    }
}