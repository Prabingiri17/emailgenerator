package com.emailUtil;

public class Function {
	public static void alphabetChecker(String s) {
		String checkedString="";
		int length = s.length();
		// Creating an array of given string
		char[] ch =s.toCharArray()	;
		for(int i=0;i<length;i++) {
			
			//if first character of a word is found
			if(i==0 && ch[i]!=' '|| ch[i]!=' ' && ch[i-1]==' ') {
				// if it is in lower case
				if(ch[i]>'a' && ch[i]<'z') {
					//convert into upper case
					ch[i]=(char)(ch[i]-'a'+'A');
				}
			}
			//If apart from first letter anyone is in uppercase
			else if(ch[i]>='A' && ch[i]<='Z') {
				ch[i] = (char)(ch[i]+'a'-'A');
			}
			// converting these character to strings
			checkedString = new String(ch);
		}
		;
		
	System.out.println("New Employee: " + checkedString +"\n Generating ID:\n");
		

	}

}
