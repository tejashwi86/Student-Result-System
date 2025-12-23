import java.io.*;
import java.util.*;
public class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)throws Exception{
        while(true)
        {
            System.out.println("\n1. Add Student");
            System.out.println("2.View All Students");
            System.out.println("3.Exit");
            System.out.println("Enter Choice: ");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    addStudent();
                    break;
                    case 2:
                        viewStudents();
                        break;
                        case 3:
                            System.exit(0);
                            default:
                                System.out.println("Invalid Choice");
           
            }
        }
    }
    static void addStudent() throws Exception{
        Student s=new Student();
        System.out.print("Enter ID: ");
        s.id=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        s.name=sc.nextLine();
        System.out.print("Enter Marks 1: ");
        s.m1 = sc.nextInt();
        System.out.print("Enter Marks 2: ");
        s.m2 = sc.nextInt();
        System.out.print("Enter Marks 3: ");
        s.m3 = sc.nextInt();
        s.calculate();
        FileWriter fw=new FileWriter("students.txt",true);
        fw.write(s.id+","+s.name+","+s.total+","+s.percentage+","+s.grade+"\n");
        fw.close();
        System.out.println("Student Added Successfully");
    }
    static void viewStudents() throws Exception{
        File file=new File("students.txt");
        if(!file.exists())
        {
            System.out.println("No Records Found");
            return;
        }
        Scanner fileSc= new Scanner(file);
        System.out.println("\nID   Name   Total   Percentage   Grade");
        while(fileSc.hasNextLine())
        {
            String line =fileSc.nextLine();
            String[] data=line.split(",");
            System.out.println(data[0]+" "+data[1]+" "+data[2]+" "+data[3]+" "+data[4]);

        }
        fileSc.close();
    }
}