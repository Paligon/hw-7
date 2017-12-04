package Utils;
public class ArrayUtils {
	public static int[] reverse(int[] array) {
		int a = 0;
		int b;
		for(; a < array.length/2; a++) {
			b = array.length - 1 - a;
			int hp = array[a];
			array[a] = array[b];
			array[b] = hp;
		}
		return array;
	}
	
	public static String stringifyArray(int[] arr) {
		int i = 0;
		String comma = ", ";
		String j = "";
		for(; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(j);
			}
			System.out.print(arr[i] + comma);
		}
		return j;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		System.out.println(reverse(arr));
		System.out.println(stringifyArray(arr));
	}
}