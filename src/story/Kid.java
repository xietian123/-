package story;

import java.io.Serializable;
/**
 * 小孩类
 * @author dell
 *
 */
public class Kid implements Serializable { 
	/**
	 * 给什么斧头就用什么斧头
	 */
	 private fuTou fuTou;
	 /**
	  * 小屁孩名字
	  */
	 private String name;

	public void setName(String name) {
		this.name = name;
	}
	public void setFuTou(fuTou fuTou) {
		this.fuTou = fuTou;
	}
	/**
	 * 给什么名就叫什么名
	 * @param object名字
	 */
	public void kan(String object) {
		System.out.println("我是小孩："+name);
		this.fuTou.kan(object);
	}
}
