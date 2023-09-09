import java.io.IOException;
import java.util.Scanner;

public class SelecionaExercicio {

    public static void menu() {

        System.out.println("Exercícios disponíveis: \n");
        System.out.println("1 - Welcome to Java!");
        System.out.println("2 - Java Stdin and Stdout I");
        System.out.println("3 - Java If-Else I");
        System.out.println("4 - Java Stdin and Stdout II");
        System.out.println("5 - Java Output Formatting");
        System.out.println("6 - Java Loops I");

        int opcao = 0;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\nSelecione o exercício desejado: ");
             opcao = input.nextInt();
        }

        switch (opcao){
            case 0:
                System.out.println("Nenhuma opção selecionada!");
                break;
            case 1:
                Exercicio.welcomeToJava();
                break;
            case 2:
                Exercicio.stdInOut();
                break;
        }

    }

}
