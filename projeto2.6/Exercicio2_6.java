import java.util.*;
public class Exercicio2_6 {

	public static void main(String[] args) {
		// 1 - variaveis
		float peso;
		float altura;
		float IMC; // Indice de Massa Corporal
		float pesoIdealMax;
		float pesoIdealMin;
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		System.out.print("Digite o peso em Kg: ");
		peso = leia.nextFloat();
		
		System.out.print("Digite a altura em metros: ");
		altura = leia.nextFloat();
		
		// 3 - calculos e saidas
		IMC = peso / (altura * altura);
		if (IMC < 20) {
			System.out.println("Pessoa abaixo do peso");
		} else if (IMC <= 25) {
			System.out.println("Pessoa no peso ideal");
		} else {
			System.out.println("Pessoa acima do peso");
		}
		pesoIdealMin = 20 * altura * altura;
		pesoIdealMax = 25 * altura * altura;
		System.out.println("Indice de Massa Corporal (IMC): " + IMC);
		System.out.println("Peso ideal minimo: " + pesoIdealMin);
		System.out.println("Peso ideal maximo: " + pesoIdealMax);
	}

}
