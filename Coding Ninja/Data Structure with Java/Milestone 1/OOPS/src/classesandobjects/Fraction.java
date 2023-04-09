package classesandobjects;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	
	public void setNumerator(int num) {
		if(num==0) {
			return;
		}
		this.numerator = num;
	}
	public int getNumerator() {
		return numerator;
	}
	public void setDenominator(int num) {
		if(num==0) {
			return;
		}
		this.denominator = num;
	}
	public int getDenominator() {
		return denominator;
	}
	
	public void increment() {
		numerator = numerator + denominator;
		simplify();
	}
	
	public void print() {
		System.out.println(numerator + "/" + denominator);
	}
	private void simplify() {
		int gcd = 1;           //hcf
		int smaller = Math.max(numerator, denominator);
		for(int i=2;i<=smaller;i++) {
			if(numerator % i==0 && denominator % i==0) {
				gcd = i;
			}
		}
		numerator = numerator/gcd;
		denominator = denominator/gcd;
	}
	
	public void add(Fraction f) {
		this.numerator = this.numerator * f.denominator + this.denominator * f.numerator;
		this.denominator = this.denominator * f.denominator;
		simplify();
	}
	
	public static Fraction add(Fraction f1, Fraction f2) {
		int newNemo = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
		int newDemo = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction(newNemo,newDemo);
		return f3;
	}
	
	public void subtract(Fraction f) {
		this.numerator = this.numerator * f.denominator - this.denominator * f.numerator;
		this.denominator = this.denominator * f.denominator;
		simplify();
	}
	
	public void multiply(Fraction f) {
		this.numerator = this.numerator * f.numerator;
		this.denominator = this.denominator * f.denominator;
		simplify();
	}
}
