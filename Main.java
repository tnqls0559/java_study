package java_study;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> num_list = new ArrayList<Integer>();
        
        for(int i=0; i<N; i++){
            int number = sc.nextInt();
            num_list.add(number);
        }
		for(int i=0; i<num_list.size()-1; i++){
	        for(int j=0; j<num_list.size()-i-1; j++){
	            if(num_list.get(j)>num_list.get(j+1)){
	                int temp = num_list.get(j);
	                num_list.set(j, num_list.get(j+1));
	                num_list.set(j+1, temp);
	            }
	        }
	    }
        for(int i=0; i<num_list.size(); i++){
            System.out.println(num_list.get(i));
        }
	}
}
