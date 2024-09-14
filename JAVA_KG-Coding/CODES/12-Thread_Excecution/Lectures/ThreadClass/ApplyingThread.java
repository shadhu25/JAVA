package _13Thread_Excecution.Lectures.ThreadClass;

public class ApplyingThread extends Thread{
    private final char targetChar;

    public ApplyingThread(char targetChar){
        this.targetChar=targetChar;
    }

    char getTargetChar(){
        return targetChar;
    }
    @Override
    public void run() {
        // printing task
        System.out.printf("\n%c task has started\n",getTargetChar());
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d%c ",i,getTargetChar());
        }
        System.out.printf("\n%c task has completed\n",getTargetChar());
    }
}
