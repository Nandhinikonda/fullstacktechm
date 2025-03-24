package twentytwomarch;
import java.util.*;
public class tribonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0,n1=1,n2=1;
		int num=sc.nextInt();
		System.out.print(n+" "+n1+" "+n2);
		for(int i=3;i<num;i++) {
			int ne=n+n1+n2;
			System.out.print(" "+ne);
			n=n1;
			n1=n2;
			n2=ne;
		}
	}
}