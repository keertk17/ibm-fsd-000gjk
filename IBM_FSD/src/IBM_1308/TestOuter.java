package IBM_1308;

public class TestOuter {
	public static void main(String args[]) {
		OuterClass oc=new OuterClass(7,7);
		OuterClass.InnerClass ic=oc.new InnerClass();
		ic.innerMethod();
	}

}
