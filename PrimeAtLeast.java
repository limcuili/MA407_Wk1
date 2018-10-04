class PrimeAtLeast {

    static boolean isPrime (int integer) {
        if (integer < 2) { return false; }
        if (integer == 2) { return true; }
        for (int i = 2; i < integer; i++) {
            if (integer % i == 0) { return false; }
        }
        return true;
    }

    public static void main (String[] args) {
        int n = Integer.parseInt(args[0]);
        if (isPrime(n)) {
            System.out.println("Your number " + n + " is already a prime.");
        } else {
            int p = n + 1;
            int largestNumberJavaReads = 2147483647;
            for (int i = 0; i < largestNumberJavaReads; i++) {
                if (isPrime(p)) {
                    System.out.println("Closest prime > n is " + p);
                    return;
                }
                p++;
            }
        }

    }

}