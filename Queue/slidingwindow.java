import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class slidingwindow {
    public static void main(String[] args) {
		
		  Integer[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
		  List<Integer> list = Arrays.asList(arr);
		  List<Integer> l = new ArrayList<>();
	       

		  for(int i =0;i<arr.length-2;i++) {
            
			  
			  List<Integer> subList = list.subList(i, i+3);
			  int max = Collections.max(subList);
			  l.add(max);
		  }
		  System.out.println(l);
	}
}
