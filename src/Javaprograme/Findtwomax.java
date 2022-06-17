package Javaprograme;

public class Findtwomax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]={10,20,40,50,60,};
     int maxone=0;
     int maxtwo=0;
     for(int n:a){
    	 if(maxone<n){
    		 maxone=n;
    		 
    	 }
    	 else if(maxtwo<n){
    		 maxtwo=n;
    		 
     }
    	 
     }
     System.out.println(maxone);
     System.out.println(maxtwo);
	}

}
