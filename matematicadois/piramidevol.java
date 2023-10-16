package matematicadois;

import java.util.Scanner;
public class piramidevol {
    public static void main (String[] args) {

        Scanner pirimidi = new Scanner(System.in);

        System.out.print("Digite o volume da pirâmide: ");
        float volume = pirimidi.nextFloat();

        System.out.print("Digite a altura da pirâmide: ");
        float altura = pirimidi.nextFloat();

        float area = (float) (volume * altura * 3);
        System.out.print("A área da pirâmide vai ser: " + area);
    }
}

