package Javaprograme;

public class Checkqualarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]={1,2,3,4,5,6,7};
   int b[]={1,2,3,4,5,6,7};
   boolean flag=true;
   if(a.length==b.length){
	   for(int i=0;i<=a.length-1;i++){
		   if(a[i]!=b[i]){
			   flag=false;
			   
		   }
	   }
	   if(flag){
		   System.out.println("arrays is equal");
		   
	   }else{
		   System.out.println("arrays is not equal");
	   }
		   	   
   }else{ 
	   System.out.println("arrays size is not equal ");
   }
   
   
	}

}
