package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRecordManagementSystem {
	static ArrayList<String>names=new ArrayList<>();
	static ArrayList<Integer>ages=new ArrayList<>();
	static ArrayList<Character>genders=new ArrayList<>();
	static ArrayList<String>branches=new ArrayList<>();
	static ArrayList<String>years=new ArrayList<>();
	static ArrayList<Double>marks1=new ArrayList<>();
	static ArrayList<Double>marks2=new ArrayList<>();
	static ArrayList<Double>marks3=new ArrayList<>();
	static ArrayList<Double>total=new ArrayList<>();
	static ArrayList<Double>avg=new ArrayList<>();
	static ArrayList<Double>per=new ArrayList<>();
	static String password="Prathyusha";
	public static void detail()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("*****Details*****");
		{
		int c=1;
		while(c==1)
		{
			System.out.println("enter 1 to  add details and 0 to stop");
			c=sc.nextInt();
			sc.nextLine();
			if(c==1)
			{
				System.out.println("enter the names:");
				String name=sc.nextLine();
				names.add(name);
				System.out.println("enter the ages:");
				int age=sc.nextInt();
				ages.add(age);
				sc.nextLine();
				System.out.println("enter the gender:");
				char gender=sc.next().charAt(0);
				genders.add(gender);
				System.out.println("enter the branch:");
				String branch=sc.next();
				branches.add(branch);
				System.out.println("enter the year:");
				String year=sc.next();
				years.add(year);
				System.out.println("enter the mark1:");
				double mark1=sc.nextDouble();
				marks1.add(mark1);
				System.out.println("enter the mark2:");
				double mark2=sc.nextDouble();
				marks2.add(mark2);
				System.out.println("enter the mark3:");
				double mark3=sc.nextDouble();
				marks3.add(mark3);
				
			}
		}
		System.out.println("names entered:"+names);
		System.out.println("ages entered:"+ages);
		System.out.println("genders entered:"+genders);
		System.out.println("branches entered:"+branches);
		System.out.println("years entered:"+years);
		System.out.println("marks1 entered:"+marks1);
		System.out.println("marks2 entered:"+marks2);
		System.out.println("marks3 entered:"+marks3);
		}
	}
	public static void update()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for adding specific details of students");
		System.out.println("enter 2 for set specific indexed details");
		System.out.println("enter 3 for get specific indexed details");
		System.out.println("enter 4 for remove specific indexed details");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:
		{
			int e=1;
			while(e==1)
			{
				System.out.println("enter 1 to  add details and 0 to stop");
				e=sc.nextInt();
				sc.nextLine();
				if(e==1)
				{
					System.out.println("enter the names:");
					names.add(sc.next());
					System.out.println("enter the ages:");
					ages.add(sc.nextInt());
					sc.nextLine();
					System.out.println("enter the gender:");
					genders.add(sc.next().charAt(0));
					System.out.println("enter the branch:");
					branches.add(sc.next());
					System.out.println("enter the year:");
					years.add(sc.next());
					System.out.println("enter marks1:");
					marks1.add(sc.nextDouble());
					System.out.println("enter marks2:");
					marks2.add(sc.nextDouble());
					System.out.println("enter marks3:");
					marks3.add(sc.nextDouble());
				}
			}
			break;
		}
		case 2:
		{
			System.out.println("enter student index to update:");
			int ind=sc.nextInt();
			if(ind<0||ind>=names.size())
			{
				System.out.println("invalid index");
				return;
			}
			System.out.println("enter new name:");
			names.set(ind,sc.next());
			System.out.println("enter new ages:");
			ages.set(ind,sc.nextInt());
			System.out.println("enter new gender:");
			genders.set(ind,sc.next().charAt(0));
			System.out.println("enter new branch:");
			branches.set(ind,sc.next());
			System.out.println("enter new year:");
			years.set(ind,sc.next());
			System.out.println("enter new marks1:");
			marks1.set(ind,sc.nextDouble());
			System.out.println("enter new marks2:");
			marks2.set(ind,sc.nextDouble());
			System.out.println("enter new marks3:");
			marks3.set(ind,sc.nextDouble());
			System.out.println("updated successfully");
			break;
		}
		case 3:
		{
			if(names.isEmpty())
			{
				System.out.println("no student data found");
				break;
			}
			System.out.println("Records....");
			for(int i=0;i<names.size();i++)
			{
				System.out.println("\nIndex:"+i);
				System.out.println("Name:"+names.get(i));
				System.out.println("Age:"+ages.get(i));
				System.out.println("Gender:"+genders.get(i));
				System.out.println("Branch:"+branches.get(i));
				System.out.println("Year:"+years.get(i));
				System.out.println("Marks1:"+marks1.get(i));
				System.out.println("Marks2:"+marks2.get(i));
				System.out.println("Marks3:"+marks3.get(i));
			}
			break;
		}
		case 4:
		{
			if(names.isEmpty())
			{
				System.out.println("no student data found");
				break;
			}
			System.out.println("enter index of student to remove:");
			int ind=sc.nextInt();
			if(ind<0||ind>=names.size())
			{
				System.out.println("invalid index");
				break;
			}
			names.remove(ind);
			ages.remove(ind);
			genders.remove(ind);
			branches.remove(ind);
			years.remove(ind);
			marks1.remove(ind);
			marks2.remove(ind);
			marks3.remove(ind);
			System.out.println("Students data removed successfully");
			break;
		}
		default:
			System.out.println("enter valid choice:");
		}
	}
	public static void calc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("*****calculation*****");
		{
			for(int i=0;i<marks1.size();i++)
			{
			double totalMarks=marks1.get(i)+marks2.get(i)+marks3.get(i);
			double avgMarks=totalMarks/3.0;
			double percentage=(totalMarks/300.0)*100.0;
			total.add(totalMarks);
			avg.add(avgMarks);
			per.add(percentage);
			System.out.println("Student:"+names.get(i));
			System.out.println("age:"+ages.get(i));
			System.out.println("marks:"+marks1.get(i)+","+marks2.get(i)+","+marks3.get(i));
			System.out.println("enter total:"+totalMarks);
			System.out.println("enter average:"+avgMarks);
			System.out.println("enter percentage:"+percentage);
			}
		}
	}
	public static void display()
	{
		 if(names.isEmpty())
		    {
		        System.out.println("No student data found");
		        return;
		    }
		    System.out.println("STUDENT RECORDS");
		    for(int i=0; i<names.size(); i++)
		    {
		        System.out.println("\n");
		        System.out.println("Index:"+i);
		        System.out.println("Name:"+names.get(i));
		        System.out.println("Age:"+ages.get(i));
		        System.out.println("Gender:"+genders.get(i));
		        System.out.println("Branch:"+branches.get(i));
		        System.out.println("Year:"+years.get(i));
		        if(i<marks1.size()) 
		        {
		            System.out.println("Marks1:"+marks1.get(i));
		            System.out.println("Marks2:"+marks2.get(i));
		            System.out.println("Marks3:"+marks3.get(i));
		        }
		        if(i<total.size()) {
		            System.out.println("Total:"+total.get(i));
		            System.out.println("Average:"+avg.get(i));
		            System.out.println("Percentage:"+per.get(i)+"%");
		        }
		    }
		    System.out.println("\n End Records");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int attempts=0;
        boolean login=false;
        while (attempts<3)
        {
            System.out.print("Enter password: ");
            String pass=sc.nextLine();
            if (pass.equals(password))
            {
                login=true;
                break;
            }
            else
            {
                attempts++;
                System.out.println("Incorrect password and Attempts left:"+(3-attempts));
            }
        }
        if(!login)
        {
            System.out.println("Access denied");
            return;
        }
        int choice;
        do {
            System.out.println("\nSRMS");
            System.out.println("1to  Enter Student Details");
            System.out.println("2 for Update Records");
            System.out.println("3for Calculate Results");
            System.out.println("4 for displaying Results");
            System.out.println("5 forExit");
            System.out.print("Enter choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    detail();
                    break;
                }
                case 2:
                {
                    update();
                    break;
                }
                case 3:
                {
                    calc();
                    break;
                }
                case 4:
                {
                	display();
                	break;
                }
                case 5:
                {
                    System.out.println("Exiting program");
                    break;
                }
                default:
                    System.out.println("Invalid choice");
            }
        } while(choice!=5);
	}
}