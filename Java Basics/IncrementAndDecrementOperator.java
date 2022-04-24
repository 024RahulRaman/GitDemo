package JavaBasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i[] = new int[5];
		    i[0] =1;
		    i[1] =2;
		    i[2] =50;
		    i[3] =100;
            i[4] =600;
           
            System.out.println(i[4]);
	        System.out.println(i.length);
	        
for(int j=0 ; j<i.length; j++)
{
System.out.println(i[j]);}


double d[]= new double[4];
d[0]=12.44;
d[1]=22.22;
d[2]=44.21;
d[3]=55.55;
System.out.println(d[0]);

	
char c[] = new char[3];
	c[0] = '1';
	c[1] = '$';
	c[2]= '4';

	System.out.println(c[1]);
	
	boolean b[] = new boolean[2];
	b[0] = false;
	b[1] = true;
	System.out.println(b[0]);
	
	String s[]=new String[4];
	s[0] ="test";
	s[1]="Hello";
	s[2]="Test";
	s[3]="Rider";
	System.out.println(s.length);
	System.out.println(s[3]);
	
	Object ob[]=new Object[5];
	ob[0]= "When Harry Meet Sejal";
	ob[1]= 'q';
	ob[2]= "1/12/1992";
	ob[3]= "London";
	ob[4]= "XYZ";
	
	System.out.println(ob.length);
	System.out.println(ob[2]);
	System.out.println(ob[4]);
	
		
	}}


