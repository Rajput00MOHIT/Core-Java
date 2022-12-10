package in.co.Exercise;

public class Page_51Exercise {
public static void main(String[] args) {
	int i = 0;
	System.out.println("" + i++ + ++i + ++i + i++ + ++i);
	//First ++ value is 1 but its not show than ++ + ++ = 2
	//third ++ = 3 than 4th is put the value but its not show
	
	int j = 5;
	System.out.println( "" + j++ + ++j);
	// first value 5+1 =6 but its not show than second j value 6 +1 = 7
	
	int k = 5;
	System.out.println("" + k-- + --k + --k);
	//first k value is 5 after push value is 4 but its show 5 
	// than 4-1 = 3 and again next k is 4-3 =2
 
	int s = 10;
	System.out.println("" + ++s + s++);
	//first s value is 11 than second s value is 11 11+11 =22
	
	int l = 0;
	System.out.println("" + l-- + --l + --l + l-- + --l);
	
	int m = 5;
	System.out.println("" + m-- + --m);
	
	int n = 4;
	System.out.println("" + --n + n--);

}
}
