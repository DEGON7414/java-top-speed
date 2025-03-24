package chapter06;

public class Java08_Exception {
    public static void main(String[] args) throws Exception{
        //TODO 自定義異常
//        String account = "JOJO";
//        String password = "OLAOLAOLA";
        String account = "admin";
        String password = "admin";
        try {
            login(account,password);
        }catch (AccountException accountException){
            System.out.println("帳號不正確");
        }catch (PasswordException passwordException){
            System.out.println("密碼不正確，需要修正");
        }catch (LoginException loginException){
            System.out.println("其他錯誤");
        }
    }

    public static void login(String account, String password) throws PasswordException, AccountException {
        if (!"admin".equals(account)) {
            throw new AccountException("account not correct");
        }
        if (!"admin".equals(password)) {
            throw new PasswordException("password not correct");
        }
        else {
            System.out.println("登入成功");
        }
    }
}

class LoginException extends Exception {
    public LoginException(String msg) {
        super(msg);
    }
}

class AccountException extends LoginException {
    public AccountException(String msg) {
        super(msg);
        //super(msg) 是用來初始化父類別（LoginException）的建構子
        // 使其能夠接收並儲存錯誤訊息。
        // 無論是 AccountException 還是 PasswordException，都可以擁有父類別的錯誤訊息處理機制。
    }
}
    class PasswordException extends LoginException {
        public PasswordException(String msg) {
            super(msg);
        }
    }