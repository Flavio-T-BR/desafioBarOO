package desafioBarOO;

import java.util.Locale;
import java.util.Scanner;

import util.Bill;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Sexo: ");
		char gender = sc.next().charAt(0);
		
		System.out.print("Quantidade de cervejas: ");
		int beer = sc.nextInt();
		
		System.out.print("Quantidade de refrigerantes: ");
		int softDrink = sc.nextInt();
		
		System.out.print("Quantidade de espetinhos: ");
		int barbecue = sc.nextInt();
		
		double feeding = Bill.feeding(beer, softDrink, barbecue);
		
		double cover = Bill.cover(feeding);
		
		double ticket = Bill.ticket(gender);
		
		double total = Bill.total(cover, feeding, ticket);
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f%n", feeding);
		
		if (feeding < 30.00) {
			System.out.printf("Couvert = R$ %.2f%n", cover);
		} else {
			System.out.println("Isento de Couvert");
		}
		
		System.out.printf("Ingresso = R$ %.2f%n", ticket);
		System.out.println();
		
		System.out.printf("Valor a pagar = R$ %.2f", total);
		
		sc.close();
	}

}
