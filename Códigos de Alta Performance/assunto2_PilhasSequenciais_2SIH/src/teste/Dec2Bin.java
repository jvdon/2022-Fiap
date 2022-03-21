package teste;

import java.util.ArrayList;
import java.util.Scanner;

import tipoPilha.TipoPilhaInt;

public class Dec2Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TipoPilhaInt pilha = new TipoPilhaInt();
		pilha.init();

		Scanner scan = new Scanner(System.in);

		System.out.print("Numero a ser convertido: ");

		int toConvert = scan.nextInt();
		int resto = toConvert;
		int currentByte = 0;
		int c = 0;
		do {
			currentByte = resto % 2;
			resto /= 2;
			pilha.push(currentByte);
//			System.out.println(currentByte + " - " + c);
			c++;
		} while (resto > 0);
		System.out.println("Binario: ");
		pilha.clear();
	}

}
