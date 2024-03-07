import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*  1. Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
                A média dos números 4, 5 e 6.
                A soma das duas médias.
                A média das médias.
        */
        int media1 = (8 + 9 + 7) / 3;
        int media2 = (4 + 5 + 6) / 3;
        int somaDasMedias = media2 + media1;
        int mediaDasMedias = (media1 + media2 + somaDasMedias) / 3;

        System.out.println("A média dos numeros 8,9 e 7 é... " + media1);
        System.out.println("A média dos numeros 4,5 e 6 é... " + media2);
        System.out.println("A soma das duas médias acima é... " + somaDasMedias);
        System.out.println("A média de todas as médias é... " + mediaDasMedias);

        System.out.println("*********************************************************");


        /*2 - Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
        antecessor e seu sucessor.
         */
        System.out.println("Digite um número inteiro...");
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        System.out.println("O antecessor do seu numero é  " + --numero);
        System.out.println("O sucessor do seu numero é  " + (++numero + 1));

        System.out.println("*********************************************************");

        /*3 - Crie um codigo que contenha 3 operações matematicas de sua escolha.
         */
        int n1 = 10;
        int n2 = 5;

        System.out.println(" A soma dos numeros são: " + (n1+n2));
        System.out.println(" A divisão dos numeros são: " + (n1/n2));
        System.out.println(" A multiplicação dos numeros são: " + (n1*n2));

        System.out.println("*********************************************************");

       /* 4 - Desenvolva um codigo que solicite ao usuario seu Nome, Sobrenome, Idade, Endereço
              e ao final mostre todos os dados informados
        */
        System.out.println("Qual é seu nome ?");
        String nome = scanner.nextLine();

        System.out.println("Qual é seu sobre nome ?");
        String sobreNome = scanner.nextLine();

        System.out.println("Qual é sua idade?");
        int idade = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Qual seu endereço?");
        String endereço = scanner.nextLine();

        System.out.println(nome + sobreNome + idade + endereço);

        System.out.println("*********************************************************");

       /* 5 - Crie um algoritmo que cadastra o nome e a idade de um usuario,
              após o cadastro mostre em que ano esse usuario nasceu.
        */
        System.out.println("Qual é seu nome ?");
        String nome1 = scanner.nextLine();

        System.out.println("Qual é sua idade?");
        int anoAtual = 2024;
        int idade1 = scanner.nextInt();


        System.out.println(" Sua data de nascimento é "+ (anoAtual-idade1) );

    }
        }



