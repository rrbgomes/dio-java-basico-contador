import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		int parametroUm = getParametroValido("Digite o primeiro parâmetro");
		int parametroDois = getParametroValido("Digite o segundo parâmetro");
		
		 try {
		 	contar(parametroUm, parametroDois);
		 }catch (ParametrosInvalidosException exception) {
			 System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		 }
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm>parametroDois) throw new ParametrosInvalidosException();
		int contagem = parametroDois - parametroUm;
		System.out.println("\n\nContagem:\n");
		for(int i=1;i<=contagem;i++){
			System.out.println("Imprimindo: " + i);
		}
	}

    private static Integer getParametroValido(String label){
		System.out.println(label);
		try {
            return (new Scanner(System.in)).nextInt();
        } catch (Exception e) {
            System.out.println("Digite um valor inteiro válido.\n");
        }
		return getParametroValido(label);
    }
}
