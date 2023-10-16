package matematicadois;
import java.util.Scanner;
public class conevol {
    public static void main(String[] args){

        Scanner clone = new Scanner(System.in); 

        System.out.print("Digite o volume do cone: ");
        double volume = cone.nextDouble();

        System.out.print("Digite a altura do cone: ");
        double altura = cone.nextDouble();

        double raio = (float) Math.sqrt(volume * (3 * altura) * 3.14);
        System.out.print("O raio do cone vai ser: " + raio);
    }
    
}
