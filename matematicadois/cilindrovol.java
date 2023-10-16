package matematicadois;
 import java.util.Scanner;

public class cilindrovol {
public static void main(String[] args) {
    final Scanner cilindro = new Scanner(System.in);
    
    System.out.print("Digite o valor da altura: ");
    double altura =  cilindro.nextDouble();

    System.out.print("Digite o valor do volume: ");
    double volume = cilindro.nextDouble();

    final double raio = Math.sqrt(785 / 3.14 * 13);

    //785 = 3.14 *r²*13
    // r² = 785 / 3.14 * 13
    //r=raiz(785/3,14*13)

    System.out.println("O valor do raio: " + raio);
  }

}
