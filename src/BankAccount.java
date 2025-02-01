public class BankAccount {
    public static void main(String[] args) {
        double checkBalance = 2175.37;
        checkBalance -= 302.50;
        checkBalance += 50.03;
        checkBalance /= 2;
        checkBalance += 20.00;
        checkBalance -= 1;
        checkBalance *= 2;
        checkBalance += 1;
        System.out.printf("%.2f", checkBalance);
        System.out.println();
    }

}
