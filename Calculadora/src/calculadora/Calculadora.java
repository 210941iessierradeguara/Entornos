package calculadora;

public class Calculadora {
	int num1;
	int num2;
	
	/**
	 * 
	 * @param num1 Número entero
	 * @param num2 Número entero
	 */
	public Calculadora(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	/**
	 * 
	 * @return Devuelve la suma de los números num1 y num2 que son atributos del objeto. 
	 */
	
	public int suma() {
		return num1+num2;
	}
	
	/**
	 * 
	 * @return la suma de los números con un segundo de retardo
	 * @throws InterruptedException lanzado por el metodo sleep de la clase thread
	 * {@code Thread.sleep(300);}
	 */
	
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
