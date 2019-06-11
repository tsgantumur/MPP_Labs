package Lab7.prob3;

public interface QuackBehaviour extends FlyBehaviour {
	default void quack()
	{
		System.out.println(" quacking");
	}
	
	
}
