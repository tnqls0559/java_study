package java_study;
public class Dog extends Animal implements Pet{
	
	public void introduce(){
		System.out.println("I'm a dog, " + getName() + ".");
		System.out.println("Warr! Warr!");
	}
	
	public void hunt(int food){
		if(Math.random()<0.5) {
			size = size + food;
			System.out.println("Success to hunt. My size is +" + size + ".");
		}
		else
			System.out.println("fail to hunt. My size is +" + size + ".");
	}
	public void beFriendly() {
		System.out.println(getName() + " is swinging the tail!!!");
	}
}