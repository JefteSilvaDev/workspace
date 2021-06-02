import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {

		float nota1, nota2;

		nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite nota 01: "));
		nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite nota 02: "));

		JOptionPane.showMessageDialog(null, "A media da sua note é: " + somaNumeros(nota1, nota2));
	}

	public static float somaNumeros(float n1, float n2) {
		return ((n1 + n2) / 2);
	}
}