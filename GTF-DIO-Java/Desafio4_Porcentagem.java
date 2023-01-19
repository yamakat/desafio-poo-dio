import java.util.*;

public class Desafio4_Porcentagem {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    int M = input.nextInt();
    int D = input.nextInt();

    int desconto = 100-((D*100)/M);

    if (D < M) {
      System.out.println("O desconto foi de " + desconto + "%");
    }
  }
}