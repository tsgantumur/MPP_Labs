package Lab7.prob3;

public interface FlyBehaviour {
	default void fly() {
		// TODO Auto-generated method stub
		System.out.println("  fly with wings");
	}
 
	 default void display()
	 {
		 System.out.println(" displaying");
	 }
}
