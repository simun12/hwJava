package creator;

public class partice {

	public static void main(String[] args) {
//		int add=fall18(222,200,100, 2);
//		int result=add*5;
//		System.out.println(result);
		partice bea=new  partice ();
		//bea.summer18();
		int [] c=bea.usher(20,26);
		System.out.println(c);
	}
	public static int fall18(int a,int b, int c, int d) {
		return(a+b+c+d);
	}
	public void summer18() {
		int a=21;
		String b=" where are you";
		System.out.println(a+b);
	}
	public int[] usher(int a,int b) {
		int [] op=new int[3];
		op[0]=a+b;
		op[1]=a-b;
		op[2]=b+a;
		return op;
		
	}
	}
		
		
			
		
	
	


