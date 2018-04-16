package helloworld;

/**
 * Um programa que diz Ola Mundo
 */
public class HelloWorld {
	public static void main(String[] args) {
		String nome = "Mundo";
		if(args.length > 0){
			nome = args[0];
		}
		System.out.println("Ola, " + nome);
	}
}
