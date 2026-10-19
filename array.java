import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double prices[] = new double[10];
        double max, min, sum = 0, average;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            prices[i] = sc.nextDouble();
            sum = sum + prices[i];

            if (prices[i] > 1000) {
                count++;
            }
        }

        max = prices[0];
        min = prices[0];

        for (int i = 1; i < 10; i++) {
            if (prices[i] > max) {
                max = prices[i];
            }

            if (prices[i] < min) {
                min = prices[i];
            }
        }

        average = sum / 10;

        System.out.println("Most expensive product: " + max);
        System.out.println("Least expensive product: " + min);
        System.out.println("Average price: " + average);
        System.out.println("Number of products costing more than 1000: " + count);
    }
}
