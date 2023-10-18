import java.util.Scanner;

public class Contador {
    public static void main(String[] args)  {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o 1º número");
        int parametroUm = terminal.nextInt();

          System.out.println("Digite o 2º número");
        int parametroDois = terminal.nextInt();

        try {
            
            contar(parametroUm,parametroDois);
        
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
      
    }

    static int contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        //validar se parametroUm é MAIOR que o parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {

            int contagem = parametroDois - parametroUm;
        
        //realizar o for para imprimir os números com base na variável contagem
            for (int i = 1; i <= contagem; i ++) {
                System.out.println("Imprimindo o número " + i);
            }
            return contagem;
        }
        
    }
}
