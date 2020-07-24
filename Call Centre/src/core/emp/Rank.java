package core.emp;

public enum Rank {
	
	RESPONDENT(0),
	MANAGER(1),
	DIRECTOR(2);
	
	int value;
	Rank(int val){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

}
