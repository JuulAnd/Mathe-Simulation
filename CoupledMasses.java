package app;

public class CoupledMasses {

	public int m1; // Masse eins
	public int m2; // Masse zwei
	public int lo; // Gleichgewichtsabstand
	public int D; // Federkonstante
	public int x1null; // Massenmittelpunkt Masse eins zum Zeitpunkt t0
	public int x2null; // Massenmittelpunkt Masse zwei zum Zeitpunkt t0
	public int v1null; // Anfangsgeschwindigkeit Masse eins
	public int v2null; // Anfangsgeschwindigkeit Masse zwei
	public int mü; // Reduzierte Masse
	public static int fensterBreite = 900;
	public static int fensterHöhe = 700;
	private double xSchwerpunktNull ;
	private double vSchwerpunkt ;

	public CoupledMasses(int m1, int m2, int lo, int D, int x1null, int x2null, int v1null, int v2null) {
		this.m1 = m1;
		this.m2 = m2;
		this.lo = lo;
		this.D = D;
		this.x1null = x1null;
		this.x2null = x2null;
		this.v1null = v1null;
		this.v2null = v2null;
		
		xSchwerpunktNull = (m1*x1null + m2 * x2null)/ (m1 + m2);
		vSchwerpunkt = (m1*v1null + m2 * v2null)/ (m1 + m2);

	}

	/*public int gleichgewichtsAbstand() {
		lo = (x2null - x1null);
		return lo;
	}*/

	public int schwerpunktPosition(int x, double t) { // Zeitpunkt t? Mit Hilfe einer SChleife verändern? Aus Grafik
														// berechnen?
		return x;
	}
	
	double schwerpunktLage (double t) {
		double result;
		result  = xSchwerpunktNull + vSchwerpunkt * t;
		
		return result;
	}

	public int reduzierteMasse() {
		mü = (m1 * m2) / (m1 + m2);
		return mü;
	}

	public double amplitudeA() {
		double a = x2null - x1null - lo;
		return a;

	}

	public double amplitudeB() {
		double b = Math.sqrt(mü / D) * (v2null - v1null - lo);
		return b;
	}
}
