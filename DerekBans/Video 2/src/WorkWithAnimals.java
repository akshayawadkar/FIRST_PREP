
public class WorkWithAnimals {

	public static void main(String[] args) {
		
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println(doggy.getSound());
		System.out.println(kitty.getSound());
		
		Animal[] animals = new Animal[4];
		animals[0] = doggy;
		animals[1] = kitty;
	
		
		System.out.println(animals[0].getSound());
		System.out.println(animals[1].getSound());
		
		
		speakAnimal(doggy);
		
		System.out.println(animals[0].getSound());
		System.out.println(animals[1].getSound());
		
		 
	}

	public static void speakAnimal(Animal doggy) {
		 doggy.setSound("bark bark");
	}
}
