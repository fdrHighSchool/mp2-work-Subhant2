// code 1
public class Main {
    public static void main(String[] args) {
        String first = ("Hello"); 
        String second = ("World");
        System.out.println(" ");
        String third = (first + second);
        System.out.println(third);       
    }
}




// code 2
public class Main {
public static void main(String[] args) {
  System.out.println("");
		System.out.println(conCat("abc","cat"));
}
	public static String conCat(String s1 , String s2){
		String yes = s1+s2;
		if(s1.length()>0 && s2.length()>0){
			if(s1.charAt(s1.length()-1)==s2.charAt(0)){
			yes =  s1+s2.substring(1);
			}
		}
		return yes;
	}
}




// code 3
public class Main {
  public static void main(String[] args) {
    System.out.println("");
    System.out.println("Hello");
    System.out.println(repeatEnd("Hello", 3));
  }

  public static String repeatEnd(String str, int n) {

    int len = str.length();

    String newWord = "";

    for (int i = 0; i < n; i++) {

      newWord += str.substring(len - n, len);

    }

    return newWord;

  }
}






// code 4
public class Main{
  public static void main(String[] args) {
    System.out.println("");
    System.out.println("Hello hi yo hi hi. How many hi are in this sentence -  ");
    System.out.println(countHi("Hello hi yo hi hi"));
}
public static int countHi(String str) {
    int pos = -1, count = -1;

    do {
        count++;
        pos = str.indexOf("hi", pos + 1);
    } while (pos != -1);

    return count;
}
}
