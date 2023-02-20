
import java.util.Scanner;


public class resolução {
    private static Character aux;

	public static void main(String[] args) {
		
		//Variaveis
		int listaAndar[] = new int[16];
		int listaTurno[] = new int[3];
		int listaElevador[] = new int[5];
		int matrizElevTur[][] = new int[3][5];
		char maxElevador = '0';
		char minElevador = '0';
		Integer andar;
		char ad = 'S';
		char maxEleTu = '0';
		char minEleTu = '0';
		int num1 = 0;
		Integer num2 = 0;
		int num3 = 0;
		Integer num4 = 0;
		int num5 = 0;
		Integer num6 = 0;
		int num7 = listaTurno[0];
		char maxTu = '0';
		float perA = 0;
		float perB = 0;
		float perC = 0;
		float perD = 0;
		float perE = 0;

		Scanner sc = new Scanner(System.in);

		do {
			// Dados digitados dos usuarios
			System.out.println("Digite o andar a qual se dirige (de 0 a 15)? ");
			andar = sc.nextInt();
			if (andar < 0) {
				System.out.println("Valor Invalido");
				return;
			}
			if (andar > 15) {
				System.out.println("Valor Invalido");
				return;
			}
			
			num1 = listaAndar[andar] + 1;
			listaAndar[andar] = num1;
			sc.nextLine();
			
			System.out.println("Digite o elevador usado (de A a E): ");
			char elev = sc.nextLine().charAt(0);
			
			aux = Character.toUpperCase(elev);
			if (aux == 'A') {
				num2 = 0;
			} else if (aux == 'B') {
				num2 = 1;
			} else if (aux == 'C') {
				num2 = 2;
			} else if (aux == 'D') {
				num2 = 3;
			} else if (aux == 'E') {
				num2 = 4;
			} else {
				System.out.println("Valaor Invalido");
				return;
			}

			num3 = listaElevador[num2] + 1;
			listaElevador[num2] = num3;
			sc.nextLine();
			
			System.out.println("Em qual turno (M(Manha),V(Vespertino),N(Noite))? ");
			char turno = sc.nextLine().charAt(0);
			
			char aux2 = Character.toUpperCase(turno);
						if (aux2 == 'M') {
				num4 = 0;
			} else if (aux2 == 'V') {
				num4 = 1;
			} else if (aux2 == 'N') {
				num4 = 2;
			} else if (aux2 != 'M'||aux2 != 'V'|| aux2 != 'N') {
				System.out.println("Valor Invalido");
				return;
			}

			num5 = listaTurno[num4] + 1;
			listaTurno[num4] = num5;
			num6 = matrizElevTur[num4][num2] + 1;
			matrizElevTur[num4][num2] = num6;

			// Adicionar mais informações e retorna para o inicio da ação

			System.out.println("Quer adicionar mais dados? (S/N)");
			ad = sc.nextLine().charAt(0);
		} while (ad == 'S' || ad == 's');
		sc.close();
		
		// processa as informações para o elevador menos utilizado
		int minAndar = listaAndar[0];
		int i1 = 0;
		int pos1 = 0;
		do {
			if (minAndar >= listaAndar[i1]) {
				minAndar = listaAndar[i1];
				pos1 = i1;
			}
			i1++;
		} while (i1 < 16);
		
		// Elevador mais utilizado
		int i2 = 0;
		int pos2 = 0;
		int maxElev = listaElevador[0];
		do {
			if (maxElev <= listaElevador[i2]) {
				maxElev = listaElevador[i2];
				pos2 = i2;
			}
			i2++;
		} while (i2 < 5);

	
		if (pos2 == 0) {
			maxElevador = 'A';
		} else if (pos2 == 1) {
			maxElevador = 'B';
		} else if (pos2 == 2) {
			maxElevador = 'C';
		} else if (pos2 == 3) {
			maxElevador = 'D';
		} else if (pos2 == 4) {
			maxElevador = 'E';
		}
		
		
		int i3 = 0;
		int pos3 = 0;
		int minElev = listaElevador[0];
		do {
			if (minElev >= listaElevador[i3]) {
				minElev = listaElevador[i3];
				pos3 = i3;
			}
			i3++;
		} while (i3 < 5);
		
		if (pos3 == 0) {
			minElevador = 'A';
		} else if (pos3 == 1) {
			minElevador = 'B';
		} else if (pos3 == 2) {
			minElevador = 'C';
		} else if (pos3 == 3) {
			minElevador = 'D';
		} else if (pos3 == 4) {
			minElevador = 'E';
		}
		
		
		int i4 = 0;
		int minElevTur = matrizElevTur[i4][pos3];
		int pos4 = 0;
		do {
			if (minElevTur >= matrizElevTur[i4][pos3]) {
				minElevTur = matrizElevTur[i4][pos3];
				pos4 = i4;
			}
			i4++;
		} while (i4 < 3);
		
		if (pos4 == 0) {
			minEleTu = 'M';
		} else if (pos4 == 1) {
			minEleTu = 'V';
		} else if (pos4 == 2) {
			minEleTu = 'N';
		}

		
		int i5 = 0;
		int maxElevTur = matrizElevTur[i5][pos2];
		int pos5 = 0;
		do {
			if (maxElevTur <= matrizElevTur[i5][pos2]) {
				maxElevTur = matrizElevTur[i5][pos2];
				pos5 = i5;
			}
			i5++;
		} while (i5 < 3);
		if (pos5 == 0) {
			maxEleTu = 'M';
		} else if (pos5 == 1) {
			maxEleTu = 'V';
		} else if (pos5 == 2) {
			maxEleTu = 'N';
		}
		
	
		int i6 = 0;
		int pos6 = 0;
		do {
			if (num7 <= listaTurno[i6]) {
				num7 = listaTurno[i6];
				pos6 = i6;
			}
			i6++;
		} while (i6 < 3);
		if (pos6 == 0) {
			maxTu = 'M';
		} else if (pos6 == 1) {
			maxTu = 'V';
		} else if (pos6 == 2) {
			maxTu = 'N';
		}
		
		
		int num8 = 0;
		int i7 = 0;
		do {
			num8 = num8 + listaElevador[i7];
			i7++;
		} while (i7 < 5);
		perA = (listaElevador[0] * 100) / num8;
		perB = (listaElevador[1] * 100) / num8;
		perC = (listaElevador[2] * 100) / num8;
		perD = (listaElevador[3] * 100) / num8;
		perE = (listaElevador[4] * 100) / num8;

		

		System.out.println("O andar menos utilizado é: "+pos1);
		System.out.println("\n ");
		System.out.println("O elevador mais utilizado e o turno com maior fluxo nesse elevador é, respectivamente: ");
		System.out.printf(" Elevador: "+maxElevador);
		System.out.printf(" Turno: "+maxEleTu);
		System.out.println("\n ");
		System.out.println("\nO elevador menos utilizado e o turno com menor fluxo nesse elevador é, respectivamente: ");
		System.out.printf(" Elevador: "+minElevador);
		System.out.printf(" Turno: "+minEleTu);
		System.out.println("\n ");
		System.out.println("\nO Turno com maior fluxo é: "+maxTu);
		System.out.println("\n ");
		System.out.println("A relacao das Porcentagens dos elevadores é: ");
		System.out.printf(" A: %.2f%n",perA);
		System.out.printf(" B: %.2f%n",perB);
		System.out.printf(" C: %.2f%n",perC);
		System.out.printf(" D: %.2f%n",perD);
		System.out.printf(" E: %.2f%n",perE);
	}
}
