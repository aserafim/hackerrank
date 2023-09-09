import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exercicio {

    //Exercicio 1
    public static void welcomeToJava(){

   //     System.out.println("A solução do exercício é muito simples.\n Basta utilizar o método de impressão na tela.\n" +
     //           "System.out.println(\"" + "Hello, World" + "\""");
        //System.out.println("O seu nome é \"" + nome + "\"" e o meu é Java");

        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }

    //Exercicio 2
    public static void stdInOut(){
        Scanner scan = new Scanner(System.in);
        int primNum = scan.nextInt();
        int segNum = scan.nextInt();
        int terNum = scan.nextInt();
        scan.close();
        System.out.println(primNum);
        System.out.println(segNum);
        System.out.println(terNum);
    }

    public static void ifElse() {
        final Scanner scanner;
        scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 != 0) {
            System.out.println("Weird");
        } else if (N % 2 == 0) {
                if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
                } else if (N >= 6 && N <= 20) {
                    System.out.println("Weird");
                    } else if (N > 20) {
                        System.out.println("Not Weird");
                    }
        }
        scanner.close();
    }

    public static void stdInOutDois(){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = "";
        s = scan.nextLine();
        s += scan.nextLine();

        scan.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    public static void outputFormatting(){
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s",s1);
            System.out.printf("%03d%n",x);
            //System.out.printf("%s %15d %n",s1,x);
            //System.out.printf("%s %15d %n",s1,x);
        }
        System.out.println("================================");
    }

    public static void loopsUm() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int i = 1;
        bufferedReader.close();
        for(i = 1; i <= 10; i++) {
            System.out.printf("%d x ", N);
            System.out.printf("%d = ", i);
            System.out.printf("%d%n", i * N);
        }
    }

}
