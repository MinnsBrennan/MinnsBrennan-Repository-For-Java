package uk.ac.uos.i2p;

public class SimpleMath {
	
	public int square(int x) {
		return x * x;
	}
	
	public int countA(String word) {
		int count = 0;
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i)=='a' || word.charAt(i)=='A') {
				count++;
			}
		}
		return count;
	}
}