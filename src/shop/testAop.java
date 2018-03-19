package shop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAop {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("shop/shopAop.xml");
		gouwu gouwu=(gouwu) context.getBean("biz");
		gouwu.buy("Æ¤´óÒÂ", 500.0);
	}

}
