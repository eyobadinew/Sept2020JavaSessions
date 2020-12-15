package JavaSessions;

public class StringManipulationHW {

	public static void main(String[] args) {
	//1.Write a program to check two different strings equality.
String a = "Eyob";
String b = "eyob";
System.out.println(a.equals(b));  // false
System.out.println(a.equalsIgnoreCase(b)); // true
	
	//2. Remove all  spaces in a String . 
//For example  : “         Hello      Everyone       “ .     Expected result: “HelloEveryone”.
String c = "         Hello      Everyone       ";
System.out.println(c.trim());
System.out.println(c.replace(" ", ""));
	//3. Write a program that will  print out the last character and first character of a word.
	String d = "Mariamawit";
	System.out.println(d.charAt(0)+""+d.charAt(9));
	//4. Write a program to verify a word or a character contained in the sentence.
	System.out.println(d.contains("m")); // true
	System.out.println(d.contains("b")); // false
	//5.Write a function/ method to reverse your own name.
	String e = "Eyob";
	StringBuilder f = new StringBuilder();
	 f.append(e);
	 f = f.reverse(); 
	System.out.println(f);
	//6. Write a program that gives you the last half of the string.
	String g = "eyobadinew";
	System.out.println(g.substring(0, g.length()/2));
	//7.Write a program to get the 3rd  “ e “ of the string .
	 //For example: “Welcome to Naveen Automation Labs ! “.
   String h = "Welcome to Naveen Automation Labs ! ";	
   System.out.println(h.indexOf('e',h.indexOf('e')+6 ));
	//8.Write a method which gives an index of (-1) if string is not available. . 
   //it should return integer. if String is present, then it should return the specific index.
	if(h.indexOf('e')==h.indexOf(0, h.length())) {
   System.out.println(h.indexOf('e'));
   }
	else {System.out.println("error");}
   //9.Write a program that breaks a whole string into small strings, 
	//and prints out its all values . (Hint: split, loop) .
   String i = "I_am_enjoying_my_authomation_journey";
   String j[] = i.split("_");
   for(String k:j) {System.out.println(k);}
   System.out.println(j[0]);
   System.out.println(j.length);
   //10.Assume that a string consists of 3 words, print out the middle one. 
  // String  l = "Quality Assurance Engineering";
   
   //11.get only numeric part from this String:
 //  String s = "your transaction id is: 12345 and reference id is 34567";
/*   Pattern p = Pattern.compile("\\d+");
   Matcher m = p.matcher("your transaction id is: 12345 and reference id is 34567");
   while(m.find()) {
       System.out.println(m.group());*/

	}

}
