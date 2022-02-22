
import java.io.*;
public class pat {
	public static void main(String[] args)
	{
		int number = 7;
		int i = number, j;
		while (i > 0) {
			j = 0;
			while (j++ < number - i) {
				System.out.print(" ");
			}
			j = 0;
			while (j++ < (i * 2) - 1) {
				System.out.print("*");
			}
			System.out.println();
			i--;
		}
	}
}
