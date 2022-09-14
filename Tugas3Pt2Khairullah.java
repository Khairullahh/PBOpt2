import java.util.Random;
import java.util.Scanner;

public class Tugas3Pt2Khairullah {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String jawab = "y";
        Random ra = new Random();

        String J = "j";
        String T = "T";
        String K = "k";

        String[] plays = {J, T, K};

        String komputer;
        String anda;

        int index;


        while (jawab.equals("y")) {
            System.out.print("Masukkan jari [J/T/K]: ");
            anda = sc.nextLine();
            System.out.println();

            index = ra.nextInt(3);
            komputer = plays[index];

            System.out.println("Anda memasukkan: " + anda + "\nKomputer memasukkan: " + komputer);

            if (anda.equals(komputer)) {
                System.out.println("seri");

            } else if (anda.equals(J) && komputer.equals(K)) {
                System.out.println("hasil : anda menang");

            } else {
                System.out.println("hasil : anda menang");

            }
            System.out.println();

            System.out.print("ingin suit dengan komputer lagi?: ");
            jawab = sc.nextLine();

        }
    }
}

