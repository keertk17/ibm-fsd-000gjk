package IBM_1408;

public class AddArgs {
	public static void main(String args[]) {
		int sum=0;
		
		for(String arg:args) {
			try {
			System.out.println(args[10]);
			sum+=Integer.parseInt(arg);
		        }
			catch(NumberFormatException nfe){
			//System.err.println("number format exception");
			   //nfe.printStackTrace();
			   System.err.println(nfe.getCause().toString());
			   System.err.println(nfe.getMessage());
			   System.exit(0);
		     }
			catch(ArrayIndexOutOfBoundsException aiob) {
			   System.err.println("Array out of bound");
			   //System.exit(0);
		     }
			catch(Exception e) {
				System.out.println("Error occured"); //the root exception should be given at last aft the customized catch block
			}
			finally {
				System.err.println("Finally block called");
			}
		}
		System.out.println("Sum is :" +sum);
	}
}