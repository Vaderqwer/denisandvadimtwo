import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1-ое число");
        int a = in.nextInt();
        System.out.println("Введите 2-ое число");
        int b = in.nextInt();
        System.out.println("Введите 3-ое число");
        int c = in.nextInt();
        System.out.println("Введите 4-ое число");
        int d = in.nextInt();
        if (a == b){}
        else {System.out.println("Не ровны");}
        if (a == c){}
        else {System.out.println("Не ровны");}
        if (a == d){
            System.out.println("Ровны");
        }
        else {System.out.println("Не ровны");}
    }
}