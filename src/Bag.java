import java.util.ArrayList;

/**
 * this is array list demo 
 * @author zak
 *
 */
public class Bag {
	
	//declare and initialize arraylist of students
	private ArrayList<Student> studentsList = new ArrayList<>();
	
	public void addNumber(Student num) {
		studentsList.add(num);
	}

	
	public void replaceValueAt(int index, Student newValue) {
		studentsList.set(index, newValue);
	}
	
	public void removeNum(Student num) {
		boolean removed = studentsList.remove(num);
		
		if (removed)
			System.out.println(num + " removed!");
		else 
			System.out.println(num + " not found!");
	}
	
	public int getSize() {
		
		return studentsList.size();
	}
	
	@Override
	public String toString() {
		String allNumbers = "";
		
		for (Student num : studentsList) {
			allNumbers += num + "\n";
		}
		
		return allNumbers;
	}
	
	public static void main(String[] args) {
		Bag myBag = new Bag();
		Student s1 = new Student("john", 3.9);
		Student s2= new Student("zak", 1.9);
		Student s3= new Student("smith", 2.9);

		Student s4 = new Student("sarah", 3.8);
		
		myBag.addNumber(s1);
		myBag.addNumber(s2);
		myBag.addNumber(s3);
		myBag.replaceValueAt(1, s4);
		
		System.out.println(myBag.toString());
		System.out.println(myBag.getSize());
		
		myBag.removeNum(s1);
		
		
//		System.out.println(myBag.toString());
	}
	
}
