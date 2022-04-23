import java.util.Scanner;
public class Calculadora {
    Scanner ler = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        CalculadoraCientifica Cal = new CalculadoraCientifica();
        double result;
        double n1,n2;
        int escolha;
        boolean controlador = true;
        while (controlador==true){
            escolha = Cal.Perguntar();
                if(escolha==1){
                    n1 = Cal.Digitar_Primeiro_Numero();
                    n2 = Cal.Digitar_Segundo_Numero();
                    result = Cal.soma(n1, n2);
                    System.out.println("Resutado: "+result);
                }else if(escolha==2){
                    n1 = Cal.Digitar_Primeiro_Numero();
                    n2 = Cal.Digitar_Segundo_Numero();
                    result = Cal.subracao(n1, n2);
                    System.out.println("Resutado: "+result);
                }else if(escolha==3){
                    n1 = Cal.Digitar_Primeiro_Numero();
                    n2 = Cal.Digitar_Segundo_Numero();
                    result = Cal.divisao(n1, n2);
                    System.out.println("Resutado: "+result);
                }else if(escolha==4){
                    n1 = Cal.Digitar_Primeiro_Numero();
                    n2 = Cal.Digitar_Segundo_Numero();
                    result = Cal.multiplicacao(n1, n2);
                    System.out.println("Resutado: "+result);
                }else if(escolha==5){
                    n1 = Cal.Digitar_Primeiro_Numero();
                    result = Cal.raiz(n1);
                    System.out.println("Resutado: "+result);
                }else if(escolha==6){
                    n1 = Cal.Digitar_Primeiro_Numero();
                    n2 = Cal.Digitar_Segundo_Numero();
                    result = Cal.potencia(n1, n2);
                    System.out.println("Resutado: "+result);
                }
            controlador = Cal.Continuar();
        }
    }
}
