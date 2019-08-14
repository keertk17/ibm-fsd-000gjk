package IBM_1308;

public class TestModel {

	public static void main(String[] args) {
		Model model =new Line(0,20);
		 Model model1=new Line(0,10);
		 System.out.println(model.isGreater(model,model1));
		 System.out.println(model.isLess(model,model1));
		 System.out.println(model.isLess(model,model1));

	}

}
