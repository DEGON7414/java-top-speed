package chapter06;

public class Java08_Exception {
    public static void main(String[] args) throws Exception {
        //TODO 自定義異常
        String account = "JOJO";
        String password = "OLAOLAOLA";
//        String account = "admin";
//        String password = "admin";
        try {
            login(account, password);
        } catch (AccountException accountException) {
            System.out.println(accountException.getMessage());
//            System.out.println("帳號不正確");
        } catch (PasswordException passwordException) {
            System.out.println(passwordException.getMessage());
//            System.out.println("密碼不正確，需要修正");
        } catch (LoginException loginException) {
            System.out.println("登入失敗");
        }
    }

    public static void login(String account, String password) throws LoginException {
        if (!"admin".equals(account)) {
            //丟一個AccountException物件 給方法呼叫者
            throw new AccountException("account not correct");
        }
        if (!"admin".equals(password)) {
            throw new PasswordException("password not correct");
        } else {
            System.out.println("登入成功");
        }
    }
}

//1.繼承異常父類 可以繼承Exception 或runtimeException
//Exception checkedException 重大錯誤 編譯一定要去做處理
//runtimeException 編譯不會要求一定要做處理
//為甚麼還需要 自定義runtimeException
//使用者
class LoginException extends Exception {
    public LoginException(String msg) {
        //2.裡面一定要super 呼叫父類建構子
        super(msg);
    }
}

// 無論是 AccountException 還是 PasswordException，都可以擁有父類別的錯誤訊息處理機制。
class AccountException extends LoginException {
    public AccountException(String msg) {
        super(msg);

    }
}

class PasswordException extends LoginException {
    public PasswordException(String msg) {
        super(msg);
    }
}