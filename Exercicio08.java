//4. Faça um Programa que pergunte quanto você ganha por hora e o
// número de horas trabalhadas no mês. Calcule e mostre o total
// do seu salário no referido mês.

package prog_exercicios;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.print("Quanto você ganha por hora? "); 
		double valorHora = input.nextDouble(); //primeiro perguntei ao usuário quanto ele ganha por hora e armazenei o valor digitado na variável valorHora.
		
		System.out.print("Quantas horas você trabalhou no mês? ");
		double horaTrabalhadas = input.nextDouble(); //Em seguida, perguntEI quantas horas ele trabalhou no mês e armazenei o valor digitado na variável horasTrabalhadas.
		
		double salario = valorHora * horaTrabalhadas; //Calculei salário multiplicando o valor da hora pelo numero do salário
		
		System.out.printf("Seu salário por mês é: R$ %.2f", salario); //Por fim, usei o método printf da classe System.out para imprimir o valor do salário na tela com duas casas decimais.
		
		
		
	
	}

}
