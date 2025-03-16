package chapter04;

public class Java02_Object {

	public static void main(String[] args) {
		//TODO 物件導向
		//類別 動物
		//物件 狗 貓
		Animal a1 = new Animal();
		a1.type = "DOG";
		a1.name ="BLACK";
		a1.run();
		Animal a2 = new Animal();
		a2.type = "CAT";
		a2.name ="WHITE";
		a2.run();

}
}
class Animal{
	String type;
	String name;
	void run() {
		System.out.println(type+" "+name +" runaway");
	}
}