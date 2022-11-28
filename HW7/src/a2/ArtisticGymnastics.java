package a2;

public class ArtisticGymnastics implements Team {   //Leaf
	
	private int athletes = 6;
	private String name = "Womens Artistic Gymnastics";
	private int gold = 0;

	@Override
	public void printNameOfTeam() {
		System.out.println(getName());
	}

	@Override
	public void printNumberOfGold() {
		System.out.println(getGold());
	}

	@Override
	public void printNumberOfAthletes() {
		System.out.println(getAthletes());
	}  

	public int getAthletes() {
		return athletes;
	}

	public String getName() {
		return name;
	}

	public int getGold() {
		return gold;
	}

	public void setAthletes(int athletes) {
		this.athletes = athletes;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}



}
