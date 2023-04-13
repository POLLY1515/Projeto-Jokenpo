package executar;

import java.util.Scanner;

import entities.Jokenpo;
import entities.Player;

public class Program {
	
	public static Jokenpo startGame() {
		System.out.println("***************** JO-KEN-PO *********************\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe seu nome:");
		String PlayerName = sc.next().toUpperCase() ;
		
		Player user = new Player(PlayerName);
		Player IA = new Player("IA");
		
		System.out.println(PlayerName + ",informe quantos rounds você quer jogar:");
		int rounds = sc.nextInt();
		
		return new Jokenpo(user, IA, rounds);

		
	}

	public static void main(String[] args) {
		
		Jokenpo jokenpo = startGame();
		jokenpo.ToPlay();
		jokenpo.showFinalResult();

	}

}
