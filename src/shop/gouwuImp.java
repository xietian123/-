package shop;

/**
 * 业务包
 * @author dell
 *
 */
public class gouwuImp implements gouwu{

	@Override
	public void buy(String name, Double money) {
	System.out.println("顾客花了"+money+"块钱，买啦一件"+name);
		
	}

	@Override
	public void tui(String name) {
		System.out.println("买的这件"+name+"质量真不行，破东西，才两天，色儿就掉没啦！");
		
	}

}
