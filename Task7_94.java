import java.util.Scanner;
public class Task7_94 {
    public static int stepen(int x, int y) {
        if(y == 1) {
            return x;
        } else {
            return x = x * stepen(x,y-1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int x = in.nextInt();
        System.out.println("Введите второе натуральное число: ");
        int y = in.nextInt();
        for(;true;) {
            if (y < 1) {
                System.out.println("Число не натуральное - введите новое: ");
                y = in.nextInt();
            } else {
                break;
            }
        }
        System.out.println(stepen(x,y));
    }
}
