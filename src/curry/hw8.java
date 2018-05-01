package curry;

public class hw8 {

	public static void main(String[] args) {
//		int[] a={23,5,14,7,234};
//		for(int b=0;b<a.length;b++) {
//			for(int c=b+1;c<a.length;c++) {
//				if(a[b]>a[c]) {
//					int temp;
//					temp=a[b];
//					a[b]=a[c];
//					a[c]=temp;
//				}
//			}
//		}for(int f=0;f<a.length;f++) {
//			System.out.println(a[f]);
		}

	
protected static void sort() {
	int [] wed={23,7,14,5,234};
	int temp;
	for(int p=0;p<wed.length;p++) {
		for(int o=p+1;o<wed.length;o++) {
	if(wed[p]>wed[o]) {
		temp=wed[p];
		wed[p]=wed[o];
		wed[o]=temp;
	}
		} for(int c=0;c<wed.length;c++) {
			System.out.println(wed[c]);
		}
		
			
		}
	
}
}
