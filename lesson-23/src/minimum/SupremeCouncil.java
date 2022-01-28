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
		System.out.println("Назва фракції:");
		factions.add(new Faction(sc.next()));
		System.out.println("Фракцію додано");
		System.out.println(factions);

	}

	public void removeFaction() {
		System.out.println("Список фракцій:");
		int count = 1;	
		for (Faction faction : factions) {
			System.out.println("Фрація " + count++ + ": " + faction.getName());
		}
		
		System.out.println("Введіть назву фракції для видалення");
		String name = sc.next();
		Predicate<Faction> predicate = factions -> factions.getName().equals(name);
		Optional<Faction> factionOpt = factions.stream()
				.filter(predicate).
				findFirst();

		if (factionOpt.isPresent()) {
			factions.remove(factionOpt.get());
			System.out.println("Фракцію " + name + " - видалено");

		} else {
			System.out.println("Помилка. Спочатку додайте фракцію");
		}

	}

	public void showAllFactions() {
		System.out.println("Список всіх фракцій:");
		int count = 1;
		for (Faction faction : factions) {
			System.out.println("Фрація " + count++ + ": " + faction.getName());
		}
	}

	public void clearFaction() {
		int count = 1;
		for (Faction faction : factions) {
			System.out.println("Фрація " + count++ + ": " + faction.getName());
		}
		System.out.println("Введіть назву фракції для очищення");
		String name = sc.next();
		
		Predicate<Faction> predicate = faction -> faction.getName().equals(name);
		Optional<Faction> factionOpt = factions.stream().filter(predicate).findFirst();
		
		if(factionOpt.isPresent()) {
			f.clearDeputies();
			System.out.println(factionOpt.get()+" очищено");
		}else {
			System.out.println("Помилка");
		}
	}

	public void showFaction() {
		int count = 1;
		System.out.println("Список фрацій:");
		for (Faction faction : factions) {
			System.out.println("Фрація " + count++ + ": " + faction.getName());
		}
		System.out.println("Введіть назву фрації для перегляду інофрмації");
		String name = sc.next();
		Predicate<Faction> predicate = faction -> faction.getName().equals(name);
		Optional<Faction> factionOpt = factions.stream().filter(predicate).findFirst();
		
		if(factionOpt.isPresent()) {
			System.out.println("Список депутатів:");
			f.allDeputies();		
		}else {
			System.out.println("Помилка");
		}
	}

	public void addDeputyToFraction() {
		int count = 1;
		System.out.println("Список фрацій:");
		for (Faction faction : factions) {
			System.out.println("Фрація " + count++ + ": " + faction.getName());
		}
		
		System.out.println("Введіть назву фрації для добавлення депутата");
		String name = sc.next();
		Predicate<Faction> predicate = faction -> faction.getName().equals(name);
		Optional<Faction> factionOpt = factions.stream().filter(predicate).findFirst();
		
		if(factionOpt.isPresent()) {
			factionOpt.get().addDeputy();

		}else {
			System.out.println("Помилка");
		}
	}

	public void removeDeputyfromFraction() {
		int count = 1;
		System.out.println("Список фрацій:");
		for (Faction faction : factions) {
			System.out.println("Фрація " + count++ + ": " + faction.getName());
		}
		
		System.out.println("Введіть назву фрації для видалення депутата");
		String name = sc.next();
		Predicate<Faction> predicate = faction -> faction.getName().equals(name);
		Optional<Faction> factionOpt = factions.stream().filter(predicate).findFirst();
		
		if(factionOpt.isPresent()) {
			f.removeDeputy();	
		}else {
			System.out.println("Помилка");
		}
	}

	public void showBribeTakers() {
		int count = 1;
		System.out.println("Список фрацій:");
		for (Faction faction : factions) {
			System.out.println("Фрація " + count++ + ": " + faction.getName());
		}
		
		System.out.println("Введіть назву фрації щоб показати хабарників");
		String name = sc.next();
		Predicate<Faction> predicate = faction -> faction.getName().equals(name);
        Optional<Faction> factionOpt = factions.stream().filter(predicate).findFirst();
		
		if(factionOpt.isPresent()) {
			System.out.println("Список хабарників: ");
			f.allBribeTakers();	
		}else {
			System.out.println("Помилка");
		}	
	}

	public void showBiggestBribe() {
		int count = 1;
		System.out.println("Список фрацій:");
		for (Faction faction : factions) {
			System.out.println("Фрація " + count++ + ": " + faction.getName());
		}

		System.out.println("Введіть назву фрації щоб показати найбільшого хабарника");
		String name = sc.next();
		Predicate<Faction> predicate = faction -> faction.getName().equals(name);
        Optional<Faction> factionOpt = factions.stream().filter(predicate).findFirst();
		
		if(factionOpt.isPresent()) {
			f.biggestBribe();	
		}else {
			System.out.println("Помилка");
	     }
      }
   }
