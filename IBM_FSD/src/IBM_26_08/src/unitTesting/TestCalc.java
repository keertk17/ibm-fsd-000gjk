package unitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class TestCalc extends TestCase {
	
	int x;
	int y;
	public  TestCalc(String name) {
		super(name);
		System.out.println(name);
	}
	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("initialize method");
		x=20;
		y=10;
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("clean up method");
		x=0;
		y=0;
	}

	@Test
	 public void testAddMethod() {
		Calculator c=new Calculator(x,y);
		int result=c.AddMethod();
		System.out.println("Add:");
		System.out.println(result);
		assertEquals(30,result);
	}
	public static TestSuite createTestSuite() {
		TestSuite testSuite=new TestSuite("Calculator");
		testSuite.addTest(new TestSuite("testAddMethod"));
		return testSuite;
	}
	/*public void testGreater() {
		
		Calculator c=new Calculator(x,y);
		int res=c.Greater();
		assertEquals(1,res);
	}*/
	public static void main(String args[]) {
		TestRunner.run(TestCalc.class);
	}
}
