package matematicadois;
import java.util.Scanner;

public class esferaarea {
        public static void main(String[] args) {
            Scanner sfera = new Scanner(System.in);

            System.out.print("Digite o valor do area: ");
            double area = sfera.nextDouble();

            double raio = (Math.sqrt( area / (3.14 * 4) ));
            System.out.println("O valor do raio: " + raio );


            
   // 154 = 4 * 3.14 * r²

;        }
}
