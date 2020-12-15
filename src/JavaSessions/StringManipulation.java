package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {
		
		String s = "I love my family very much";
		String h = "I love my family Very much";
		System.out.println(s.length()); // 16 number of characters including space.
		System.out.println(s.charAt(5));// e
		System.out.println(s.charAt(0));// I the first character
		System.out.println(s.indexOf('M'));// -1 as M is not available"String index out of bound exception"
		System.out.println(s.indexOf('m'));// 8...... first occurrence of m
		System.out.println(s.indexOf('m', s.indexOf('m')+1));// 12....... second occurrence of m
		System.out.println(s.indexOf('m', s.indexOf('m')+6)); // 22........third occurrence of m
		System.out.println(s.indexOf("my"));//....7.... index of a string...
       // String comparison
		System.out.println(s.equals(h));// ...false b/c of Very which is capital in the second string h....
        System.out.println(s.equalsIgnoreCase(h));// true b/c of equalsIgnoreCase....
        if(s.equalsIgnoreCase(h)) {System.out.println("Perfect comparison");}
        // substring
        System.out.println(s.substring(0, 6));// returns only ....I love.... from all the string...
        
        //trim
        
       String f = "   Hello World   ";
       System.out.println(f.trim());// trim cuts only white spaces in the corner..i.e beginning and ending not the middle.
       System.out.println(f.replace(" ", ""));// the white spaces between hello and world is gone ...HelloWorld
       //replace
       String date = "06/08/1983";
       System.out.println(date.replace("/", "-"));
       
       String s2= "ethiopia hagere";
       System.out.println(s2.toUpperCase()); // changes to uppercase
       
       String s3 = "EYOB ADINEW BIZUNEH";
       System.out.println(s3.toLowerCase()); // changes to lowercase
       
       //split....usually used in selenium for registration page test...example
       String h1 = "Peter;john;35;male;california;USA";
       String [] h2 = h1.split(";");
       for(String h3 :h2) {
    	   System.out.println(h3);
       }
    		   
       
       String k = "Hello_Ethiopia_Beautiful_Country";
    	String[] l = k.split("_");	
       for(String j :l) {
    	   System.out.println(j);
       }
       
       String language = "Java; Javascript;Python;Ruby"; 
       String lang[] = language.split(";");
       System.out.println(lang[0]);
       System.out.println(lang[3]);
       for(int o=0;o<lang.length;o++) {
    	   System.out.println(lang[o]);
       }
    	// famous interview question
       String test = "xXtestingxXXSeleniumXxXCucumber";
       String[] tester = test.split("xX");
      
       System.out.println("0Th value---" +tester[0]); // blank because split starts from the value before xX spliting elet
       System.out.println("1st value---" +tester[1]);
       System.out.println("2nd value---" +tester[2]);
       System.out.println("3rd value---" +tester[3]);
       // concatenation
       String r = "Hello";
       String t = " World";
       int x = 200;
       int y = 400;
       System.out.println(r+t);
       System.out.println(r+t+x+y);
       System.out.println(r+t+(x+y));
       System.out.println(r.concat(t)); // r concatenate with t
       
       // contains returning boolean true or false
       System.out.println(k.contains("Ethiopia"));// true .....boolean value
       
       // converting string to integer
       String p = "3000";
       int w = 5000;
       
       int w2 = Integer.parseInt(p);
       System.out.println(w2);
       System.out.println(w2+w);
	}

}
