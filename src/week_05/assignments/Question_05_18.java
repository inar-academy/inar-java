package week_05.assignments;
//Note : You can solve this problem in different classes. For example :
// For patter A Question_05_18_A, For B Question_05_18_B ...
public class Question_05_18 {
    public static void main(String[] args) {
        patternA();
        System.out.println("---------------------------------------------------");
        patternB();
        System.out.println("--------------------------------------------------------");
        patternC();
        System.out.println("-----------------------------------------------------");
        patternD();
    }

    public static void patternA() {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void patternB() {
        for (int i = 6; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void patternC() {
        for (int i = 1; i < 7; i++) {
            for (int j = 7; j > i; j--) {
                System.out.print("  ");
            }

            for (int k = i; k > 0; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void patternD() {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k < 8 - i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
