import java.util.Scanner;

public class DNA {
    
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String nucleotide = new String();
        String dna = new String();
        String complimentary = new String();
        System.out.println("Give me the first nucleotide: ");
        nucleotide = scan.nextLine();

        while (nucleotide == "A" || nucleotide == "C" || nucleotide == "G" || nucleotide == "T" && nucleotide != "q") {
            System.out.println("Give me a nucleotide, A, C, G or T");
            nucleotide = scan.nextLine();
            dna = dna + nucleotide;
        }
        System.out.println("The DNA sequence is: " + dna);

        while (dna.length >= 0) {
            dna.length = dna.length - 1;
            if (dna.endIndex == "A") {
                complimentary = complimentary + "T";
            } else if (dna.endIndex == "C") {
                complimentary = complimentary + "G";
            } else if (dna.endIndex == "G") {
                complimentary = complimentary + "C";
            } else if (dna.endIndex == "T") {
                complimentary = complimentary + "A";
            }

        }
        System.out.println("The complimentary combination is: " + complimentary);

        int a, c, g, t = 0;
        dna.beginninglength = 0;
        dna.length = dna.beginninglength;
        while (dna.length > 0) {
            dna.length = dna.length - 1;
            if (dna.endIndex == "A") {
                a = a + 1;
            } else if (dna.endIndex == "C") {
                c = c + 1; 
            } else if (dna.endIndex == "G") {
                g = g + 1;
            } else if (dna.endIndex == "T") {
                t = t + 1;
            }
        }
        if (a > dna.beginninglength * 0.4) { 
            System.out.println("That sequence is at higher risk for cancer");
        }
    }
}