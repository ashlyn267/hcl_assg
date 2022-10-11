package setter_injection;

import javax.xml.xpath.XPathException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext cac=new ClassPathXmlApplicationContext("setter_injection.xml");
		
		Teacher teacher=(Teacher)cac.getBean("t1");
		System.out.println(teacher.getId());
		System.out.println(teacher.getName());
		System.out.println(teacher.getSub());

	}

}
