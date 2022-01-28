package minimum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Faction {

	private String name;

	Faction(String name) {
		this.name = name;
	}

	Scanner sc = new Scanner(System.in);
	static List<Deputy> dep = new ArrayList<>();
	ListIterator<Deputy> depiterator = dep.listIterator();

	public void addDeputy() {
		System.out.println("Вкажіть вагу депутата");
		int depWeight = sc.nextInt();
		System.out.println("Вкажіть висоту депутата");
		int depHeight = sc.nextInt();
		System.out.println("Вкажіть ім'я депутата");
		String depName = sc.next();
		System.out.println("Вкажіть прізвище депутата");
		String depSurname = sc.next();
		System.out.println("Вкажіть вік депутата");
		int depAge = sc.nextInt();
		System.out.println("Вкажіть чи дипутат хабарник true/false");
		boolean depBriber = sc.nextBoolean();
		dep.add(new Deputy(depWeight, depHeight, depName, depSurname, depAge, depBriber));
		System.out.println("Депутата додано");
	}

	public void removeDeputy() {
		System.out.println("Введіть прізвище депутата для видалення");
		String surname = sc.next();
		Predicate<Deputy> predicate = deputy -> deputy.getSurname().equalsIgnoreCase(surname);
		Optional<Deputy> depToRemove = dep.stream()
				.filter(predicate)
				.findAny();
		
		if(depToRemove.isPresent()) {
			dep.remove(depToRemove.get());
			System.out.println("Депутата "+surname+" - видалено ");
		}else {
			System.out.println("Помилка, такого депутата немає");
		}
	
	}

	public void allBribeTakers() {
		List<Deputy> depStream = dep.stream()
				.filter(Deputy::isBribeTaker)
				.collect(Collectors.toList());
		depStream.forEach(System.out::println);
	}

	public void biggestBribe() {
		Stream<Deputy> stream = dep.stream();
		System.out.println("Найбільший хабарник: ");
	    System.out.println(stream.filter(deputy -> deputy.getBribeSize() > 0 )
	    		.max(Comparator.comparing(Deputy::getBribeSize))
	    		.orElseThrow(()-> new NoSuchElementException("Помилка.Найбільшого хабарника не знайдено.")));	
	}
	
	public void allDeputies() {
		dep.stream().forEach(System.out::println);
		}
	
	public void clearDeputies() {
		dep.clear();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
