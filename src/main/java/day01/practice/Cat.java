package day01.practice;

public class Cat {
    // Attributes
    private int hasDots;
    private String color;
	private String speak;
    // Constructor
    public Cat(int hasDots, String color,String speak) {
        this.hasDots = hasDots;
        this.color = color;
        this.speak=speak;
    }
    // Getters and setters
    public int hasDots() {
        return hasDots;
    }
    public void setHasDots(int hasDots) {
        this.hasDots = hasDots;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getspeak()
    {
    	return speak;
    }
		public  void setSpeak(String speak) {
			 this.speak = speak;
		
    }
    // Main method to create Dog objects
    public static void main(String[] args) {
        // Create two Dog objects
        Cat cat1 = new Cat(1, "White","Meow");
        Cat cat2 = new Cat(2, "Black","Meow");
        cat2.setSpeak("meeeeeeeeeeeeeeeeeeeeeeee");
//        Cat cat3 =new Cat(true,"Wolf","Meow");"Meow"
        // Print the attributes of each Dog
        System.out.println("cat 1:");
        System.out.println("Has Dots: " + cat1.hasDots());
        System.out.println("Color: " + cat1.getColor());
				System.out.println("Speaks: " + cat1.getspeak());
        System.out.println("cat 2:");
        System.out.println("Has Dots: " + cat2.hasDots());
        System.out.println("Color: " + cat2.getColor());
				System.out.println("Speaks: " + cat2.getspeak());
    }
	
}
















//public class Cat {
//	// Attributes
//	public boolean hasDots;
//	public String color;
//
//	// Constructor
//	public Cat(boolean hasDots, String color) {
//		this.hasDots = hasDots;
//		this.color = color;
//	}
//
//	// Getters and setters
//	public boolean hasDots() {
//		return hasDots;
//	}
//
//	public void setHasDots(boolean hasDots) {
//		this.hasDots = hasDots;
//	}
//
//	public String getColor() {
//		return color;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//
//	public void speak() {
//		System.out.println("Meoww!");
//	}
//
//	// Main method to create Cat objects
//	public static void main(String[] args) {
//        // Create two Dog objects
//        Cat cat1 = new Cat(true, "White");
//        Cat cat2 = new Cat(true, "Black");
//
//        // Print the attributes of each Cat
//        System.out.println("Cat 1:");
//        System.out.println("Has Dots: " + cat1.hasDots());
//        System.out.println("Color: " + cat1.getColor());
//				System.out.println("Speaks: ", cat1.speak());
//
//        System.out.println("Dog 2:");
//        System.out.println("Has Dots: " + cat2.hasDots());
//        System.out.println("Color: " + cat2.getColor());
//				System.out.println("Speaks: " ,cat2.speak()
//    }
//}






