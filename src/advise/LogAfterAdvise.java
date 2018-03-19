package advise;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * 后置通知
 * @author dell
 *
 */
public class LogAfterAdvise implements AfterReturningAdvice{
	/**
	 * 三个参数(1.你正在调那个方法2.调发方法传过来的参数3.被代理对象)
	 */
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("方法执行完毕");
		
	}



}
