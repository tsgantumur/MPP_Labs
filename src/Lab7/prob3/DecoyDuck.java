package Lab7.prob3;

public class DecoyDuck extends Duck {

	public DecoyDuck()
	{

	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("  cannot quack");
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("  cannot fly");
	}

}
