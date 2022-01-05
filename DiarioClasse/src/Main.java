import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("--- DI�RIO DE CLASSE ---");

		Scanner scanner = new Scanner(System.in);

		String[][] diario = new String[5][5];

		diario[1][0] = "Maria";
		diario[2][0] = "Pedro";
		diario[3][0] = "Ana  ";
		diario[4][0] = "Jos� ";

		diario[0][1] = "15/12/2021";
		diario[0][2] = "16/12/2021";
		diario[0][3] = "17/12/2021";
		diario[0][4] = "18/12/2021";

		for (int i = 1; i < 5; i++) {
			System.out.println("Realizando a chamada do dia " + diario[0][i]);
			int b = 1;

			for (int c = 1; c < 5; c++) {
				System.out.println("O aluno " + diario[b][0] + " est� presente? ");
				String registro = scanner.nextLine();
				diario[i][c] = registro;
				b++;
			}
			System.out.println("-------------------");
		}

		for (int i = 0; i < diario.length; i++) {
			for (int x = 0; x < diario[i].length; x++) {
				System.out.print(diario[i][x] + "              ");
			}
			System.out.println("");
		}
		scanner.close();
	}
}