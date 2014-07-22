/* 
 * Project Euler Problem 002
 */

class ProjectEuler002 {
    public static void main(String[] args) {
        int prev = 1;
        int curr = 1;
        int old_curr = 0;
        int sum = 0;

        while (curr < 4000000) {
        	if ((curr % 2 == 0)) {
        		sum += curr;
        	}
        	
            old_curr = curr;
            curr += prev;
            prev = old_curr;
        }

        System.out.println(sum);
    }
}
