package org.ggk.numbers;

public class SieveOfEratosthenes {

    private int size;

    private boolean initialized = false;

    private boolean[] primeArray;

    public SieveOfEratosthenes() {
        this(500);
    }

    public SieveOfEratosthenes(int n) {
        primeArray = new boolean[n + 1];
        this.size = n + 1;
    }

    private void initializePrimeArray() {
        for (int i = 0; i < this.size; i++)
            primeArray[i] = true;
        int root = (int) Math.ceil(Math.pow(this.size, 0.5));
        System.out.println(root);
        for (int i = 2; i < root; i++) {
            if (primeArray[i])
                for (int j = i * i; j < this.size; j += i)
                    primeArray[j] = false;
        }
    }

    public boolean isPrime(int n) {
        if (!initialized)
            initializePrimeArray();
        return primeArray[n];
    }

    public void printPrimeNumbers() {
        for (int i = 0; i < this.size; i++)
            if (primeArray[i])
                System.out.println(i + " ");
    }

    public static void main(String[] args) {
        SieveOfEratosthenes sieve = new SieveOfEratosthenes();
        System.out.println("Is 4 prime? = " + sieve.isPrime(4));
        System.out.println("Is 17 prime? = " + sieve.isPrime(17));
        System.out.println("Is 57 prime? = " + sieve.isPrime(57));
        System.out.println("Is 500 prime? = " + sieve.isPrime(500));
        sieve.printPrimeNumbers();
    }
}
