package java_study;

import static java.lang.System.out;
import java.util.ArrayList;

public class MyClass{
	public static void main(String[] args)
	{
		out.println("hello! java!!!");
		
		Dog dog_1 = new Dog();
		dog_1.setName("coco");

		Dog dog_2 = new Dog();
		dog_2.setName("cookie");

		Dog dog_3 = new Dog();
		dog_3.setName("popi");
		
		Cat cat_1 = new Cat();
		cat_1.setName("nabi");
	
		ArrayList<Animal> animal_list = new ArrayList<Animal>();
		animal_list.add(dog_1);
		animal_list.add(dog_2);
		animal_list.add(dog_3);
		animal_list.add(cat_1);
		
		for(int i=0; i<animal_list.size(); i++) {
			animal_list.get(i).introduce();
			animal_list.get(i).hunt(i);
			out.println();
		}
		
		inout(dog_1);
		
		ArrayList<Pet> pet_list = new ArrayList<Pet>();
		pet_list.add(dog_1);
		pet_list.add(dog_2);
		pet_list.add(dog_3);
		pet_list.add(cat_1);
				
		for(int i=0; i<pet_list.size(); i++) {
			pet_list.get(i).beFriendly();
			out.println();
		}
	}
	
	public static Animal inout(Animal animal_1) {
		out.println(animal_1.getName());
		return animal_1;
		
	
	}
}