package CollectionJava;

import java.util.Scanner;
import java.util.ArrayList;

public class BuscaArrayList {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int num;
		
		nums.add(2);
		nums.add(5);
		nums.add(1);
		nums.add(3);
		nums.add(4);
		nums.add(9);
		nums.add(7);
		nums.add(8);
		nums.add(10);
		nums.add(6);
		
		System.out.print("Insira o número a ser buscado: ");
		num = ler.nextInt();
		if (nums.indexOf(num) == -1) {
			System.out.println("\nO número " + num + " não foi encontrado");
		} else {
			System.out.println("\nO número " + num + " está na posição " + nums.indexOf(num));
		}

	}

}
