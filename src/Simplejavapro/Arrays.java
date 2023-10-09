package Simplejavapro;

public class Arrays {

	public static void main(String[] args) {
/*
 Array is used to store similar data type values in a array variable..
  ==>Reference variable .length is a method used to find the size or length of array..
  ==> Dis-advantage of array:-Size is fixed means Static array --> To over come this 
     we use"Collections"(Array list,Hash table)& its an Dynamic array.  
  ==> store only similar data types --> to over come this problem we use "Object array".. 
	 */
		
	int i[]=new int[5];
	i[0]=56;
	i[1]=22;
	i[2]=89;
	i[3]=61;
	i[4]=90;
	for(int j=0;j<i.length;j++) {
		System.out.println(i[j]);
	}
   //char array
	char a[]=new char[4];
	a[0]='v';
	a[1]='f';
	a[2]='g';
	a[3]='p';
	for(char b=0;b<a.length;b++) {
		
		System.out.println(a[b]);
	}
	//double array
	
	double d[]=new double[4];
	d[0]=21.8;
	d[1]=38.9;
	d[2]=09.6;
	d[3]=55.1;
	for(double m=0;m<d.length;m++) {
	//	System.out.println(d[m]);
	}
	
	//String array
	String n[]=new String[3];
	n[0]="radha";
	n[1]="bhara";		
	n[2]="krish";
	System.out.println(n[2]); 
	
	/*Object array :- Object is a Class used to store different data types values .
	                 {[Actually its an "super class" of all the Classes that are available in java..]}
	 */
	Object ob[]=new Object[4];
	ob[0]=22;
	ob[1]="tarak";
	ob[2]=65.9;
	ob[3]='v';
 System.out.println(ob[2]);
/* for(Object k=0;k<ob.length;k++)
 {
	 System.out.println(ob[k]);
 }*/

  }
}