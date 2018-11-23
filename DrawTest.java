package app;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class DrawTest extends JFrame {

	public static void main(String[] args) {
		CoupledMasses cm = new CoupledMasses(5, 5, 1, 5, 10, 1, 5, 8);  // int m1, int m2, /*int lo,*/ int D, int
																				// x1null, int x2null, int v1null, int
																				// v2null)
		
		cm.reduzierteMasse();
		cm.amplitudeA();
		cm.amplitudeB();

		System.out.println("lo= " + cm.lo);
		System.out.println("mü= " + cm.reduzierteMasse());
		System.out.println("A= " + cm.amplitudeA());
		System.out.println("B= " + cm.amplitudeB());
		System.out.println("Schwerpunkt Geschwindigkeit " + m1.vSchwerpunkt);
		System.out.println(m1.xSchwerpunktkNull);
	}
	

}
