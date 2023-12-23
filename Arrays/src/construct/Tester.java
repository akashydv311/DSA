package construct;

class Array01{
	// create arrays
	int[] num = {34,45,56,34,32,78,54};
	
	int getLength() {
		int i=0;
		for(i=0; i<num.length;i++);
		return i;
	}
	
	int findElement(int i) {
		return num[i+1];
	}
	
	boolean isPrasent(int element) {
		for(int i=0; i<num.length; i++) {
			if(element == num[i])
				return true;
		}
		return false;
	}
}

public class Tester {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		Array01 arr = new Array01();
		// get array length
		int arrLength = arr.getLength();
		System.out.println(arrLength);
		
		// find index value
		int element = arr.findElement(3);
		System.out.println(element);
		
		// is element preset
		boolean present = arr.isPrasent(67);
		System.out.println(present);
		
	}
}
