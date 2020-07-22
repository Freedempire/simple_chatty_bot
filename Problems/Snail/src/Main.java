import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int height = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int dayCount = 0;

        while (true) {
            dayCount++;
            height -= a;
            if (height <= 0) break;
            height += b;
        }

        System.out.println(dayCount);
    }
}