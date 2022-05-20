package calculadora;

public class Calculadora {
	int num1;
	int num2;
	
	public Calculadora(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int suma() {
		return num1+num2;
	}
	
	public int sumaLenta(){
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return num1+num2;
	}
	
	public int resta() {
		return num1-num2;
	}
	
	public int producto() {
		return num1*num2;
	}
	
	public double division() {
		return (double)(num1)/num2;
	}
	
	public double raizNum1() {
		return Math.sqrt(num1);
	}
	
	public double raizNum2() {
		return Math.sqrt(num2);
	}
}
