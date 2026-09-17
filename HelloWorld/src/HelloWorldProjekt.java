import java.util.Scanner;

public class HelloWorldProjekt {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner keyboard = new Scanner(System.in);
        int zahl1 = 0;
        int zahl2 = 0;
        int summe = 0;

        System.out.println("Zahl 1 eingeben:");
        zahl1 = keyboard.nextInt();

        System.out.println("Zahl 2 eingeben:");
        zahl2 = keyboard.nextInt();

        summe = zahl1 + zahl2;
        System.out.println("Ergebnis:");
        System.out.println(summe);
        //kurzer Test richtiger Github Account
    }
}
