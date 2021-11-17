package hw_ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test_34 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
System.out.println("請輸入一個整數");
BufferedReader b1 = 
new BufferedReader(new InputStreamReader(System.in));
String st1 = b1.readLine();
int num = Integer.parseInt(st1);
System.out.println("你輸入的數字是:"+num);
	}

}
