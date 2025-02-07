package returnstring;

public class Reverse {
	
	public static void main(String [] args) {
		
		String name = "Hello World";
		
		System.out.println("Hello World  " + name );
		
		System.out.println("The character at index " + name.charAt(3));
		
		char [] ch = name.toCharArray();
		
		for (char c : ch) {
		
		System.out.println( c);
	 }
		
	for (int i = ch.length-1; i>= 0; i--) {
		
		System.out.print(ch[i]);
		
			}
	}
}
