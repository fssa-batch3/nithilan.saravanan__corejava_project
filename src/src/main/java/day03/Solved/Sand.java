package day03.Solved;



public class Sand {

private static int numShovels;

private int numRakes;



public static int getNumShovels() {

return numShovels;

}



//public static int getNumRakes() {
//
//try {
//	return numRakes;
//} catch (Exception e) {
//	// TODO Auto-generated catch block	
//	e.printStackTrace();
//}
//
//}



public Sand() {

System.out.println("a");

}



public void Sand() {

System.out.println("b");

}



public void run() {

new Sand();

Sand();

}



public static void main(String[] args) {

new Sand().run();

}

}






