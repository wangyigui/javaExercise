// Exercise29_9.java: Demonstrate ConcurrentModificationException
// Be patient to run it a couple times to see the exception
import java.util.*;

public class Exercise29_9 {
  private HashSet hashSet = new HashSet();

  class Task1 implements Runnable {
    public void run() {
      for (int i = 0; i < 10000; i++) {
        System.out.println("Thread 1");
        hashSet.add(new Integer(i));
        try { Thread.sleep(1000); } catch (Exception ex) {
          ex.printStackTrace();
        }
      }
    }
  }

  class Task2 implements Runnable {
    public void run() {
      while (true) {
        System.out.println("Thread 2");
        try { Thread.sleep(1000); } catch (Exception ex) {
          ex.printStackTrace();
        }

        Iterator iterator = hashSet.iterator();

        while (iterator.hasNext()) {
          System.out.println(iterator.next());
        }
      }
    }
  }

  public static void main(String[] args) {
    new Exercise29_9();
  }

  Exercise29_9() {
    Thread thread1 = new Thread(new Task1());
    Thread thread2 = new Thread(new Task2());
    thread1.start();
    thread2.start();
  }
}
