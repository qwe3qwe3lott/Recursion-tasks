import java.util.Scanner;
public class Task7_92 {
    public static int multiplication(int x, int y) {
        if(y == 1) {
            return x;
        } else {
            return x = x + multiplication(x,y-1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите првое натуральное число: ");
        int x = in.nextInt();
        for(;true;) {
            if (x < 1) {
                System.out.println("Число не натуральное - введите новое: ");
                x = in.nextInt();
            } else {
                break;
            }
        }
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
        System.out.println("Произведение: " + multiplication(x,y));
    }
}
