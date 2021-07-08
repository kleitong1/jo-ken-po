import java.util.Random;


import javax.swing.JOptionPane;

public class Regras {

	
	private int elemento;
	static int n;
	
	
	public int getElemento() {
		return elemento;

	}
	
	public Regras() {
		Random rand = new Random();

		n = rand.nextInt(3);
	}

	public void verificaElemento(int elemento) {
		this.elemento = elemento;
		
		if (this.elemento == 0) {
			System.out.println("Você escolheu papel \n ");

		}
		if (this.elemento == 1) {

			System.out.println("Você escolheu tesoura \n ");
		}
		if (this.elemento == 2) {

			System.out.println("Você escolheu pedra \n ");

		}
		maquina();
		
	}

	public void condicoesVitoriaEDerrota(int n, int elemento) {
		if(elemento == n) {
			System.out.println("Houve um empate ");
		}else {
			if((elemento == 0 && n == 2) || (elemento == 1 && n == 0) || (elemento == 2 && n == 0)){
				System.out.println("Parabéns, você venceu o Jokenpo");
			}else {
				System.out.println("Perdeu");
			}
		}
	}
	
	public void maquina() {
				
		if (n == 0) {
			System.out.println("A máquina escolheu papel \n ");

		}
		if (n == 1) {

			System.out.println("A máquina escolheu tesoura \n ");
		}
		if (n == 2) {

			System.out.println("A máquina escolheu pedra \n ");

		} 
		condicoesVitoriaEDerrota(n, elemento);
	}



	public void setJogador() {

			

		int elemento = Integer.parseInt(JOptionPane.showInputDialog(
				"Faça sua escolha entre: \n " + "Papel   (0) \n" + "Tesoura (1) \n" + "Pedra   (2) \n"));
		
		System.out.println("Pedra ganha de tesoura \n "
				+ "Tesoura ganha de Papel \n "
				+ "Papel ganha de Pedra \n ");
		verificaElemento(elemento);
		

	}

}
