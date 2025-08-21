package UsingVoid;
import java.util.Scanner;
class Students
{
	String name;
	int rollNo;
	String subjects[];
	int marks[];
	int total;
	double percentage;
	int numofsubjects;
	void inputDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		name=sc.nextLine();
		System.out.println("enter roll number:");
		rollNo=sc.nextInt();
		System.out.println("enter number of subjects:");
		numofsubjects=sc.nextInt();
		sc.nextLine();
		subjects=new String[numofsubjects];
		marks=new int[numofsubjects];
		System.out.println("enter name of subjects:");
		for(int i=0;i<numofsubjects;i++)
		{
			System.out.print("sub"+(i+1)+"name:");
			subjects[i]=sc.nextLine();
		}
		System.out.println("enter marks of subjects:");
		for(int i=0;i<numofsubjects;i++)
		{
			System.out.print(subjects[i]+":");
			marks[i]=sc.nextInt();
		}
		
	}
	void printDetails()
	{
		System.out.println("DETAILS");
		System.out.println("name:"+name);
		System.out.println("Roll no:"+rollNo);
	}
	void printMarks()
	{
		System.out.println("MARKS");
		for(int i=0;i<numofsubjects;i++)
		{
			System.out.print(subjects[i]+":"+marks[i]);
		}
	}
	void calcTotal()
	{
		total=0;
		for(int i=0;i<numofsubjects;i++)
		{
			total+=marks[i];
		}
		System.out.println("Total marks:"+total);
	}
	void calPercentage()
	{
		percentage=(double)total/numofsubjects;
		System.out.println("percentage:"+percentage+"%");
	}
	void printGrades()
	{
		System.out.println("grades of students:");
		if(percentage>=90)
		{
			System.out.println("A+");
		}
		else if(percentage<90&&percentage>=80)
		{
			System.out.println("A");
		}
		else if(percentage<80&&percentage>=70)
		{
			System.out.println("B");
		}
		else if(percentage<70&&percentage>=60)
		{
			System.out.println("C");
		}
		else if(percentage<60&&percentage>=40)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
public class ReportCardSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Students s=new Students();
		s.inputDetails();
		s.printDetails();
		s.printMarks();
		s.calcTotal();
		s.calPercentage();
		s.printGrades();
		
	}

}
