package controller;

public class SomaController {
	public int somaDigitos(int num) {
		
		if (num==0) {
			return 0;
		}
		
		return num%10 + somaDigitos(num/10);
	}
}
