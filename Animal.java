public abstract class Animal {
private String introduceYourself;

public Animal(String introduceYourself) {
	this.introduceYourself = introduceYourself;
}
public abstract void getintroduceYourself();
public void print() {
	System.out.println("Morr. I am an animal.");
}
}
