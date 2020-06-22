package java_study;

public  abstract class Animal {
	
	private String name;
	public int size;

	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	public void introduce(){
		System.out.println("I'm " + name + ".");
	}

	public abstract void hunt(int food);
	
}