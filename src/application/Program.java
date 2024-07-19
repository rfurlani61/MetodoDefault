package application;

import java.util.Locale;
import java.util.Scanner;

import model.service.BrazilInterestService;
import model.service.InterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantia: ");
		Double quantia = sc.nextDouble();
		System.out.print("Meses: ");
		Integer meses = sc.nextInt();
		InterestService uts = new BrazilInterestService(2.0);
		System.out.print("Pagamento após " + meses + " meses:" + String.format("%.2f", uts.payment(quantia, meses)));
		
		sc.close();
	}

}
