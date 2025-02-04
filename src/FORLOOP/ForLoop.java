package FORLOOP;

public class ForLoop {

	public static void main(String[] args) {
		String str = "Sweety",rev="";
		for(int i = str.length()-1; i>=0; i--) {
			
			char ch=str.charAt(i);
			rev=rev+ch;
			
		}
		System.out.println("rev str is :"+ rev);
		
		// TODO Auto-generated method stub

	}

}
