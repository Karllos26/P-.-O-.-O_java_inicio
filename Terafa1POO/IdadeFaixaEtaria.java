package tarefa;

import javax.swing.JOptionPane;

public class IdadeFaixaEtaria {

	/*7.Faça uma aplicaçãoque receba a idade e mostre 
	 a faixa estaria a partir da tabela seguinte.
	*/
	public static void main(String[] args) {
	
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade: "));
		
if(idade >=0 && idade <=3) {
			
	JOptionPane.showMessageDialog(null, "A idade é: "+idade+ " e sua faixa etária é *BEBÊ*");
		
		}else if(idade > 3 && idade <= 12) {
			
			JOptionPane.showMessageDialog(null, "A idade é: "+idade+ " e sua faixa etária é *CRIANÇA*");
		
		}else if(idade > 12 && idade <=18) {
			JOptionPane.showMessageDialog(null, "A idade é: "+idade+ " e sua faixa etária é *ADOLESCENTE*");
		}else if(idade > 18 && idade <=70) {
			
			JOptionPane.showMessageDialog(null, "A idade é: "+idade+ " e sua faixa etária é *ADULTO*");
		
		}else if(idade > 70 && idade <=120) {
			JOptionPane.showMessageDialog(null, "A idade é: "+idade+ " e sua faixa etária é *TERCEIRA IDADE*");
		}else {
			JOptionPane.showMessageDialog(null, "Faixa etária INDETERMINADA ");
		}
		
	}
	
}
