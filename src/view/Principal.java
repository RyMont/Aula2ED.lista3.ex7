package view;

import javax.swing.JOptionPane;

import controller.SomaController;

public class Principal {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
		SomaController sc = new SomaController();
		
		int soma = sc.somaDigitos(num);
		System.out.print("A soma dos algarismos é: " +soma);
	}
}
