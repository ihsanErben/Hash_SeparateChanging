
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("hash table size: ");
        int size = input.nextInt();
        Hash x = new Hash(size);
        System.out.println("-----------------------------------");
        x.printALL();
        System.out.println("-----------------------------------");
        while (true) {
            System.out.println("1 - add");
            System.out.println("0 - exit");
            System.out.print("secim :");
            int a = input.nextInt();
            switch (a) {
                case 0:
                    return;
                case 1:
                    System.out.print("data: ");
                    int data = input.nextInt();
                    x.add(data);
                    System.out.println("");
                    x.printALL();
                    break;
                default:
                    System.out.println("invalid value");
                    break;
            }
            System.out.println("-------------------");
        }
    }
}
