public interface MyInterface{

	int LEVEL = 6;
	void display(String msg);
	String result();
}

public class Projector implements MyInterface{

	private String model;
	private String brand;
	private float lampHrs;

	Projector(String model,String brand){
	
		this.model=model;
		this.brand=brand;
	}

	public void setLampHrs(String lampHrs){
		this.lampHrs=lampHrs;
	}

	public float getLampHrs(){
		return this.lampHrs;
	}

	public void display(){
		System.out.println("Model   :"+this.model);
		System.out.println("Brand   :"+this.brand);
		System.out.println("Level   :"+LEVEL);
	}

	public void result(){
		if(lampHrs<1000){
			System.out.println("RED");

		}
		else{
			System.out.println("GREEN");
		}
	}
	


}


//inheritance the project class to laser projector

private class LaserProjector extends Projector{
	

	@Override 
	public void result(){
		if(lampHrs<5000){
			System.out.println("RED");
		}
		else{
			System.out.println("GREEN");
		}
		
	}

}

private abstract class BasicProjector() implements MyInterface{



	String model;
	String brand;

	public abstract result();
	public display();

	



}
