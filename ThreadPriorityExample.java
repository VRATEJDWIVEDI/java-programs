public class ThreadPriorityExample extends Thread {

    public void run() {
        System.out.println("Inside the run() method");
    }

    public static void main(String[] argvs) {

        // Creating threads using ThreadPriorityExample class
        ThreadPriorityExample th1 = new ThreadPriorityExample();
        ThreadPriorityExample th2 = new ThreadPriorityExample();
        ThreadPriorityExample th3 = new ThreadPriorityExample();

        // Display default priorities
        System.out.println("Priority of the thread th1 is : " + th1.getPriority());
        System.out.println("Priority of the thread th2 is : " + th2.getPriority());
        System.out.println("Priority of the thread th3 is : " + th3.getPriority());

        // Setting custom priorities
        th1.setPriority(6);
        th2.setPriority(3);
        th3.setPriority(9);

        // Display new priorities
        System.out.println("Priority of the thread th1 is : " + th1.getPriority());
        System.out.println("Priority of the thread th2 is : " + th2.getPriority());
        System.out.println("Priority of the thread th3 is : " + th3.getPriority());

        // Display current thread info
        System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());
        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());

        // Changing main thread priority
        Thread.currentThread().setPriority(10);

        // Display updated main thread priority
        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());
    }
}
 