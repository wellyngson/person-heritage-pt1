package main;
import employee.Employee;
import person.Person;
import student.Student;
import teacher.Teacher;

public class Main {

	public static void main(String[] args) {
		
		// CRIANDO OS 4 TIPOS DE PESSOAS
		Person person = new Person();
		Student student = new Student();
		Teacher teacher = new Teacher();
		Employee employee = new Employee();
		
		
		// INSERINDO O ATRIBUTO NOME AOS OBJETOS
		person.setName("Pedro");
		student.setName("Maria");
		teacher.setName("Cláudio");
		employee.setName("Fabiana");
		

		// INSERINDO O SEXO AOS OBJETOS
		person.setSex("Masculino");
		student.setSex("Feminino");
		teacher.setSex("Masculino");
		employee.setSex("Feminino");
		
		// INSERINDO A IDADE AOS OBJETOS
		person.setYears(20);
		student.setYears(19);
		teacher.setYears(25);
		employee.setYears(22);

		// IMPRIMINDO OS OBJETOS
		System.out.println( person.toString() + "\n" +
							"-------------------------" + "\n" + 
							student.toString() + "\n" +
							"-------------------------" + "\n" +
							teacher.toString() + "\n" + 
							"-------------------------" + "\n" +
							employee.toString());
		
		// APLICANDO OS MÉTODOS AS CLASSES
		student.cancelRegistration();
		teacher.increaseSalary(520.2f);
		employee.changeJobs();
		
	}
	
}
