package contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        int contador1 = scanner.nextInt();
    
        System.out.println("Digite o segundo numero: ");
        int contador2 = scanner.nextInt();


        try {
            int diferenca = contar(contador1, contador2);
            System.out.println("impressao dos dados: ");
            for(int i = 1; i<=diferenca; i++) {
                System.out.println(i);
            }
        } catch (NumeroMaiorExcessao e) {
            System.out.println("O segundo parametro deve ser maior");
        }
        
    }

    static int contar(int contador1, int contador2) throws NumeroMaiorExcessao {
        if(contador1 > contador2) {
            throw new NumeroMaiorExcessao("O primeiro numero deve ser menor");
        }
        return contador2 - contador1;

    }

}
