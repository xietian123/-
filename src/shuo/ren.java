package shuo;

import java.io.Serializable;

public class ren implements Serializable {
	private String name;
	private String say;
	public void setName(String name) {
		this.name = name;
	}
	public void setSay(String say) {
		this.say = say;
	}
	/**
	 * �ṩ����ķ���
	 */
	public void shuo() {
		
		System.out.println(name+"˵��"+say);
	}
}
