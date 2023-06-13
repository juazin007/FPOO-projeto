package execicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner objScan = new Scanner(System.in);
		
		System.out.println("Codigos dos Cargos");
		System.out.println(" 1 - Escriturário");
		System.out.println(" 2 - Secretário");
		System.out.println(" 3 - Caixa");
		System.out.println(" 4 - Gerente");
		System.out.println(" 5 - Diretor");
		
		System.out.println("Digite o código do Cargo: ");
		int codigoCargo = objScan.nextInt();
		
		System.out.println("Digite o Salario Atual");
		int salarioAtual = objScan.nextInt();
		
		

	}

}
