class Java{
	
	void java(){
		System.out.println("Java is Object Oriented Language");
	}
}

class JavaScript extends Java{
	
	void javascript(){
		System.out.println("Forntend or Backend We use JavaScript");
	}
}

class Android extends Java{
	
	void android(){
		System.out.println("Android use is Application Develeopment");
	}
}

class Python extends Java{
	
	void python(){
		System.out.println("Python use in GUI");
	}
}

public class Hierarchical{
	
	public static void main(String[] args){
		JavaScript javascript = new JavaScript();
		Android android = new Android();
		Python python = new Python();
		javascript.java();
		android.java();
		python.java();
	} 
	
}