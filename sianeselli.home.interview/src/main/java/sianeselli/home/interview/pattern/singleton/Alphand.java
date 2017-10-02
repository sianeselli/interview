package sianeselli.home.interview.pattern.singleton;

public class Alphand {
	
	private static final Alphand INSTANCE = new Alphand();
	
	private Alphand(){
		
	}
	
	public static Alphand getInstance() {
		return INSTANCE;
	}

}
