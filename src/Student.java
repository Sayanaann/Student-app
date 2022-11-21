import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    int rollno;
    int admisnno;
    String collage;


    public Student( String name, int rollno,int admisnno, String collage) {
        this.name = name;
        this.rollno = rollno;
        this.admisnno = admisnno;
        this.collage = collage;

    }
    public String toString() {
        return "\nStudent Details :" + "\nName: " + this.name + "\nrollno: " +
                this.rollno + "\nadmisnno: " + this.admisnno + "\ncollage: " + this.collage;
    }



    static void display(ArrayList<Student> al) {
        System.out.println("\n--------------Student List---------------\n");
        for (Student S : al) {

            System.out.println((S.name));
            System.out.println((S.rollno));
            System.out.println((S.admisnno));
            System.out.println((S.collage));
            System.out.println("   ");
        }
    }
    static void search(ArrayList<Student> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student ID to search :");
        int id = sc.nextInt();
        int i = 0;
        for (Student S : al) {
            if (id == S.admisnno) {
                System.out.println(S + "\n");
                i++;
            }
        }
        if (i == 0) {
            System.out.println("\nStudent Details are not available!!");
        }
    }



    static void delete(ArrayList<Student> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Student admisonno to DELETE");
        int id = sc.nextInt();
        int k = 0;
        for (Student S : al) {
            if (id == S.admisnno) {
                al.remove(S);
                Student.display(al);
                k++;
            }
        }
        if (k == 0) {
            System.out.println("\nStudent Details are not available!!");
        }
    }

    static void add(ArrayList<Student> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the following details to ADD list:\n");
        System.out.println("Enter Name :");
        String name = sc.next();
        System.out.println("Enter Rollno :");
        int rollno = sc.nextInt();
        System.out.println("Enter Admisnno:");
        int admisnno = sc.nextInt();
        System.out.println("Enter Collage :");
        String collage = sc.next();
        al.add(new Student(name, rollno,admisnno, collage));
    }



}

