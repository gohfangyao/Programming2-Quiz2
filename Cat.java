public class Cat extends Animal //inherit from the class animal.
{

	public Cat(String introduceYourself) {
		super(introduceYourself);
	}

	public void getintroduceYourself() //Overriding the superclass (animal class) method
	{
		System.out.println("Meow. I am a cat. My name is Kurre.");
	}
	
	
	public void print1() //Overriding the superclass (animal class) method
	{
		System.out.println("Meow. I am a cat. My name is Kurre.");
		System.out.println("-----------------------------------");
		super.print(); //call method print() in superclass (animal class)
	}
	public void print2() //Overriding the superclass (animal class) method
	{
		System.out.println("Meow. I am a cat. My name is Bamse.");
		System.out.println("-----------------------------------");
		super.print(); //call method print() in superclass (animal class)
	}

}
