package advise;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * ����֪ͨ
 * @author dell
 *
 */
public class LogAfterAdvise implements AfterReturningAdvice{
	/**
	 * ��������(1.�����ڵ��Ǹ�����2.���������������Ĳ���3.���������)
	 */
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("����ִ�����");
		
	}



}
