package JavaSessions;

public class HomeWorkLoop {

	public static void main(String[] args) {
		
		
		/*1. WAP to print following output:
I am Batman

I am Batman

I am Batman

I am Batman

I am Batman*/

for(int i=1;i<=5;i++) {
	System.out.println("I am Batman");
}

int l=1;
while(l<=5) {
	System.out.println("I am Batman");
	l++;
}
int m = 1;
do {System.out.println("I am Batman");
	m++;
	}
while(m<=5);

System.out.println("-----------------");
//for loop
for(int n=1;n<=9;n++) {
	System.out.println("I am Batman "+n );
}
//while loop
int p=1;
while(p<=9) {
	System.out.println("I am Batman " +p);
	p++;
}
//do-while loop
int q =1;
do { System.out.println("I am Batman "+q);
q++;
	}
while(q<=9);

//WAP to print 10 to 1 using for, while and do-while loop
//for loop
for(int r=10;r>=1;r--) {
	System.out.println(r);}
//while loop
int s=10;
while(s>=1) {
	System.out.println(s);
	s--;
}
//do-while loop
int t=10;
do{System.out.println(t);
t--;}
	while (t>=1);

System.out.println("------------");

//Write a program in Java to print "Hello World" ten times using while loop
int k=1;
while(k<=10) {
	System.out.println("Hello World");
	k++;
}
//Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
for(int b=1;b<=10;b++) {
	System.out.println(b);
	if(b %7==0) {
		System.out.println("Quit as multiple of 7 is encountered ");
		break;
	}
	}


	}
}
