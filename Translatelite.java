import java.util.Scanner;

public class Translatelite {

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		String bytelandian = scn.nextLine();
		String english = "abcdefghijklmnopqrstuvwxyz";
		while(t>0){
		    String sentence = scn.nextLine();
		    String output = "";
		    for(int i=0;i<sentence.length();i++){
		        char ch = sentence.charAt(i);
		        int idx;
		        if(ch>='a' && ch<='z'){
		            idx = english.indexOf(ch);
		            output += bytelandian.charAt(idx+1);    
		        }
		        else if(ch>='A' && ch<='Z'){
		            idx = english.indexOf(Character.toLowerCase(ch));
		            output += Character.toUpperCase(bytelandian.charAt(idx+1));
		        }
		        else if(ch=='_'){
		            output+=" ";
		        }
		        else{
		            output += ch;
		        }
		    }
		    System.out.println(output);
		    t--;
		}
        scn.close();
		
	}
}

