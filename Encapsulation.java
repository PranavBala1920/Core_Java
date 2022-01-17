class Area {

	int length;
	int width;

	Area(int length , int width) {
		this.length = length;
		this.width = width;
	}

	void getName() {
		int area = length * width;
		System.out.println("Area is :- " + area);
	}
	
}

public class Encapsulation {
	
	public static void main(String[] args) {
		Area area = new Area(5 , 2);
		area.getName();
	}

}