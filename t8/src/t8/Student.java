package t8;

public class Student implements Cloneable{
	private String nume;
	private String prenume;
	private Masina masina;
	
	public Student() {
		this.nume="necunoscut";
		this.prenume="necunoscut";
		this.masina=new Masina();
	}
	
	public Student(String nume, String prenume, Masina masina) {
		this.nume=nume;
		this.prenume=prenume;
		this.masina=masina;
	}
	
	public String toString() {
		return "Studentul/a " + nume + " " + prenume + " are " + masina.toString();
	}
	
	protected Object shallowClone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }
	
	protected Object deepClone() throws CloneNotSupportedException {
        Student cloned=(Student)super.clone();
        cloned.setMasina((Masina)cloned.getMasina().clone());
        return cloned;
    }

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public Masina getMasina() {
		return masina;
	}

	public void setMasina(Masina masina) {
		this.masina = masina;
	}

}
