package day05;

public class VarMain {

	public static void main(String[] args) {
		
		Variable var = new Variable();
		
		var.a = 100; //외부에서 값변경
		var.b = "바꿔버릴꺼야";
		
		var.printNum(10);
		
		
	}
}
