package chapter04;

public class Java25_Object {
	public static void main(String[] args) {
		//BEAN 規範
		//用於編寫邏輯
		//建立數據模型 BEAN
		//TODO BEAN 規範
		//1.類要有無參數建構子 公共
		//2.屬性私有化(private)然後提供 公共的 set get
		User25 user = new User25();
		user.setAccount("五");
		user.setPassword("條");
		System.out.println(login(user));
	}
	public static boolean login(User25 user) {
		if(user.getAccount().equals("五") && user.getPassword().equals("條")){
			return true;
		}else {
			return false;
		}
	}
}
class User25 {
	private String account;
	private String password;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
