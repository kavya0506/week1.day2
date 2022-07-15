package week1.day2;

public class ChangeOddIndexToUpperIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "changeme";
		char[] chr = str.toCharArray();
		int length = chr.length;
		
		System.out.println("Odd index are: ");
		for(int i = 0; i<length; i++)
		{
			if(i%2!=0)
			{
				chr[i] = Character.toUpperCase(chr[i]);
				System.out.println("chr["+i+"] = "+chr[i]);
			}
	}

}
}

