package hw_ch3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class test_p40 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請輸入字串");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		System.out.println("請輸入文字");
		String str2 = br.readLine();
		StringBuffer sb = new StringBuffer(str1);
		sb.append(str2);
		System.out.println("在「"+str1+"」後增加「"+str2+"」就是「"+sb+"」");

	}

}
