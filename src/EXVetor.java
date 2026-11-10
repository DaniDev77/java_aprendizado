import java.util.Locale;
import java.util.Scanner;

public class EXVetor {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
      System.out.print("Quantos Numeros voce vai digitar?");
      n = sc.nextInt();

      //cria um vetor que vai armazenar os numeros
      double [] vet = new double[n];

      //enqquanto i for menor que N  , vai pedir para digitar um numero e ira guardar no vetor
      for(int i = 0; i < n; i++ ){
          System.out.print("Digite um numero: ");
          vet[i] = sc.nextDouble();
      }

        System.out.println();
      System.out.print("Numeros Digitados: ");
      for(int i = 0; i < n; i++){
          System.out.print(String.format("%.1f ", vet[i]));
      }
        sc.close();
    }
}
