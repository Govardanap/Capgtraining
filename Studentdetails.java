package project27;
import java.util.Scanner;
public class Studentdetails {
	int stid;
	String stname;
	String stad;
	String collegename;
	Studentdetails(){
		
	}
	
	Studentdetails(int s,String stu,String ad,String cgn){
		stid=s;
		stname=stu;
		stad=ad;
		collegename=cgn;
	}
Studentdetails(int s,String stu,String ad){
	stid=s;
	stname=stu;
	stad=ad;
	collegename="NIT";
}
public int getStudentId()
{
    return this.stid;
}

public String getStudentName()
{
    return this.stname;
}

public String getStudentAddress()
{
    return this.stad;
}

public String getCollegeName()
{
    return this.collegename;
}
public static void main (String[] args) 
{
    
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Student's Id:");
   int studentId=sc.nextInt();
   System.out.println("Enter Student's Name:");
   String studentName=sc.next();
   System.out.println("Enter Student's address:");
   String studentAddress=sc.next();
   {
        System.out.println("Whether the student is from NIT(Yes/No):");
        String answer=sc.nextLine();
   
        if(answer.equalsIgnoreCase("yes"))
        {
            Studentdetails s1 = new Studentdetails(studentId, studentName, studentAddress);
            System.out.println("Student id:"+s1.getStudentId());
            System.out.println("Student name:"+s1.getStudentName());
            System.out.println("Address:"+s1.getStudentAddress());
            System.out.println("College name:"+s1.getCollegeName());
        }
       
        else if(answer.equalsIgnoreCase("no"))
        {       
            System.out.println("Enter the college name:");
            String collegename=sc.nextLine();
            
            Studentdetails s2 = new Studentdetails(studentId, studentName, studentAddress, collegename);
            
            System.out.println("Student id:"+s2.getStudentId());
            System.out.println("Student name:"+s2.getStudentName());
            System.out.println("Address:"+s2.getStudentAddress());
            System.out.println("College name:"+s2.getCollegeName());
        }
        
        else
        {
            System.out.println("Wrong Input");
        } 
}
}
}