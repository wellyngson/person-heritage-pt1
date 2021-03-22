package student;
import person.Person;

public class Student extends Person{

	// ATRIBUTOS
	private int registration;
	private String course;
	
	// MÉTODO PARA CANCELAR O REGISTRO
	public void cancelRegistration() {
		System.out.println( "-------------------------" + "\n" +
							"Matrícula será cancelada");
	}
	
	// MÉTODOS ESPECIAIS GETTERS E SETTERS
	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
