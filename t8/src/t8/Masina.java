package t8;

public class Masina implements Cloneable{
	private String marca;
	private String culoare;
	
	public Masina(String marca, String culoare) {
		this.marca=marca;
		this.culoare=culoare;
	}
	
	public Masina() {
		this.marca="necunoscut";
		this.culoare="necunoscut";
	}
	
	public void revopsire(String newColor) {
		this.culoare=newColor;
		System.out.println("Revopsire completa");
	}
	
	public String toString() {
		return "Masina marca " + marca + ", culoare " + culoare;
	}

	public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

}
