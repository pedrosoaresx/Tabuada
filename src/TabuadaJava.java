import java.util.Scanner;

public class TabuadaJava {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Qual número você dejesaria obter a tabuada?: ");
            int number = teclado.nextInt();
            for(int i = 1; i < 11; i++) {
                int soma = number*i;
                System.out.println(number + "x" + i + "=" + soma);
            }
        }
    }

