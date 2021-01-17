import java.util.Scanner;

public class AnotherWork3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.print("name = ");
		name = sc.next();
		int age;
		System.out.print("age = ");
		age = sc.nextInt();
		boolean man;
		System.out.print("man = ");
		man = sc.nextBoolean();
		String phone;
		System.out.print("phone = ");
		phone = sc.next();
		double height;
		System.out.print("height = ");
		height = sc.nextDouble();
		String address;
		System.out.print("address = ");
		address = sc.next();
		
		System.out.print(name + "\n");
		System.out.print(age + "\n");
		System.out.print(man + "\n");
		System.out.print(phone + "\n");
		System.out.print(height + "\n");
		System.out.print(address + "\n");
		
	}

}
