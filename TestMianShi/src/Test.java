
public class Test {
   public static void main(String[] args) {
	Person man=new Person();
	Person woman =new Person();
	man.address="xxx";
	System.out.println(woman.address);
	String a="qqq";
	String b="qqq";
	String c=new String("qqq");
	System.out.println(a==b);
	System.out.println(b==c);
}
}
