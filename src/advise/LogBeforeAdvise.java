package advise;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * ǰ��֪ͨ
 * @author dell
 *
 */
public class LogBeforeAdvise implements MethodBeforeAdvice {
	public void before(Method method, Object[] arg1, Object arg2) throws Throwable {
		//��־��ǰ��ǰʱ�䣩
		System.out.println("��ǰʱ��"+new Date().toString()+"������"+method.getName());
		if(method.getName().equals("buy")) {
			//arg1[1]����buy������ڼ���������һ��д0�ڶ���д1
			Double money=(Double)arg1[1];
			money=money*0.5;
			arg1[1]=money;
		}                                                         
	}
}
