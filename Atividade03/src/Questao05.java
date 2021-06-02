import javax.swing.JOptionPane;

public class Questao05 {

	public static void main(String[] args) {

		double num1, num2;

		num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora: "));
		JOptionPane.showMessageDialog(null, "O salário do funcionário é: " + somaNumeros(num1,num2));
	}

	public static double somaNumeros(double num1, double num2) {
		return (num1*num2);
	}
}