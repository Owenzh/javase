package train_002;

class Student {
	private String name = "";
	private int age = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}

public class Code_05_classlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stus = new Student[10];
		for (int i = 0; i < 10; i++) {
			stus[i] = new Student("test0" + i, 20 + i);
			System.out.println(stus[i]);
		}
		System.out.println("******************************");
		for (int j = 0; j < 10; j++) {
			stus[j].setAge(stus[j].getAge() + 1);
			System.out.println(stus[j]);
		}
	}
}
