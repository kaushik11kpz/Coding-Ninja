

public class ComplexNumber {

	private int real;
	private int imaginary;
	
	public ComplexNumber(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void setReal(int num) {
		this.real = num;
	}
	public int getReal() {
		return real;
	}
	public void setImaginary(int num) {
		this.imaginary = num;
	}
	public int getImaginary() {
		return imaginary;
	}
	
	public void print() {
		System.out.println(real + " + "+ imaginary+"i");
	}
	
	public void add(ComplexNumber c) {
		this.real = this.real + c.real;
		this.imaginary = this.imaginary + c.imaginary;
	}
	public void multiply(ComplexNumber c) {
		int tempReal = this.real*c.real - this.imaginary*c.imaginary ;
		this.imaginary = this.real*c.imaginary + this.imaginary*c.real;
		this.real = tempReal;
	}
	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
		int newReal = c1.real + c2.real;
		int newImag = c1.imaginary + c2.imaginary;
		ComplexNumber c4 = new ComplexNumber(newReal,newImag);
		return c4;
	}
}
