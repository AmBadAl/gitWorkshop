import java.util.Scanner;

public class gitWorkshop {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("The changes have been done!");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(add(num1, num2));
    }
    static int add(int a, int b){
        return a + b;
    }
}
