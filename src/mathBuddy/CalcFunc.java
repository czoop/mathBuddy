package mathBuddy;
public class CalcFunc {
	private double c4;
	private double c3;
	private double c2;
	private double c1;
	private double constant;
	private String derivative;
	
	
	//Constructor
	public CalcFunc(double c4, double c3, double c2, double c1, double constant)
	{
		this.c4 = c4;
		this.c3 = c3;
		this.c2 = c2;
		this.c1 = c1;
		this.constant = constant;
		this.derivative = "";
		differentiate();
	}
	
	public void differentiate()
	{
		derivative = derivative + (4 * c4) + "x^3 ";
		derivative = derivative + (3 * c3) + "x^2 ";
		derivative = derivative + (2 * c2) + "x ";
		derivative = derivative + c1;
	}
	
	public String getDerivative()
	{
		return derivative;
	}
}
