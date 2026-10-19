import java.util.Scanner;

class Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double amount = sc.nextDouble();

        int integerPart = (int) amount;
        double decimalPart = amount - integerPart;

        System.out.println("Integer part : " + integerPart);
        System.out.println("Decimal part : " + decimalPart);

        sc.close();
    }
}
