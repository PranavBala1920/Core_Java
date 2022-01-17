class StockMarket {

	public void IT() {
		System.out.println("Wipro 450 INR");
	}
	
}

class Steel extends StockMarket {

	public void steelMarket() {
		System.out.println("TATA Steel 1120 INR");
	}
	
}

class ITstock extends StockMarket {

	public void computer() {
		System.out.println("TCS 3300 INR");
	}
	
}

public class Hybrid extends Steel {

	public void onlyone() {
		System.out.println("ITC 230 INR");
	}

	public static void main(String args[]) {
		Comodity comodity = new Comodity();
		comodity.onlyone();
	}

}