package _13Thread_Excecution.Challenges.ExecuterThread;

import java.util.concurrent.Callable;

public class Challenge105 implements Callable<Integer> {
    private final int numFact;

    public Challenge105(int numFact) {
        this.numFact = numFact;
    }

    @Override
    public Integer call() throws Exception {
        int fact=1;
        Thread.sleep(2000);
        if(numFact<0) {
            System.out.println("Invalid input!");
            return numFact;
        }
        if(numFact==0||numFact==1)
            return 1;
        for (int i = 2; i <=numFact; i++) {
            fact=fact*i;
        }
        return fact;
    }
}
