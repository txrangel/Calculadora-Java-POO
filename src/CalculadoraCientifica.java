import java.util.Scanner;
public class CalculadoraCientifica{
    
    Scanner sc = new Scanner(System.in);
    public double Digitar_Primeiro_Numero(){
        System.out.printf("Digite um numero:\n");
        double n = sc.nextInt();
        return(n);
    }

    public double Digitar_Segundo_Numero(){
        System.out.printf("Digite um numero novamente:\n");
        double n = sc.nextInt();
        return(n);
    }
    
    public int Perguntar(){
        System.out.printf("Dige o Numero Referente a sua Opção:\n");
        System.out.printf("1 - Soma\n");
        System.out.printf("2 - Subtração\n");
        System.out.printf("3 - Divisão\n");
        System.out.printf("4 - Multiplicação\n");
        System.out.printf("5 - Raiz\n");
        System.out.printf("6 - Potencia\n");
        int resposta = sc.nextInt();
        if (resposta<1 || resposta>6)
            System.out.printf("Numero incorreto\n");
        return(resposta);
    }

    public double soma(double x, double y){return x+y;}
    
    public double subracao(double x, double y){return x-y;}
    
    public double divisao(double x, double y ){return x/y;}

    public double multiplicacao(double x, double y){return x*y;}

    public double raiz(double x){return Math.sqrt(x);}

    public double potencia(double x, double y){return Math.pow(x, y);}

    public boolean Continuar(){
        System.out.printf("Deseja Continuar?\n");
        System.out.printf("1 - Sim\n");
        System.out.printf("0 - Não\n");
        int escolha = sc.nextInt();
        boolean bool = (escolha==1);
        return(bool);
    }
}
