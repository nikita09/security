
public class object {
	String name = "";
	SecurityLvl level;

	public object(String name, SecurityLvl level){
		this.name = name;
		this.level = level;
	}
	
	public String getName(){
		return name;
	}

}
