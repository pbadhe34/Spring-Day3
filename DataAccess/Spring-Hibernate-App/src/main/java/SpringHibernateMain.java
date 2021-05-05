 

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.server.Person;
import com.server.PersonDAO;

 

public class SpringHibernateMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-hibernate-config.xml");
		
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		
		Person person = new Person();
		person.setName("Viju"); 
		person.setCountry("India");
		
		personDAO.savePerson(person);
		
		System.out.println("Person::"+person);
		
		List<Person> list = personDAO.listPersons();
		
		for(Person p : list){
			System.out.println("Person List::"+p);
		}
		
		context.close();
		
	}

}
