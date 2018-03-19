package shuo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class shouTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("shuo/rensay.xml");
		ren ren=(shuo.ren) context.getBean("ww");
		ren.shuo();

	}

}
