package hw_ch3;



public class test_p9 {

	public static void main(String[] args) {
Car car1;
car1 = new Car();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
car1.show();

Car car2;
car2 = new Car(1234,25.0);
car2.show();
	}

}


class Car{
	private int num;
	private double gas;
	
public Car() {
	num = 0;
	gas = 0.0;
	System.out.println("生產了車子");
}

public Car(int n, double g) {
	num = n;
	gas = g;
	System.out.println("生產了車子"+num+",汽車量為"+gas+"的車子");
}
void show()
{
	System.out.println("車號是"+this.num);
	System.out.println("汽油量是"+this.gas);
}

}