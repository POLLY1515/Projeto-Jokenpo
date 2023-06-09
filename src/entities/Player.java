package entities;

public class Player {

	private String name;
	private Integer score;
	
	public Player() {
		
	}
	

	public Player(String name) {
		super();
		this.name = name;
		this.score = 0;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getScore() {
		return score;
	}


	public void setScore(Integer score) {
		this.score = score;
	}
	
	public void incrementScore() {
		setScore(getScore() + 1); 
	}
	

}
