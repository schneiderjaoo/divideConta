import java.util.Scanner;

public class contaAmigos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //pede quanto deu a conta
        System.out.print("Digite o valor total da conta: ");
        float valorTotal = scanner.nextDouble();
        //quantidade de amigos 
        System.out.print("Digite o número de amigos presentes: ");
        int numeroAmigos = scanner.nextInt();

        scanner.close();
        
        if (numeroAmigos <= 0) {
            System.out.println("O número de amigos deve ser maior que zero.");
        } else {
            float valorPorAmigo = valorTotal / numeroAmigos;
            //printa na tela o valor para cada amigo
            System.out.printf("Cada amigo deve pagar: R$ ", valorPorAmigo);
        }
    }
}
