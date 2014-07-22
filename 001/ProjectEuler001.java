/* 
 * Project Euler Problem 001
 */

class ProjectEuler001 {
    public static void main(String[] args) {
        int counter = 1;
        int sum = 0;

        while (counter < 1000) {
        	if ((counter % 3 == 0) || (counter % 5 == 0)) {
        		sum += counter;
        	}
        	counter++;
        }

        System.out.println(sum);
    }
}
