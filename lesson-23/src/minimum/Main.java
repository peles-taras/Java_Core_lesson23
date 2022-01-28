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
				System.out.println("�������");
			}
		}
	}

	public static void menu() {
		System.out.println("������ 1 ��� ������ �������");
		System.out.println("������ 2 ��� �������� ��������� �������");
		System.out.println("������ 3 ��� ������� �� �������");
		System.out.println("������ 4 ��� �������� ��������� �������");
		System.out.println("������ 5 ��� ������� ��������� �������");
		System.out.println("������ 6 ��� ������ �������� � �������");
		System.out.println("������ 7 ��� �������� �������� � �������");
		System.out.println("������ 8 ��� ������� ������ ���������");
		System.out.println("������ 9 ��� ������� ���������� ���������");
	}
}
