import java.util.Scanner; 
 
public class Desafio3_Fila { 
 
    public static void main(String[] args) {
      
      String[] nomesFila = new String[3];
      
      Scanner leitor = new Scanner(System.in);

      int nome = 0;

      do {
        nomesFila[nome] = leitor.next();
        nome++;
      } while (nome < nomesFila.length);
      
      for (int a = 0; a < nome; a++) {
        System.out.println(nomesFila[a] + " - está na posição: " + (a + 1));
      }      
    } 
}