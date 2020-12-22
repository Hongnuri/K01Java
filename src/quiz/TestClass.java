package quiz;

import java.util.Random;

public class TestClass {

	public static void main(String[] args) {

		Random rand = new Random();

		int[] randNum = new int[10];

		for(int i=0; i<randNum.length; i++) {
			randNum[i] = rand.nextInt(10)+1;
		}

		for(int i=0; i<randNum.length; i++) {
			for(int j=0; j<randNum.length; j++) {
				if(i != j) {
					if(randNum[i] == randNum[j]) {
						randNum[i] = rand.nextInt(10)+1;
						j = 0;
						i = 0;
					}
				}
			}
		}


		for(int i=0; i<randNum.length; i++) {
			System.out.println(randNum[i]);
		}
	}
}
