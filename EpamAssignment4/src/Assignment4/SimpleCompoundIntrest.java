package Assignment4;

public class SimpleCompoundIntrest {
	public SimpleCompoundIntrest(){
		
	}
	public double SimpleIntrest(double p,double t,double r){
		return (p*t*r)/100;
	}
	public double CompoundIntrest(double p,double t,double r){
		double c=p*(Math.pow(1+(r/100),t));
		return c;
	}
}
