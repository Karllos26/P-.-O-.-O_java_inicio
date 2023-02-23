package tarefa;

import javax.swing.JOptionPane;

public class SalarioAumento {

	/*6.Uma empresa decidiu dar um aumento a seus 
	 funcionários,dependendo do valor atual do salário.
	 Faça uma aplicaçãoque calcule o novo salário 
	 conforme a tabela seguinte:
	*/
	public static void main(String[] args) {
		
		float salario = Float.parseFloat(JOptionPane.showInputDialog("Entre seu salario atual: "));
		float aumento20 = salario + (salario * 0.2f);
			float aumento15 = salario + (salario * 0.15f);
		float aumento10 = salario + (salario * 0.1f);

		
		
		if(salario < 500 && salario > 0) {
			
			JOptionPane.showMessageDialog(null, "Seu salario atual é de: "+salario+". Seu salario após o aumento e de: "+aumento20);
				
				}else if(salario >= 500 && salario < 1000) {
				
					JOptionPane.showMessageDialog(null, "Seu salario atual é de: "+salario+". Seu salario após o aumento e de: "+aumento15);
						
				}else if(salario >= 1000 && salario <2000) {
					
					JOptionPane.showMessageDialog(null, "Seu salario atual é de: "+salario+". Seu salario após o aumento e de: "+aumento10);
						}else if(salario >= 2000 ) {
							
							JOptionPane.showMessageDialog(null, "Seu salario atual é de: "+salario+". Seu salario NÃO possui aumento");
								
				}else {
					
					JOptionPane.showMessageDialog(null, "Salario invalido");
				}
		
	}
	
}
