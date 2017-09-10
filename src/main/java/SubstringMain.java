
public class SubstringMain {
	public static void main(String[] args) {
		String s ="HEllo";
		
		System.out.println(s.substring(2));
		System.out.println(s.substring(2,3));
	/** Array Index java.lang.StringIndexOutOfBoundsException: String index out of range: -4
		System.out.println(s.substring(6,2)); 
		System.out.println(s.substring(-1,2));**/
		System.out.println("1"+s.substring(2,2)+"1");
		
		
	}

}
