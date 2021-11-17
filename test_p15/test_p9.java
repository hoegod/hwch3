package hw_ch3;



public class test_p9 {

	public static void main(String[] args) {
Car car1;
car1 = new Car();
int number= 1234;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
double gasoline =20.5;
car1.setNumGas(number, gasoline);


	}

}


class Car{
	int num;
	double gas;
	
void setNumGas(int n, double g)
{
	num = n;
	gas = g;
	System.out.println("將車號設為"+num +",將汽油設為"+gas);
}
void setGas(double g) {
	System.out.println("車號是"+gas);

	System.out.println("將汽油量是"+gas);
}
}