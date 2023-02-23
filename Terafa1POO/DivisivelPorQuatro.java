package tarefa;

public class DivisivelPorQuatro {

	/*Elabore uma aplicação que apresente todos os números
	  divisíveis por 4 que sejam menores que 200. 
	  Para verificar se o número é divisível por 4,
	  efetuar dentro  da malha  de  verificação  lógica  
	  desta  condição  com  a  instrução  se, 
	  perguntando se o número é divisível; sendo, 
	  mostre-o, não sendo, passe para o próximo passo. 
	*/
	public static void main(String[] args) {
		
			for(int quatro  = 1;quatro <=200;quatro++) {
				
				if(quatro % 4 == 0) {
				System.out.println(quatro);
				}
			}
	}
	
}
