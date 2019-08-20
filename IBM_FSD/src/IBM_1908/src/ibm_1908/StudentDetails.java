package ibm_1908;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	public class StudentDetails {

		static  List<String> l=new ArrayList<String>();
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
	            System.out.println("enter id ");
	            int id=in.nextInt();
	            System.out.println("enter the name");
	            String name=in.next();
	            System.out.println("enter the gpa");
	            int gpa=in.nextInt();
	                l.add("id");
	                l.add(name);
	                l.add("gpa");
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
	         System.out.println("enter id you want to delete");
	         int id=in.nextInt();
	         l.remove(id);
	    }
	    static void edit()
	    {
	    	Scanner in=new Scanner(System.in);
	        int num1;
	              try{
	                 System.out.println("enter position you want to edit");
	                 num1=in.nextInt();
	                 System.out.println("enter your the field to edit");
	    	         String choice=in.next();
	    	         switch(choice)
	    	         {
	    	            case "id":
	    	            	System.out.println("enter id ");
	    	 	            int id=in.nextInt();
	    	 	            l.set(num1, "id");
	    	                break;
	    	            case "name":
	    	            	System.out.println("enter the name");
	    	 	            String name=in.next();
	    	 	            l.set(num1, name);
	    	                break;
	    	            case "gpa":
	    	            	System.out.println("enter the gpa");
	    	 	            int gpa=in.nextInt();
	    	 	            l.set(num1, "gpa");
	    	                break;
	    	            default:
	    	                System.out.println("bad input");
	    	                break;
	    	        }
	              }catch(IndexOutOfBoundsException e){
	                     System.err.println("caught IndexOutOfBoundsException: specified position is empty "+e.getMessage());
	                }
	        
	           }
	    }
	   
	 