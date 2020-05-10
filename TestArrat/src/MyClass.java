
public class MyClass {

	public static void main(String[] args) {
		int draw = 1;
		int no_of_seat = 7;
		int no_of_treats = 1;
		
		int []arr = new int[no_of_seat];
		
		int i = 0;	
		
		while(i<no_of_treats) {
			int j=draw;
			for(; j<=(no_of_seat+1); j++) {
				if((j % (no_of_seat+1)) == 0) {
					draw = 1;
					break;
				}else {
					arr[j-1]++;
					System.out.print(j);
				}
			}
			
			if(i==(no_of_treats-1)) {
				System.out.println("\nLast Received Treat No: "+ (i+1) +" Seat Number : " + (j-1));
			}
			
			i++;
		}
		
		for(int p=0; p<arr.length; p++) {
			System.out.println("\n Seat Number: " + (p+1) + " Received " + arr[p] + " treats ");
		}
		

	}

}
