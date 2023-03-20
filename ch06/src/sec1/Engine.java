package sec1;

public class Engine {
	String fuel = "가솔린";		//연료
	int cc = 3000;				//연료주입량
	int displace = 4;		//배기량	
	
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getDisplace() {
		return displace;
	}
	public void setDisplace(int displace) {
		this.displace = displace;
	}
	@Override
	public String toString() {
		return "Engine [fuel=" + fuel + ", cc=" + cc + ", displace=" + displace
				+ "]";
	}
	
	
	
	
}
