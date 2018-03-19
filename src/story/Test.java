package story;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("story/fouTouBen.xml");
		Kid kid=(Kid) applicationContext.getBean("ming");
		kid.kan("שͷ");

	}

}
