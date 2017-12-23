package luuhieuServer;

import java.util.Arrays;
import java.util.Random;

public class MainServer {

	static final int ItemsLength = 15;

	static int[][] HitRule;
	static int[] ItemsT = new int[] { 3, 3, 3, 9, 9, 8, 1, 3, 5, 6, 1, 4, 7, 7, 7 };

	public static void main(String[] args) {
		// Subject sub = new Subject();
		// HexaObserver hex = new HexaObserver(sub);
		// new OctalObserver(sub);
		// new BinaryObserver(sub);
		//
		// System.out.print(" First : " + "\n");
		// sub.setState(15);
		// System.out.print("\n" +" Second : "+ "\n");
		// sub.notify(hex);
		//
		Init();
		RandomItemsReponse();
		
	}

	public static void RandomItemsReponse() {
		int[] Items = new int[ItemsLength];
		for (int j = 0; j < Items.length; j++) {
			Items[j] = randInt(1, 9);
		}
		int[] a = CalculateHitSet(Items);
		System.out.println("Items : " + Arrays.toString(Items));
		System.out.println("HitRule L : " + Arrays.toString(a));
	}

	public static int randInt(int min, int max) {

		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	// add element
	public static int[] Add(int[] array, int value) {
		int newLength = array.length + 1;
		int[] result = new int[newLength];
		for (int i = 0; i < array.length; i++) {
			result[i] = array[i];
			result[newLength - 1] = value;
		}
		return result;
	}

	// remove lement
	public static int[] RemoveElement(int[] array, int index) {
		int newlength = array.length - 1;
		if (newlength < 1) {
			return array;
		}
		int result[] = new int[newlength];
		int newCounter = 0;
		for (int i = 0; i < array.length; i++) {
			if (i == index) {
				continue;
			}
			result[newCounter] = array[i];
			newCounter++;
		}
		return result;
	}

	public static int[] CalculateHitSet(int[] Items) {
		int[] HitSet = new int[1];
		int j = 0;
		for (int i = 0; i < HitRule.length; i++) {
				if (Items[HitRule[i][j]] == Items[HitRule[i][j + 1]]
						&& Items[HitRule[i][j + 1]] == Items[HitRule[i][j + 2]]) {
					HitSet = Add(HitSet, i+1);	
				}
				j = HitRule[i].length - 1;
				if (Items[HitRule[i][j]] == Items[HitRule[i][j - 1]]
						&& Items[HitRule[i][j - 1]] == Items[HitRule[i][j - 2]]) {
					HitSet=Add(HitSet, i+1);
				}
				j= 0;
		}
		HitSet = RemoveElement(HitSet,0);
		return HitSet;
	}

	public static void Init() {
		HitRule = new int[9][];
		HitRule[0] = new int[] { 5, 6, 7, 8, 9 };
		HitRule[1] = new int[] { 0, 1, 2, 3, 4  };
		HitRule[2] = new int[] { 10, 11, 12, 13, 14 };
		HitRule[3] = new int[] { 0, 6, 12, 8, 4 };
		HitRule[4] = new int[] { 10, 6, 2, 8, 14 };
		HitRule[5] = new int[] { 0, 1, 7, 3, 4 };
		HitRule[6] = new int[] { 10, 11, 7, 13, 14 };
		HitRule[7] = new int[] { 5, 1, 2, 3, 9 };
		HitRule[8] = new int[] { 5, 11, 12, 13, 9 };
	}

}
