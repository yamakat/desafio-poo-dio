import java.util.Scanner;

public class Desafio1_Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();

        //deve verificar se a média de idade da turma varia entre 0 e 25, 26 e 60 e maior que 60
        // deve dizer se a turma é jovem, adulta ou idosa conforme a média calculada

        int mediaIdades = (idade1 + idade2 + idade3)/3;

        if (25 >= mediaIdades && mediaIdades >= 0) {
            System.out.println("Jovem!");
        } else if (26 <= mediaIdades && mediaIdades <= 60) {
            System.out.println("Adulta!");
        } else if (mediaIdades > 60) {
            System.out.println("Idosa!");
        }

    }
}