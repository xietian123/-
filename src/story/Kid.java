package story;

import java.io.Serializable;
/**
 * С����
 * @author dell
 *
 */
public class Kid implements Serializable { 
	/**
	 * ��ʲô��ͷ����ʲô��ͷ
	 */
	 private fuTou fuTou;
	 /**
	  * Сƨ������
	  */
	 private String name;

	public void setName(String name) {
		this.name = name;
	}
	public void setFuTou(fuTou fuTou) {
		this.fuTou = fuTou;
	}
	/**
	 * ��ʲô���ͽ�ʲô��
	 * @param object����
	 */
	public void kan(String object) {
		System.out.println("����С����"+name);
		this.fuTou.kan(object);
	}
}
