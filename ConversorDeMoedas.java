import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a moeda de origem:");
        System.out.println("1 - USD (Dólar dos EUA)");
        System.out.println("2 - BRL (Real Brasileiro)");
        System.out.println("3 - EUR (Euro)");
        System.out.println("4 - AOA (Kwanza Angolano)");
        System.out.println("5 - ARS (Peso Argentino)");
        System.out.println("6 - CNY (Yuan Chinês)");
        System.out.println("7 - GBP (Libra Esterlina)");
        int opcaoOrigem = scanner.nextInt();

        System.out.println("Selecione a moeda de destino:");
        System.out.println("1 - USD (Dólar dos EUA)");
        System.out.println("2 - BRL (Real Brasileiro)");
        System.out.println("3 - EUR (Euro)");
        System.out.println("4 - AOA (Kwanza Angolano)");
        System.out.println("5 - ARS (Peso Argentino)");
        System.out.println("6 - CNY (Yuan Chinês)");
        System.out.println("7 - GBP (Libra Esterlina)");
        int opcaoDestino = scanner.nextInt();

        System.out.print("Digite o valor a ser convertido: ");
        double valorOrigem = scanner.nextDouble();

        double taxaDeConversaoOrigem = 0.0;
        double taxaDeConversaoDestino = 0.0;

        switch (opcaoOrigem) {
            case 1:
                taxaDeConversaoOrigem = 1.0;
                break;
            case 2:
                taxaDeConversaoOrigem = 5.0;
                break;
            case 3:
                taxaDeConversaoOrigem = 5.30;
                break;
            case 4:
                taxaDeConversaoOrigem = 0.006;
                break;
            case 5:
                taxaDeConversaoOrigem = 0.0145;
                break;
            case 6:
                taxaDeConversaoOrigem = 0.70;
                break;
            case 7:
                taxaDeConversaoOrigem = 6.12;
                break;
            default:
                System.out.println("Moeda de origem inválida.");
                scanner.close();
                return;
        }

        switch (opcaoDestino) {
            case 1:
                taxaDeConversaoDestino = 1.0;
                break;
            case 2:
                taxaDeConversaoDestino = 5.0;
                break;
            case 3:
                taxaDeConversaoDestino = 5.30;
                break;
            case 4:
                taxaDeConversaoDestino = 0.006;
                break;
            case 5:
                taxaDeConversaoDestino = 0.0145;
                break;
            case 6:
                taxaDeConversaoDestino = 0.70;
                break;
            case 7:
                taxaDeConversaoDestino = 6.12;
                break;
            default:
                System.out.println("Moeda de destino inválida.");
                scanner.close();
                return;
        }

        double valorDestino = (valorOrigem / taxaDeConversaoOrigem) * taxaDeConversaoDestino;

        System.out.println("O valor em moeda de destino é: " + valorDestino);

        scanner.close();
    }
}
