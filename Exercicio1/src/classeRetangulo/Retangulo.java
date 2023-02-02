package classeRetangulo;

public class Retangulo {
	public double width, height;
	
	public double areaRet() {
		return width*height;
	}
	public double perimRet() {
		return (width + height)*2;
	}
	public double diagonaRet() {
		return Math.sqrt(width * width + height * height);
	}
}



	
	

