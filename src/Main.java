import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int randomNum = (int)(Math.random() * 1001);
        int palpite = 0;
        int cont = 0;

        System.out.println(randomNum);

        while (palpite != randomNum) {

            cont++;

            System.out.println("Diga seu palpite: ");
            palpite = sc.nextInt();

            if (palpite > randomNum) {
                System.out.println("Palpite MAIOR que o número sorteado. Tente novamente!");
            }
            else if (palpite < randomNum){
                System.out.println("Palpite MENOR que o número sorteado. Tente novamente!");
            }
        }

        System.out.println("Parabéns, você acertou o número sorteado " + randomNum + " em " + cont + " tentativas. ");
        sc.close();
    }
}
