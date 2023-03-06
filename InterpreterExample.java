
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class InterpreterExample {
	public static void main(String[] args) {
		String formula = args[0];
		Evaluator exp = new Evaluator(formula);
		Map<String,Expression> variables = new HashMap<String,Expression>();
		System.out.println("Les Valeurs : ");
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		while (true) {
			System.out.println("variable name : ");
			String variableName = in2.next();
			if(variableName.equals("END")){
				break;
			}
			System.out.println("its value : ");
			String numbers = in.next();
			System.out.println("var " + variableName + " value "+numbers + "\n");
			variables.put(variableName, new Number(Integer.valueOf(numbers)));
		}
		int result = exp.interpret(variables);
		System.out.println(result);
		in.close();
		in2.close();
	}
}