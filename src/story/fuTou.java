package story;

import java.io.Serializable;
/**
 * 斧头类
 * @author dell
 *
 */
public abstract class fuTou implements Serializable {
	/**
	 * 斧头砍东西的要有个方法(抽象方法没有准确的值)
	 * @param object东西(可以是木头，金银)
	 */
	public abstract  void kan(String object);

}
