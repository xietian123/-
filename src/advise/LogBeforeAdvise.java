package advise;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * 前置通知
 * @author dell
 *
 */
public class LogBeforeAdvise implements MethodBeforeAdvice {
	public void before(Method method, Object[] arg1, Object arg2) throws Throwable {
		//日志（前当前时间）
		System.out.println("当前时间"+new Date().toString()+"调用啦"+method.getName());
		if(method.getName().equals("buy")) {
			//arg1[1]代表buy方法里第几个参数第一个写0第二个写1
			Double money=(Double)arg1[1];
			money=money*0.5;
			arg1[1]=money;
		}                                                         
	}
}
