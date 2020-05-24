import Flore.Vegetal;

public class Emplacement {

	private Vegetal vegetal;
	
	public Vegetal getVeg() {
		return vegetal;
	}
	
	public Emplacement(Vegetal vegetal) {
		this.vegetal = vegetal;
	}
	
	@Override
	public String toString() {
		return vegetal.toString();
	}
	
}

