package rays.in;

public class javalangstring {
public static void main(String[] args) {
	String name="vijay dinanath chouhan";
	System.out.println("String Length-"+name.length());
	System.out.println("7 th character is-"+name.charAt(6));
	System.out.println("Dina index is-"+name.indexOf("Dina"));
	System.out.println("First i position-"+name.indexOf("i"));
	System.out.println("Last i position-"+name.lastIndexOf("i"));
	System.out.println("a is replaced by b-"+name.replace("a","b"));
	System.out.println("All a is replaced by b-"+name.replaceAll("a", "b"));
	System.out.println("Chota vijay-"+name.toLowerCase());
	System.out.println("Bada vijay-"+name.toUpperCase());
	System.out.println("Start with vijay_"+name.startsWith("vijay"));
	System.out.println("End with han-"+name.endsWith("han"));
	System.out.println("Substring-"+name.substring(6));
	
	
	
}
}
