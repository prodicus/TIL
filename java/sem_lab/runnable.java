class A implements Runnable{
    Thread t ; 
    String thread_name ;
    A(String name){
        t = new Thread(this, name);
        System.out.println("Child thread is " + t );
        t.start();
    }

    public void run(){
        System.out.println("start of thread A ");
        for(int i = 0 ; i < 10 ; i ++)
            System.out.println("Thread A : i : " + i); 
        System.out.println("Exit from thread A") ;
    }
    public void start()    {
        System.out.println("Starting the thread" + thread_name);
        if (t == null){
            t = new Thread(this,thread_name);
            t.start();
        }
    }
}

class runnable{
    public static void main(String[] args) {
        A obj = new A("Thread 1");
        obj.start();
    }
}