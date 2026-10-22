public class Test {

    static int factorial(int n) {
        if (n ==0 || n == 1) {
            return 1;
        }

        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
        
    }

    static boolean isStrongNumber(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        int number = 145;

        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong Number.");
        } else {
            System.out.println(number + " is not a Strong Number.");
        }
    }
}
