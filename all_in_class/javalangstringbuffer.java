package all_in_class;

public class javalangstringbuffer {
public static void main(String[] args) {
StringBuffer sb = new StringBuffer("vijay");
sb.append("dinanath chouhan");
System.out.println("Length:"+sb.length());
System.out.println("Capacity:"+sb.capacity());
System.out.println("Char at :"+ sb.charAt(1));
System.out.println("Index Of :"+sb.indexOf("Dinanath"));
System.out.println("Replace :"+ sb.replace(0, 5, "jai"));
System.out.println("Reverse :"+ sb.reverse());
}
}
