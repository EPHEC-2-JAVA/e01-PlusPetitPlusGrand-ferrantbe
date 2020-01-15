package exemples;

import java.util.Scanner;

public class LireEntier{
    public static void main(String [] args) {
        // initialisation lecture
        Scanner sc = new Scanner(System.in);
        System.out.print("Donner un entier");
        //lecture de la reponse
        int r = sc.nextInt();
        System.out.println("Vous avez donńe l’entier "+ r); }
}
