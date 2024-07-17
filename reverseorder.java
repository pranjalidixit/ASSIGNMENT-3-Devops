

class reverseorder {
	public static void main (String[] args) {
	
		String str= "Hello!", str1="";
		char ch;
	
	System.out.print("Original word: ");
	System.out.println("Hello!"); 
	
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); 
		str1= ch+str1; 
	}
	System.out.println("Reversed word: "+ str1);
	}
}



