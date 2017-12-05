package controller;

public class TriangleStatus {

	public boolean isTriangle(double a, double b, double c) {
		if (a + b > c && a + c > b && b + c > a) {
		return true;
		}
		else return false;
	}
	
	public String isObtuse(double a, double b, double c) {
		if ((Math.pow(a,2) + Math.pow(b,2) < Math.pow(c,2)) || (Math.pow(a,2) + Math.pow(c,2) < Math.pow(b,2)) || (Math.pow(c,2) + Math.pow(b,2) < Math.pow(a,2))) {
			return "Tupougolniy";
		}
		else return "Ne tupougolniy";
	}

}
