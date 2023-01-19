import java.util.Scanner;

// fazer programa que pergunte o turno em que a pessoa estuda (M = matutino, V = vespertino e N = noturno)
// imprimir mensagens de acordo com o turno

public class Desafio2_Turno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //System.out.println("Em qual turno você estuda? Digite M, V ou N: ");
        char turno = leitor.next().toUpperCase().charAt(0);

        if (turno == 'M') {
            System.out.println("Bom Dia!");
        } else if (turno == 'V') {
            System.out.println("Boa Tarde!");
        } else if (turno == 'N') {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor Inválido!");
        }

        }
    }