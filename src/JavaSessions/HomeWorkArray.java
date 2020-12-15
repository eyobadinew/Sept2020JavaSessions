package JavaSessions;

public class HomeWorkArray {

	public static void main(String[] args) {
		/*
		 Question 1: Write a program to print the following pattern using for loop:

00 01 02 03 04 05 06 07 08 09 
10 11 12 13 14 15 16 17 18 19 
20 21 22 23 24 25 26 27 28 29 
30 31 32 33 34 35 36 37 38 39 
		 
		String l[]= new String[40];
		l[0]= "00";
		l[1]= "01";
		l[2]= "02";
		l[3]= "03";
		l[4]= "04";
		l[5]= "05";
		l[6]= "06";
		l[7]= "07";
		l[8]= "08";
		l[9]= "09";
		l[10]= "10";
		l[11]= "11";
		l[12]= "12";
		l[13]= "13";
		l[14]= "14";
		l[15]= "15";
		l[16]= "16";
		l[17]= "17";
		l[18]= "18";
		l[19]= "19";
		l[20]= "20";
		l[21]= "21";
		l[22]= "22";
		l[23]= "23";
		l[24]= "24";
		l[25]= "25";
		l[26]= "26";
		l[27]= "27";
		l[28]= "28";
		l[29]= "29";
		l[30]= "30";
		l[31]= "31";
		l[32]= "32";
		l[33]= "33";
		l[34]= "34";
		l[35]= "35";
		l[36]= "36";
		l[37]= "37";
		l[38]= "38";
		l[39]= "39";
		
		for(int t=00; t<l.length;t++) {
			System.out.println(l[t]);
		}

		*/
		
	/*Question 2: Write a program to create a static Array, having following cricket data:
		--name, age, team name, DOB, gender, Strike Rate
		--Try to create multiple Object Arrays for different players 
		--Try to print all the values of each player on the console*/
		
				
		String t[] = new String[5];
	       t[0] = "Elor,22,liverpool, March 12, M,44.4";
	       t[1] = "Mariamawit,2,man united,February 17,F, 44.5";
	       t[2] = "Jerry,22,man united,May 17,F, 44.5";
	       t[3] = "Marry,32,united,December,M, 41.5";
	       t[4] = "Hiwi,33,warriors,September,F, 46.5";
	       
	       for (int a = 0; a < t.length; a++) {
	           System.out.println(t[a]);
		
	}
	       System.out.println("-----------");
	 
	       /*Question 3: Try to print the following pattern on the console:
n = 4
n = 3
n = 2
n = 1
n = 0
*/    
	int k[]= new int[5];
	k[0]= 0;
	k[1]= 1;
	k[2]= 2;
	k[3]= 3;
	k[4]= 4;
	
	for(int j=4;j<k.length;j--) {System.out.println("n = " +k[j]);
	}
	 
		}
	}

