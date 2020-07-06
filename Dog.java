public class Dog extends Animal //inherit from the class animal.
{

	public Dog(String introduceYourself) {
		super(introduceYourself);
	}

	public void getintroduceYourself() //Overriding the superclass (animal class) method
	{
		System.out.println("Woof. I am a dog. My name is Vilma.");
	}
	
	
	public void print() //Overriding the superclass (animal class) method
	{
		System.out.println("Woof. I am a dog. My name is Vilma.");
		System.out.println("-----------------------------------");
		super.print(); //call method print() in superclass (animal class)
	}

}
