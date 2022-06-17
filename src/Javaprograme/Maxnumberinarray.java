package Javaprograme;

public class Maxnumberinarray {

	public static void main(String[] args) {
	   int a[]={1,2,3,4,5,6};
	   int max=a[0];
	   for(int i=0;i<=a.length-1;i++){
		   if(max<a[i]){
			   max=a[i];
			   
		   }
	   }
	   System.out.println(max);
	   int min=a[0];
	   for(int i=0;i<=a.length-1;i++){
       if(max<a[i]){
    	   min=a[i];
    	   
       }
	}
	   System.out.println(min);


}}