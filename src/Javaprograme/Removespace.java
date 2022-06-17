package Javaprograme;

public class Removespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="Welcome hello write";
    String s1=s.replaceAll("\\s","");
    System.out.println(s1);
    String s2=")&%$@abcdecdghgihasdss";
    s2=s2.replaceAll("[^a-za-zo-9]","");
    System.out.println(s2);
	}

}
