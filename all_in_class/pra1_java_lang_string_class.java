package all_in_class;

public class pra1_java_lang_string_class {
public static void main(String[]args) {
	String name = "mr mohit rajput";
	System.out.println("String Leanth-" + name.length() );
	System.out.println("7rd charactor is-" + name.charAt(5));
	System.out.println("mohi index is-" + name.indexOf("raj"));
	System.out.println("first i position-"+ name.indexOf("i"));
	System.out.println("last j position-" + name.lastIndexOf("j"));
	System.out.println("m is replaced by t-"+ name.replace("m", "t"));
	System.out.println("all r is repleced by hello-" + name.replaceAll("r", "hello"));
	System.out.println("chota banna-"+ name.toUpperCase());
	System.out.println("bada banna-"+ name.toLowerCase());
	System.out.println(" start with king-"+ name.startsWith("king"));
	System.out.println("end with byee-"+ name.endsWith("byee"));
	System.out.println("substring-" + name.substring(6));
}
}
