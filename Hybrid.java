class StockMarket {

	public void IT() {
		System.out.println("Wipro is 450 inr");
	}
}

class Steel extends StockMarket {

	public void steelMarket() {
		System.out.println("TATA Steel is 1120 inr");
	}
}

class ITstock extends StockMarket {

	public void computer() {
		System.out.println("TCS is 3300");
	}
}

public class Hybrid extends Steel {

	public void onlyone() {
		System.out.println("ITC is 230 inr");
	}

	public static void main(String args[]) {
		Comodity comodity = new Comodity();
		comodity.onlyone();
	}

}