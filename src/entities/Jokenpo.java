package entities;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	private Player User;
	private Player IA;
	private int rounds;
	
	public Jokenpo() {
		// TODO Auto-generated constructor stub
	}
	
	public Jokenpo(Player user, Player iA, int rounds) {
		super();
		User = user;
		IA = iA;
		this.rounds = rounds;
	}

	public Player getUser() {
		return User;
	}

	public void setUser(Player user) {
		User = user;
	}

	public Player getIA() {
		return IA;
	}

	public void setIA(Player iA) {
		IA = iA;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	
	//metodo void nao retorna nada,apenas executa uma ação
	public void ToPlay() {
	
		System.out.println("SEJA BEM VINDO(a): ******" + User.getName() + "*****\n");
	   for(int i = 0; i <= rounds;i++) {
		   int choiceuser =  choiceUser();  
		    if (choiceuser < 1 || choiceuser > 3) {
		    	System.out.println("Jogada inválida! (1,2 ou 3):");
		    	System.out.println("Ponto para " + IA.getName() + "\n");
		    	IA.incrementScore();
		    	continue;
		    	
		    
		    }
		    
		    int choiceia = choiceIA();
		    System.out.println("\n" + choiceuser + " X " + choiceia);
		    
		    int result = choiceuser - choiceia;
		    
		    winnerRound(result);
		
	   }
		
		
	}
	
	public void showFinalResult() {
		System.out.println("********************************");
		
		Integer finalScoreUser = User.getScore();
		Integer finalscoreIa = IA.getScore();
		System.out.println("PLACAR FINAL:" + User.getName() + " " + User.getScore()
		+ " " + " X " + IA.getScore() + " " + IA.getName());
		if(finalScoreUser  == finalscoreIa) {
			System.out.println("Empate!");
		}else {
			String finalWinner = (finalScoreUser > finalscoreIa ? 
					User.getName(): IA.getName());
			System.out.println("Vencedor:" + finalWinner.toUpperCase());

		}
		
	}
	
	private void winnerRound(int result) {
		String winnerRound;
		if(result == 0) {
			winnerRound = "Empate";
		}else if(result == -1 || result == 2) {
			IA.incrementScore();
			winnerRound = IA.getName();
		}else {
			User.incrementScore();
			winnerRound = User.getName();
		}
		
		System.out.println("Vencedor do round:" + winnerRound);
	}
	

	private int choiceIA() {
	 Random random = new Random();
	 return random.nextInt(3) + 1;
	}
	
	
	private int choiceUser() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		
		System.out.println("Informe sua jogada:");
		
		return  sc.nextInt();


	}
	
}
