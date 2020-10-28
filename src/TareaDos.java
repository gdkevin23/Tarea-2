import java.lang.Math;
import java.util.Scanner;


public class TareaDos {

    public static void main(String[] args) {

        int usersNumber;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Digite un número entre 5 y 300: ");
            usersNumber = scanner.nextInt();
        } while (!(usersNumber >= 5 && usersNumber <= 300));

        double squareRootFromUsersNumber = Math.sqrt(usersNumber);
        int counter = 2;
        boolean esPrimo = true;
        while (counter <= squareRootFromUsersNumber) {
            if (usersNumber % counter == 0) {
                esPrimo = false;
            }

            ++counter;
        }

        if (!esPrimo) {
            System.out.println("El número: " + usersNumber + " no es un número primo");
        } else {
            System.out.println("El número: " + usersNumber + " es un número primo");

        }
    }
}






