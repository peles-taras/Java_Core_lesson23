package minimum;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;


public class SupremeCouncil {

	Scanner sc = new Scanner(System.in);
	List<Faction> factions = new ArrayList<>();
    Faction f = new Faction(null);

	public void addFaction() {
		System.out.println("����� �������:");
		factions.add(new Faction(sc.next()));
		System.out.println("������� ������");
		System.out.println(factions);

	}

	public void removeFaction() {
		System.out.println("������ �������:");
		int count = 1;	
		for (Faction faction : factions) {
			System.out.println("������ " + count++ + ": " + faction.getName());
		}
		
		System.out.println("������ ����� ������� ��� ���������");
		String name = sc.next();
		Predicate<Faction> predicate = factions -> factions.getName().equals(name);
		Optional<Faction> factionOpt = factions.stream()
				.filter(predicate).
				findFirst();

		if (factionOpt.isPresent()) {
			factions.remove(factionOpt.get());
			System.out.println("������� " + name + " - ��������");

		} else {
			System.out.println("�������. �������� ������� �������");
		}

	}

	public void showAllFactions() {
		System.out.println("������ ��� �������:");
		int count = 1;
		for (Faction faction : factions) {
			System.out.println("������ " + count++ + ": " + faction.getName());
		}
	}

	public void clearFaction() {
		int count = 1;
		for (Faction faction : factions) {
			System.out.println("������ " + count++ + ": " + faction.getName());
		}
		System.out.println("������ ����� ������� ��� ��������");
		String name = sc.next();
		
		Predicate<Faction> predicate = faction -> faction.getName().equals(name);
		Optional<Faction> factionOpt = factions.stream().filter(predicate).findFirst();
		
		if(factionOpt.isPresent()) {
			f.clearDeputies();
			System.out.println(factionOpt.get()+" �������");
		}else {
			System.out.println("�������");
		}
	}

	public void showFaction() {
		int count = 1;
		System.out.println("������ ������:");
		for (Faction faction : factions) {
			System.out.println("������ " + count++ + ": " + faction.getName());
		}
		System.out.println("������ ����� ������ ��� ��������� ����������");
		String name = sc.next();
		Predicate<Faction> predicate = faction -> faction.getName().equals(name);
		Optional<Faction> factionOpt = factions.stream().filter(predicate).findFirst();
		
		if(factionOpt.isPresent()) {
			System.out.println("������ ��������:");
			f.allDeputies();		
		}else {
			System.out.println("�������");
		}
	}

	public void addDeputyToFraction() {
		int count = 1;
		System.out.println("������ ������:");
		for (Faction faction : factions) {
			System.out.println("������ " + count++ + ": " + faction.getName());
		}
		
		System.out.println("������ ����� ������ ��� ���������� ��������");
		String name = sc.next();
		Predicate<Faction> predicate = faction -> faction.getName().equals(name);
		Optional<Faction> factionOpt = factions.stream().filter(predicate).findFirst();
		
		if(factionOpt.isPresent()) {
			factionOpt.get().addDeputy();

		}else {
			System.out.println("�������");
		}
	}

	public void removeDeputyfromFraction() {
		int count = 1;
		System.out.println("������ ������:");
		for (Faction faction : factions) {
			System.out.println("������ " + count++ + ": " + faction.getName());
		}
		
		System.out.println("������ ����� ������ ��� ��������� ��������");
		String name = sc.next();
		Predicate<Faction> predicate = faction -> faction.getName().equals(name);
		Optional<Faction> factionOpt = factions.stream().filter(predicate).findFirst();
		
		if(factionOpt.isPresent()) {
			f.removeDeputy();	
		}else {
			System.out.println("�������");
		}
	}

	public void showBribeTakers() {
		int count = 1;
		System.out.println("������ ������:");
		for (Faction faction : factions) {
			System.out.println("������ " + count++ + ": " + faction.getName());
		}
		
		System.out.println("������ ����� ������ ��� �������� ���������");
		String name = sc.next();
		Predicate<Faction> predicate = faction -> faction.getName().equals(name);
        Optional<Faction> factionOpt = factions.stream().filter(predicate).findFirst();
		
		if(factionOpt.isPresent()) {
			System.out.println("������ ���������: ");
			f.allBribeTakers();	
		}else {
			System.out.println("�������");
		}	
	}

	public void showBiggestBribe() {
		int count = 1;
		System.out.println("������ ������:");
		for (Faction faction : factions) {
			System.out.println("������ " + count++ + ": " + faction.getName());
		}

		System.out.println("������ ����� ������ ��� �������� ���������� ���������");
		String name = sc.next();
		Predicate<Faction> predicate = faction -> faction.getName().equals(name);
        Optional<Faction> factionOpt = factions.stream().filter(predicate).findFirst();
		
		if(factionOpt.isPresent()) {
			f.biggestBribe();	
		}else {
			System.out.println("�������");
	     }
      }
   }
