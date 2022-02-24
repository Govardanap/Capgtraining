package project27;

public class Train {
int Tno;
String Tname;
String source;
String Destination;
Train(){
	
}
Train(int a,String i,String s,String d){
	Tno=a;
	Tname=i;
	source=s;
	Destination=d;
}
void gettrain() {
	System.out.println("Tname is "+Tname+"Source is "+source+"Tno is "+Tno+"Destination is "+Destination);
}
public static void main(String args[]) {
	Train t1=new Train(1001, "Mumbai Express", "Mumbai ", "Chennai");
	Train t2=new Train(1002,"Rajdhani Express ","Delhi ","Hyderabad");
	t1.gettrain();
	System.out.println(t2.toString());
}
}
