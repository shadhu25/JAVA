package _14FunctionalProgramming.Challenge;

public class CheckPrime {
    public static void main(String[] args) {
        Prime prime=x -> {
            for (int i = 2; i < x / 2; i++) {
                if(x%i==0)
                    return false;
            }
            return true;
        };
        System.out.println(prime.isPrime(13));
    }
}
