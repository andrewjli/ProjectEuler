/* 
 * Project Euler Problem 003
 */

class ProjectEuler003 {
    public static void main(String[] args) {
        long n = 600851475143L;
        long largest = 0L;

        for (long i = 2L; i*i < n; i++) {
            if (isPrime(i) && (n % i == 0)) {
                System.out.println(i);
                long temp = n / i;
                if(isPrime(temp)) {
                    largest = temp;
                    break;
                } else {
                    largest = i;
                }
            }
        }

        System.out.println(largest);
    }

    public static boolean isPrime(long n) {
        boolean prime = true;

        for (long j = 2L; j*j < n; j++) {
            if (n % j == 0) {
                prime = false;
                break;
            }
        }

        return prime;
    }
}
