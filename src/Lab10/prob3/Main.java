package Lab10.prob3;
import java.util.*;
import java.util.function.*;


public class Main {
	//could return list.contains(s), but this does not generalize
	
	public static boolean contains1(List<String> list, String s) {
		for(String x: list) {
			if(x == null && s == null) return true;
			if(s == null || x == null) continue;
			if(x.equals(s)) return true;
		}
		return false;	
	}

	
	public static <T> boolean contains2(List<? extends T> list, T e, 
			BiPredicate<? super T,? super T> pred2) {
		for(T emp: list) {
			if(emp == null && e == null) return true;
			if(emp == null || e == null) continue;
			if(pred2.test(emp, e)) return true;
		}
		return false;	
	}
	
	public static void test1() {
		List<String> list = Arrays.asList("Bob", "Joe", "Tom");
		boolean result = Main.contains1(list, "Tom");
		System.out.println(result);
	}
	
	public static void test2() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1003, "Tom", 60000));
		list.add(new Employee(1002, "Harry", 70000));
		list.add(new Employee(1001, "Joe", 50000));
		Employee e = new Employee(1001, "Joe", 50000);
		boolean foundIt = Main.contains2(list, e, (e1,e2) -> e1.getId()==e2.getId());
		System.out.println(foundIt);	
		
	}
	
	public static void test3() {
		List<Manager> list = new ArrayList<>();
		list.add(new Manager(1003, "Tom", 60000, 700));
		list.add(new Manager(1002, "Harry", 70000, 400));
		list.add(new Manager(1001, "Joe", 50000, 500));
		
		Manager m = new Manager(1001, "Joe", 50000, 500);
		boolean foundIt = Main.contains2(list, m, 
				(e1, e2) -> e1.getId()==e2.getId());
		System.out.println(foundIt);		
	}
	
	public static void test4() {
		List<Manager> list = new ArrayList<>();
		list.add(new Manager(1003, "Tom", 60000, 700));
		list.add(new Manager(1002, "Harry", 70000, 400));
		list.add(new Manager(1001, "Joe", 50000, 500));
		
		Manager m = new Manager(1001, "Joe", 50000, 500);
		boolean foundIt = Main.contains2(list, m, 
			( e,  p) -> e.getName().equals(p.getName()));
		System.out.println(foundIt);		
	}
	
	public static void test5() {
		List<CheckingAccount> list = new ArrayList<>();
		list.add(new CheckingAccount(1001, 25.00));
		list.add(new CheckingAccount(1002, 35.00));
		list.add(new CheckingAccount(1003, 125.00));
		
		Account a = new CheckingAccount(1002, 35.00);
		boolean foundIt = Main.contains2(list, a, 
			( a1,  a2) -> a1.getAcctId() == (a2.getAcctId()));
		System.out.println(foundIt);		
	}
	
	
	
	public static void main(String[] args) {
		System.out.print("test1: ");
		test1();
		System.out.print("test2: ");
		test2();
		System.out.print("test3: ");
		test3();
		System.out.print("test4: ");
		test4();
		System.out.print("test5: ");
		test5();
	}	
		
}
