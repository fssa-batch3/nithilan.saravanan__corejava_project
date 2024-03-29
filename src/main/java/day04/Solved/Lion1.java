package day04.Solved;


public class Lion1 extends Animal1 {  // extends keyword use to inherit variables and methods from Animal
	private void roar() {
		System.out.println("The " + getAge() + " year old lion says: Roar!");
	}

	public static void main(String[] args) {
		Lion1 simba = new Lion1();
		simba.setAge(10); // setAge() method was not defined in Lion; it is inherited from Animal
		simba.roar();
	}
}