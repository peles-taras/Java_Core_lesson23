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
		System.out.println("������ ���� ��������");
		int depWeight = sc.nextInt();
		System.out.println("������ ������ ��������");
		int depHeight = sc.nextInt();
		System.out.println("������ ��'� ��������");
		String depName = sc.next();
		System.out.println("������ ������� ��������");
		String depSurname = sc.next();
		System.out.println("������ �� ��������");
		int depAge = sc.nextInt();
		System.out.println("������ �� ������� �������� true/false");
		boolean depBriber = sc.nextBoolean();
		dep.add(new Deputy(depWeight, depHeight, depName, depSurname, depAge, depBriber));
		System.out.println("�������� ������");
	}

	public void removeDeputy() {
		System.out.println("������ ������� �������� ��� ���������");
		String surname = sc.next();
		Predicate<Deputy> predicate = deputy -> deputy.getSurname().equalsIgnoreCase(surname);
		Optional<Deputy> depToRemove = dep.stream()
				.filter(predicate)
				.findAny();
		
		if(depToRemove.isPresent()) {
			dep.remove(depToRemove.get());
			System.out.println("�������� "+surname+" - �������� ");
		}else {
			System.out.println("�������, ������ �������� ����");
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
		System.out.println("��������� ��������: ");
	    System.out.println(stream.filter(deputy -> deputy.getBribeSize() > 0 )
	    		.max(Comparator.comparing(Deputy::getBribeSize))
	    		.orElseThrow(()-> new NoSuchElementException("�������.���������� ��������� �� ��������.")));	
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
