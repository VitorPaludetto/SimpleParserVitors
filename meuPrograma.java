import java.util.Scanner;

public class meuPrograma {
	public static void main(String args[]) {
		Scanner _scTrx = new Scanner(System.in);
		int a;
		int b;
		int c;
		String d;
		System.out.println("Hello World");
		System.out.println("Fim do programa");
		a = _scTrx.nextInt();
		b = _scTrx.nextInt();
		System.out.println(a);
		if (a > 5) {
			System.out.println("maior que 5");
		} else {
			System.out.println("menor que 5");
		}
		if (3 != 5) {
			System.out.println("diferente");
		} else {
			System.out.println("igual");
		}
		System.out.println("oi agora vamos testar outro");
		if (b >= 0) {
			System.out.println("b positivo");
		} else {
			System.out.println("b negativo");
		}
		c = 3 + 5 * 2;
		System.out.println(c);
		while (a > 5) {
			System.out.println("while");
			a = a - 1;
		}
		d = "o";
		System.out.println(d);
	}
}
