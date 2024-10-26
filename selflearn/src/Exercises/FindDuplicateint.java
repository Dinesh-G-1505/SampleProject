package Exercises;

public class FindDuplicateint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] in ={12, 13, 14, 15, 15, 12, 11};

		for(int i=0; i<=in.length-1; i++)
			{
				if (in[i]==in[i+1])
					{
						System.out.println(in[i]);
					}
			}

	}

}
