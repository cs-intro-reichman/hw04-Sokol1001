public class Primes {
    public static void main(String[] args) 
    {
        if (args.length == 0) 
        {
            return;
        }
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n + 1];
        int i = 2;
        while (i <= n) 
        {
            isPrime[i] = true;
            i++;
        }

        int p = 2;
        while (p * p <= n) 
        {
            if (isPrime[p]) 
            {
                int j = p * p;
                while (j <= n) 
                {
                    isPrime[j] = false;
                    j = j + p;
                }
            }
            p++;
        }

        System.out.println("Prime numbers up to " + n + ":");
        int primeCount = 0;
        int k = 2;
        while (k <= n) 
        {
            if (isPrime[k]) 
            {
                System.out.println(k);
                primeCount++;
            }
            k++;
        }
        double percentage = (double) primeCount / n * 100;
        System.out.println("There are " + primeCount + " primes between 2 and " + n + " (" + (int) percentage + "% are primes)");
    }
}