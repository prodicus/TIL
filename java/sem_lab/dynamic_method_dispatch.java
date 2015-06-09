class A {
    void show(){
        System.out.println("Inside A ");
    }
}

class B extends A{
    void show(){
        System.out.println("Inside B");
    }
}

class C extends B{
    void show(){
        System.out.println("Inisde C");
    }
}

class prac{
    public static void main(String[] args) {
        A r;        // obtain a reference for class A
        A a = new A();
        B b = new B();
        C c = new C();

        // now lets start referring them dynamically

        r = a ; 
        r.show(); 
        System.out.println();

        r = b ; 
        r.show();         
        System.out.println();

        r = c ; 
        r.show(); 
        System.out.println();
    }
}
/*-----   O/P -------
Inside A’s callme method
Inside B’s callme method
Inside C’s callme method
*/
