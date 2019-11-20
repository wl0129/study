package study.chap06_Exercise18;

public class ShopService {
	private static ShopService instance = new ShopService();
	private ShopService() {}
		 static ShopService getInstance() {
			return instance;
		}
	

}
