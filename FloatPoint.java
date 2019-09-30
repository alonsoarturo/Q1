import java.util.Date;
public class FloatPoint {
		
	private Double x;
	private Double y;
	private Date now;

	
	public FloatPoint(double x, double y) { 
		this.x = x;
		this.y = y;
		now = new Date();
	}
	
	public FloatPoint() {
		this(0.0, 0.0);
	}
	
	public Double getX() {
		return x;
	}

	public Date getDate() {
		return (Date) now.clone();
	}
	
	public Double getY() {
		return y;
	}
	
	@Override
	public String toString() {
		return "FloatPoint [x=" + x + ", y=" + y + "]"
				+ "date: " + now;
	}

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	FloatPoint fp = new FloatPoint();
	//	TimingOfThings tot = fp.new TimingOfThings();
	//	tot.getTiming();
	//}

		
}


