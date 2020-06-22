package java_study;
public class Cat extends Animal implements Pet{
	
	public void introduce(){
		System.out.println("I'm a cat, " + getName() + ".");
		System.out.println("Mew~ Mew~");
	}
	
	public void hunt(int food){
			size = size + food;
			System.out.println("Success to hunt. My size is +" + size + ".");
	}
	public void beFriendly() {
		System.out.println(getName() + " is licking my hand!!!");
	}
}