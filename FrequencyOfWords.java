package Day15;
import java.io.*;

public class FrequencyOfWords {
	
	

	//class Linked {

	    public static void main(String args[]) throws IOException {

	        BufferedReader br = new BufferedReader(
	            new InputStreamReader(System.in));
	        System.out.println("Enter the sentence");
	        String st = br.readLine();
	        st = st + " ";
	        int a = lengthx(st);
	        String arr[] = new String[a];
	        int p = 0;
	        int c = 0;

	        for (int j = 0; j < st.length(); j++) {
	            if (st.charAt(j) == ' ') {
	                arr[p++] = st.substring(c,j);
	                c = j + 1;
	            }
	        }
	    }

	    static int lengthx(String a) {
	        int p = 0;
	        for (int j = 0; j < a.length(); j++) {
	            if (a.charAt(j) == ' ') {
	                p++;
	            }
	        }
	        return p;
	    }
	}
		


