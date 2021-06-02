import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {

		int num1;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da conta: "));
		JOptionPane.showMessageDialog(null, "10% do garçom é: " + somaNumeros(num1));
	}

	public static int somaNumeros(int num1) {
		return ((num1*10)/100);
	}
}