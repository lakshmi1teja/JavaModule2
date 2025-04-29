package com.practiceJava;
interface Computer{ //abstract class Computer
	int price=30000; //In interface when created a primitive datatype variable it's always final and static so instantiate it when variable is created in same line
	public abstract void compiler();
}
interface Portable{
	void move();
}
class Desktop implements Computer{ //class Desktop extends Computer
	public void compiler() {
		System.out.println("Compiles Faster...");
	}
}
class Laptop implements Computer,Portable{   //class Laptop extends Computer
	public void compiler() {
		System.out.println("Compiles...");
	}
	public void move() {
		System.out.println("Move the System"); //we can implement multiple interface this is called multiple inheritance which is not possible with normal class/abstract classes
	}
}
class Developer{
	public void code(Computer lap) {
		System.out.println("coding...");
	}
}
public class AbstractionEg1 {
	public static void main(String[] args) {
		Computer com1 = new Laptop();
		Portable pot = new Laptop();
		Computer com2 = new Desktop();
		Developer dev1 = new Developer();
		dev1.code(com1);
		com1.compiler();
		pot.move();
		int price = Computer.price;
		System.out.println(price);
	}
}
