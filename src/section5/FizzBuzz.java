package section5;
//3 fizz
//5 buzz
//Both = fizzbuzz


public class FizzBuzz {

	public static void main(String[] args) {
		

		for(int number = 1; number < 100; number++) {
			
			if(number % 3 == 0 && number % 5 == 0) {
				System.out.print("FizzBuzz \n");
			} else {
				if(number % 3 == 0) {
					System.out.print("Fizz \n");
				} else if(number % 5 == 0) {
					System.out.print("Buzz \n");
				} else {
					System.out.print(number + "\n");
				}
			}
			
			
		}
		
	}
	
}
