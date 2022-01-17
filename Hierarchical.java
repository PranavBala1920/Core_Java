class Java {
	
	void java() {
		System.out.println("Java is based On Object Oriented Language");
	}
	
}

class JavaScript extends Java {
	
	void javascript() {
		System.out.println("We Used JavaScript In React Native");
	}
	
}

class Android extends Java {
	
	void android() {
		System.out.println("Android used In Application Develeopment");
	}
	
}

class Python extends Java {
	
	void python() {
		System.out.println("Python used in GUI");
	}
	
}

public class Hierarchical {
	
	public static void main(String[] args) {
		JavaScript javascript = new JavaScript();
		Android android = new Android();
		Python python = new Python();
		javascript.java();
		android.java();
		python.java();
	} 
	
}