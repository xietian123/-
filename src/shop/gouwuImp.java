package shop;

/**
 * ҵ���
 * @author dell
 *
 */
public class gouwuImp implements gouwu{

	@Override
	public void buy(String name, Double money) {
	System.out.println("�˿ͻ���"+money+"��Ǯ������һ��"+name);
		
	}

	@Override
	public void tui(String name) {
		System.out.println("������"+name+"�����治�У��ƶ����������죬ɫ���͵�û����");
		
	}

}
