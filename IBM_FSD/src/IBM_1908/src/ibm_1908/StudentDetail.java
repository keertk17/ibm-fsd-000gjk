package ibm_1908;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDetail {

	static  List<Integer> l=new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
     boolean y=true;  
     do{   
         System.out.println("Enter 1 to add \n2 to delete no.\n3 to edit");
         System.out.println("enter your choice");
         int choice=in.nextInt();
         switch(choice)
         {
            case 1:
                add();
                break;
            case 2:
                delete();
                break;
            case 3:
                edit();
                break;
            default:
                System.out.println("bad input");
                break;
        }
        System.out.println("want to process more? y/n");
        String x=in.next();
        char ch=x.charAt(0); 
        if( ch=='n')
            y=false;
    }
    while(y!=false);
   
    }
    
    static void add()
    {
    	Scanner in=new Scanner(System.in);
        
        boolean y=true;
       do{
            System.out.println("enter no to add in list");
            int num=in.nextInt();
                l.add(num);
            System.out.println("want to insert more?y/n");
            String x=in.next();
            char ch=x.charAt(0);
            if( ch=='n')
                y=false;
         }
       while(y!=false); 
   }
    static void delete()
    {
    	 Scanner in=new Scanner(System.in);
         System.out.println("enter position you want to delete");
         int num=in.nextInt();
         l.remove(num);
    }
    static void edit()
    {
    	Scanner in=new Scanner(System.in);
        int num1,num2;
        System.out.println("enter no you want to add");
        num2=in.nextInt();
              try{
                 System.out.println("enter position you want to edit");
                 num1=in.nextInt();
                 l.set(num1, num2);
              }catch(IndexOutOfBoundsException e){
                     System.err.println("caught IndexOutOfBoundsException: specified position is empty "+e.getMessage());
                }
        
           }
    }
   
 
 
