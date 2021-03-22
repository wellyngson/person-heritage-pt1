package teacher;
import person.Person;

public class Teacher extends Person{

	// ATRIBUTOS
	private String specialty;
	private float wage;

	// MÉTODO PARA RECEBER AUMENTO
	public void increaseSalary(float increase) {
		this.setWage(this.getWage() + increase);
		System.out.println( "-------------------------" + "\n" +
			            	"Seu salário aumentou para R$ " + getWage());
	}
	
	// MÉTODOS ESPECIAIS GETTERS E SETTERS
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public float getWage() {
		return wage;
	}
	public void setWage(float wage) {
		this.wage = wage;
	}
	
}
