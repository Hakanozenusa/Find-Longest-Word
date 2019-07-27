package inRhtym;

public class LargestWord {

	public static void main(String[] args) {
		
		String str="The cow jumped over the moon.";
		
		String[] s=str.split(" ");
		
		String longest=" ";
		for(String s1:s)
			{
			
			
	 if(s1.length()>longest.length())
			{
				longest=s1;
				
			}
			}
		
		System.out.println("longest word ="+longest);
	}
	

	
	}


	
	
	
	
		
		
		
		
		

	

