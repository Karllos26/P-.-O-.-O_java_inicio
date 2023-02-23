package tarefa;

import javax.swing.JOptionPane;

public class MediaAprovadoReprovado {

	/*5.Faça uma aplicaçãoque receba a nota de duas 
	 provas (a nota deve ser um valor entre 0 e10). 
	 A seguir,apresente a média e o resultado final,
	 conforme a tabela abaixo:
	*/
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Digite as notas do aluno de 0 a 10!");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Entre com a primeira nota: "));
		if (nota1 < 0 || nota1 > 10) {
			JOptionPane.showMessageDialog(null, "Valor inválido");
            return; 
        }
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Entre com a segunda nota:"));
		if (nota2 < 0 || nota2 > 10) {
			JOptionPane.showMessageDialog(null, "Valor inválido");
            return; 
        }
		
		
		float media = (nota1 + nota2) /2;
		
		
		if(media >=0 || media <5) {
			
			JOptionPane.showMessageDialog(null, "A média do aluno e de: "+media+ " e ele foi *Reprovado*");
		
		}else if(media >= 5 || media <7) {
			
			JOptionPane.showMessageDialog(null, "A média do aluno e de: "+media+ " e ele está de *Recuperação*");
		
		}else if(media >= 7 || media <=10) {
			JOptionPane.showMessageDialog(null, "A média do aluno e de: "+media+ " e ele está *Aprovado*");
		}
		
	}
	
}
