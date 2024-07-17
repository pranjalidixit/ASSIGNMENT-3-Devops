public class student {import java.util.*;
    {
        String name;
        int stan;
        int rn;
        int cnum;
        double result;
        String email;
        void get()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter name:");
            name=sc.nextLine();
            System.out.println("Enter class:");
            stan=sc.nextInt();
            System.out.println("Enter roll number:");
            rn=sc.nextInt();
            System.out.println("Enter contact:");
            cnum=sc.nextInt();
            System.out.println("Enter email:");
            sc.nextLine();
            email=sc.nextLine();
        }
        void display()
        {
            System.out.println("Name:"+name);
            System.out.println("Class:"+stan);
            System.out.println("Roll number:"+rn);
            System.out.println("Contact:"+cnum);
            System.out.println("Email:"+email);
            System.out.println("Result:"+result);
        }
        void result()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter physics marks");
            int p=sc.nextInt();
            System.out.println("Enter chemistry marks");
            int c=sc.nextInt();
            System.out.println("Enter maths marks");
            int m=sc.nextInt();
            result=((p+c+m)/3.0);
        }
        public static void main(String args[])
        {
            student as=new student();
            as.get();
            as.result();
            as.display();
        }
    }
    
}
