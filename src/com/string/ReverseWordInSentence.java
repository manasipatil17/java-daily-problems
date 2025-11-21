package com.string;

public class ReverseWordInSentence {
public static void main(String[] args) {
	String s= "Java is fun";
    // String [] a=s.split(" ");
     String word="";
     char[] c= s.toCharArray();
     
     for(int i=c.length-1;i>=0;i--) {
    	 if(c[i]!=' ') {
    		 word+=c[i];
    	 }
    	 else if(c[i]==' '){
    		 for(int j=word.length()-1;j>=0;j--) {
    			 System.out.print(word.charAt(j));
    		 }
    		 word="";
    		 System.out.print(" ");
    	 }
     }
     if(word!=" "){
    	 for(int j=word.length()-1;j>=0;j--) {
			 System.out.print(word.charAt(j));
		 }
     }
//     for(int i=a.length-1;i>=0;i--) {
//    	 System.out.print(a[i]+" ");
//     }
	
}
}
