package minimum;

public class Deputy extends Human {

	private String name;
	private String surname;
	private int age;
	private boolean bribeTaker;
	private int bribeSize = 100;

	public Deputy(int weight, int height, String name, String surname, int age, boolean bribeTaker) {
		super(weight, height);
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.bribeTaker = bribeTaker;
	}

	public void giveBribe() {
		if (bribeTaker = false) {
			System.out.println("Цей депутат не бере хабарів");
		} else if (bribeSize > 5000) {
			System.out.println("Поліція ув`язнить депутата");
		} else {
			System.out.println("Cуму хабаря" + bribeSize);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBribeTaker() {
		return bribeTaker;
	}

	public void setBribeTaker(boolean bribeTaker) {
		this.bribeTaker = bribeTaker;
	}

	public int getBribeSize() {
		return bribeSize;
	}

	public void setBribeSize(int bribeSize) {
		this.bribeSize = bribeSize;
	}

	@Override
	public String toString() {
		return "Deputy name=" + name + ", surname=" + surname + ", age=" + age + ", bribeTaker=" + bribeTaker
				+ ", bribeSize=" + bribeSize + ", Weight=" + getWeight() + ", Height=" + getHeight() + "";
	}

}
