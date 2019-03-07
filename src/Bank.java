import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private final double[] accounts;
    private Lock bankLock;
    private Condition sufficientFunds;//创建一个加锁的条件
    private Object lock = new  Object();
   /* private boolean done;
    public synchronized  boolean isDone(){return done;}
    public synchronized  void setDone(){done = true;}*/

    public Bank(int n, double initialBalance) {
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
        bankLock = new ReentrantLock();
        sufficientFunds = bankLock.newCondition();
    }

    public void transfer(int from, int to, double amount) throws InterruptedException {
        /* bankLock.lock();*/
       /* synchronized (lock) {*/
        if(bankLock.tryLock(1, TimeUnit.NANOSECONDS)){
            try {
                while (accounts[from] < amount)
                    sufficientFunds.await();//如果条件不满足就暂时挂起等待别的线程释放，同事进来加的所也随着线程的等待而解开
                if (accounts[from] < amount) return;
                System.out.print(Thread.currentThread());
                accounts[from] -= amount;
                System.out.printf(" %10.2f from %d to %d", amount, from, to);
                accounts[to] += amount;
              System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
               sufficientFunds.signalAll();//释放所有暂时等待的线程
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
            bankLock.unlock();
        }
        }else{
            System.out.println("**********************放弃锁");
        }
    }



    public double getTotalBalance() {

        double sum = 0;

        for (double a : accounts)
            sum += a;

        return sum;
    }


    public int size() {
        return accounts.length;
    }
}
