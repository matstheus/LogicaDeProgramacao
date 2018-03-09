import java.util.Locale;
import java.util.Scanner;

public class URI1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double N1 = sc.nextDouble();
		double N2 = sc.nextDouble();
		double N3 = sc.nextDouble();
		double N4 = sc.nextDouble();

		double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + N4) / 10;

		System.out.printf("Media: %.1f\n", media);

		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else if (media < 4.9) {
			System.out.println("Aluno reprovado.");
		} else {
			System.out.println("Alume em exame.");
		double exame = sc.nextDouble();
		System.out.println("Nota do Exame: " + exame);
		double mediaFinal = (media + exame) / 2;
		if (mediaFinal >= 5.0) {
			System.out.println("Aluno aprovado.");
		} else {
			System.out.println("Aluno reprovado.");
		}
			System.out.printf("Media Final: %.1f\n", mediaFinal);
		}

		sc.close();

	}

}
