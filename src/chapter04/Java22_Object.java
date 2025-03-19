package chapter04;

public class Java22_Object {
	public static void main(String[] args) {
		//TODO interface
		//接口可以理解成規則
		//語法 interface 接口名 {規則屬性 規則行為}
		//接口本身也是抽象的
		//規則屬性要是固定的
		//屬性和 行為訪問要是public
		//屬性要是靜態的
		//行為是抽象的
		//接口 不等於類
		//接口可以繼承其他接口
		//類的物件要遵循其類的接口
		Computer computer = new Computer();
		Light light = new Light();
		Light light1 = new Light();
		computer.usb1 = light;//屬性指向light 物件 可以使用 light的方法。
		computer.usb2 = light1;
		computer.powerSupply();

	}
}
interface USBInterface {

}
interface UsbSupply extends USBInterface {
public void powerSupply();
}
interface UsbReceive extends USBInterface {
public void powerReceive();

}
class  Computer implements UsbSupply{
		public UsbReceive usb1;
		public UsbReceive usb2;
	public void powerSupply() {
		System.out.println("Computer powerSupply");
		usb1.powerReceive();
		usb2.powerReceive();
	}
}

class Light implements UsbReceive{
	public void powerReceive() {
		System.out.println("Light powerReceive");
	}
}