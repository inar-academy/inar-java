package week_06.assignments;

public class Question_06_29 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 2; i < 1000; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2 + ")"));
            }

        }
    }

    static boolean isPrime(int num) {
        boolean prime = true;
        for (int i = 2; i <= (num / 2); i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

}