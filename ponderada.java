import java.util.Scanner;

public class ponderada {
    public static void main( String[] args) {
        Scanner notas = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.print("Informe a primeira nota: ");
        nota1 = Double.parseDouble(notas.nextLine());

        System.out.print("Informe a segunda nota: ");
        nota2 = Double.parseDouble(notas.nextLine());

        System.out.print("Informe a terceira nota: ");
        nota3 = Double.parseDouble(notas.nextLine());



        media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4)) / 9;

        System.out.println("A média foi: " + media);
    }

}
