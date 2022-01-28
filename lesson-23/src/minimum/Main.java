package minimum;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SupremeCouncil spc = new SupremeCouncil();

		while (true) {
			menu();
			switch (sc.next()) {
			case "1":
				spc.addFaction();
				break;

			case "2":
				spc.removeFaction();
				break;

			case "3":
				spc.showAllFactions();
				break;

			case "4":
				spc.clearFaction();
				break;
			case "5":
				spc.showFaction();
				break;
			case "6":
				spc.addDeputyToFraction();

				break;
			case "7":
				spc.removeDeputyfromFraction();
				break;

			case "8":
				spc.showBribeTakers();
				break;

			case "9":
				spc.showBiggestBribe();
				break;
			default:
				System.out.println("Ïîìèëêà");
			}
		}
	}

	public static void menu() {
		System.out.println("Ââåä³òü 1 ùîá äîäàòè ôðàêö³þ");
		System.out.println("Ââåä³òü 2 ùîá âèäàëèòè êîíêðåòíó ôðàêö³þ");
		System.out.println("Ââåä³òü 3 ùîá âèâåñòè óñ³ ôðàêö³¿");
		System.out.println("Ââåä³òü 4 ùîá î÷èñòèòè êîíêðåòíó ôðàêö³þ ");
		System.out.println("Ââåä³òü 5 ùîá âèâåñòè êîíêðåòíó ôðàêö³þ");
		System.out.println("Ââåä³òü 6 ùîá äîäàòè äåïóòàòà â ôðàêö³þ");
		System.out.println("Ââåä³òü 7 ùîá âèäàëèòè äåïóòàòà ç ôðàêö³¿");
		System.out.println("Ââåä³òü 8 ùîá âèâåñòè ñïèñîê õàáàðíèê³â");
		System.out.println("Ââåä³òü 9 ùîá âèâåñòè íàéá³ëüøîãî õàáàðíèêà");
	}
}
