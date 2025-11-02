
// 3. Background Job Execution using Runnable
public class BackgroundJobExecution {
    public static void main(String[] args) {
        Runnable job = () -> {
            for(int i = 1; i <= 3; i++) {
                System.out.println("Job running iteration " + i);
            }
        };
        Thread t = new Thread(job);
        t.start();
    }
}
