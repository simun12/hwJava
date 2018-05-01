package creator;

public class pratice2 extends partice {

public static void main(String[] args) {
		substring();
		pratice2 bell= new pratice2();
		bell.split();
		swit();
greter();
partice spoil= new partice();
spoil.usher(23, 90);
arrayassorting();
	}
protected static void substring() {
	String a="i think we all should eat healthy food";
	System.out.println(a.substring(0, 5));
	trim();
	parselnt();
}
private void split () {
	String b="lets eat healthy food";
	String o[]=b.split(" ");
	System.out.println(o[2]);
	
}
public static void trim() {
	String h="what  ";
	String d=" is";
	String c="that  ";
	System.out.println(h.trim()+d.trim()+c.trim());
}
protected static void parselnt() {
	String t="173";
	String u="125";
	int op=Integer.parseInt(t);
	int up=Integer.parseInt(u);
	System.out.println(t+u);
}
private static void swit() {
	int day=3;
	switch(day) {
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("tuesday");
		break;
	case 3:
		System.out.println("wednesday");
		break;
	case 4:
		System.out.println("thurdays");
		break;
	case 5:
		System.out.println("friday");
		break;
	case 6:
		System.out.println("saturday");
		break;
	case 7:
		System.out.println("sunday");
		break;
	}
}
public static void greter() {
	int ww=23;
	int ss=33;
	int rr=44;
	System.out.println(ww>ss);
	System.out.println(ww<ss);
	System.out.println(rr>ww);
}
private static void arrayassorting () {
	int [] test={234,23,45,2,9,1};
	for(int a=0; a<test.length; a++) {
		for(int b=0;b<test.length;b++) {
			if (test[a]>test[b]);
			int temp;
			temp=test[a];
			test[a]=test[b];
			test[b]=b;
		}
	}for( int c=0;c<test.length;c++) {
		System.out.println(test[c]);
	}
}
	
}
