import java.io.*;
import java.util.*;
import java.util.regex.*;

public class stringtoken {


    public static void main(String[] args) {

	File file = new File("./teststringtoken.txt");
	try {
	    Scanner sc = new Scanner(file);
	    String s= sc.nextLine();
	    Pattern pt = Pattern.compile("[ !,?.\\_\'@]+");
	    String[] ss = pt.split(s, 0);
	    int count = ss.length;
	    if(ss.length > 0 ) {
		if (!Pattern.matches("[A-Za-z]+", ss[0])) {
		    count--;
		}
	    }

	    System.out.println(count);

	    for (int i = 0; i < ss.length; i++) {
		if (Pattern.matches("[A-Za-z]+", ss[i])) {
		    System.out.println(ss[i]);
		}
	    }
	} catch (Exception e) {
	}
    }


}