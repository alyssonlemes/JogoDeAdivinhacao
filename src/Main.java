import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int aleatorio = 0;
        int tentativas = 1;
        aleatorio = new Random().nextInt(10);

        System.out.println("\n---------------------Jogo de adivinhação---------------------");
        System.out.println("\nFoi gerado um número aleatório, tente adivinhar com base nas dicas!!!");

        while (tentativas < 5) {
        System.out.println("\nInsira um número: ");
        numero = scanner.nextInt();

            if (numero > aleatorio) {
                System.out.println("Número digitado é maior do que o escolhido!!!");

            } else if(numero < aleatorio){
                System.out.println("Número digitado é menor do que o escolhido!!!");

            }

            else if(numero == aleatorio){
                System.out.println("Parabéns!!! Você acertou o número com o total de tentativas igual a: " + tentativas);
            }

            tentativas++;


        }

        if(tentativas == 5){
            System.out.println("As tentativas acabaram, finalizando jogo");
        }

        System.out.println("\n-------------------------------------------------------------");

        }
    }
