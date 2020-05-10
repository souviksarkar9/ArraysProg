
public class ArrayTest {

	public static void main(String[] args) {
		int []data = {200,900,500,600,55,6,2,255,9780,1};
		int min = data[0] , max = data[0] , maxdiff = 0;
		
		for(int i=1; i<data.length; i++) {
			min = Math.min(min, data[i]);
			max = Math.max(max, data[i]);			
		}
		System.out.println(max - min);
	}

}
