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
				System.out.println("Помилка");
			}
		}
	}

	public static void menu() {
		System.out.println("Введіть 1 щоб додати фракцію");
		System.out.println("Введіть 2 щоб видалити конкретну фракцію");
		System.out.println("Введіть 3 щоб вивести усі фракції");
		System.out.println("Введіть 4 щоб очистити конкретну фракцію");
		System.out.println("Введіть 5 щоб вивести конкретну фракцію");
		System.out.println("Введіть 6 щоб додати депутата в фракцію");
		System.out.println("Введіть 7 щоб видалити депутата з фракції");
		System.out.println("Введіть 8 щоб вивести список хабарників");
		System.out.println("Введіть 9 щоб вивести найбільшого хабарника");
	}
}
