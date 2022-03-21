package tratamento_de_error_e_excecoes;

import java.util.ArrayList;

public class TestCollections {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			nums.add(i + 1);
		}
		for (Integer num : nums) {
			System.out.println(num);
		}
	}
}
