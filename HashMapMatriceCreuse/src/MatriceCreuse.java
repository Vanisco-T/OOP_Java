import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MatriceCreuse {

	private static class XY {
		private int x;
		private int y;
		public XY(int x, int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public boolean equals(Object o) {if (this == o)
			return true;
		if (o == null || !(o instanceof XY))
			return false;
		else {
			XY xy = (XY) o;
			return (x == xy.x && y == xy.y);
		}
		}
		@Override
		public int hashCode() { // nécessaire pour être dans une HashMap
			return (x * 101) ^ y; // par exemple
		}
		@Override
		public String toString()
		{
			return "[" + this.x + "," + this.y + "] ";
		}
	}

	private int hauteur;
	private int largeur;
	private Map<XY,Integer> elements;

	MatriceCreuse(int h,int l){
		this.hauteur=h;
		this.largeur=l;
		this.elements = new HashMap<XY,Integer>();
		Random r = new Random();
		for(int i=0;i<largeur;i++) {
			for(int j=0;j<hauteur;j++) {
				if(i==0) {
					XY xy = new XY(i,j);
					elements.put(xy, r.nextInt(10)+1);
				}
				
			}
		}
	}
	
}
