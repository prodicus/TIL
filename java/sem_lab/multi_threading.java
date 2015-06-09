class A extends Thread{
    public void run(){
        // overriding the method which is already in the class Thread for our own req's
        System.out.println("Start of thread A : ");
        for (int i = 0 ; i < 6 ; i++ ) {
            System.out.println("Inside thread A : i  " + i);
        }
        System.out.println("Exit from thread A");
    }
}

class B extends Thread{
    public void run(){
        System.out.println("Start of thread B :");
        for (int i = 0 ; i < 6 ; i++ ) {
            System.out.println("Inside thread B : i  " + i);
        }
        System.out.println("Exit from thread B");
    }
}

class C extends Thread{
    public void run(){
        System.out.println("Start of thread C");
        for (int i = 0 ; i < 6 ; i++ ) {
            System.out.println("Inside thread C : i  " + i);
        }
        System.out.println("Exit from thread C");
    }
}

class prac{
    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B();
        C ob3 = new C();

        ob1.setPriority(Thread.MAX_PRIORITY);
        ob2.setPriority(Thread.NORM_PRIORITY);
        ob3.setPriority(Thread.MIN_PRIORITY);

        //  setting the priorities now.
        
        ob1.start() ;
        ob2.start() ;         
        ob3.start() ; 

    }
}