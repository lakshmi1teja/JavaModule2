package mavenpackagepractice;

public class MultilevelInheritance {
	public static void main(String args[]) {
	Cat obj1 = new Cat();
	Kitten obj2 = new Kitten();
	obj1.eat();
	obj1.meow();
	obj2.meow();
	obj2.eow();
	}
}
class Animal{
	public void eat() {
		System.out.println("I can eat");
	}
}
class Cat extends Animal{
	public void eat() {
		System.out.println("I drink milk!");
	}
	public void meow() {
		System.out.println("I can go meow");
	}
}
class Kitten extends Cat{
	public void eow() {
		System.out.println("I can go eow");
	}
	public void meow() {
		System.out.println("I can't go meow!I'm still a kitten");
	}
}