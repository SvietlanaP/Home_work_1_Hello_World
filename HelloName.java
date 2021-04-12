import java.util.Scanner;

public class HelloName {
    public static void main(String[] args){
        System.out.println("What is your name?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello, "+name);
    }
}
