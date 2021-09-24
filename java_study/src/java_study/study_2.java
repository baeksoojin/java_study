package java_study;

import java.util.Scanner;

public class study_2 {
	
	public int pow(int a, int b,int result) {
        if(b==1) {
        	return result;
        }
        else {
        	return pow(a,b-1,result*a);
        }
    }

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
        int a = sc.nextInt();
        int b = sc.nextInt();

        study_2 myTest = new study_2();
        int result = myTest.pow(a, b,a);
        
        System.out.println(a+"ÀÇ"+b+"½ÂÀÇ °á°ú : "+result);
        sc.close();
    }

}
