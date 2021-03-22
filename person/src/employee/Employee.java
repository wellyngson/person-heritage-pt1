package employee;
import person.Person;

public class Employee extends Person {
	
	// ATRIBUTOS
	private String sector;
	private boolean working;

	
	// MÉTODO PARA MUDAR DE TRABALHO
	public void changeJobs() {
		this.setWorking(!this.getWorking());
		System.out.println( "-------------------------" + "\n" +
			               	"Você mudou de trabalho");
	}

	
	// MÉTODOS ESPECIAIS GETTERS E SETTERS
	public String getSector() {
		return sector;
	}


	public void setSector(String sector) {
		this.sector = sector;
	}


	public boolean getWorking() {
		return working;
	}


	public void setWorking(boolean working) {
		this.working = working;
	}	
}

