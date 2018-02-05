
public class p4_3 {
	public static void main(String[] args) {
		int[] counts = null;
		float[] height = { 171.3F, 175.0F };
		System.out.println(counts[1]);
		  //NullPointerException[このとき、countsはどこも参照していない]
		System.out.println(height[2]);
		  //ArrayIndexOutOfBoundsException[配列の２番目は存在しない]
	}
}
