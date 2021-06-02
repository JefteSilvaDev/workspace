import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {

		int num1, num2;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));

		JOptionPane.showMessageDialog(null, "A soma entre os números é: " + somaNumeros(num1, num2));
	}

	public static int somaNumeros(int n1, int n2) {
		return (n1 + n2);
	}
}