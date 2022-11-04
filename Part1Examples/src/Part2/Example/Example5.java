package Part2.Example;

class OuterClass {
    static int staticInt=1;
    int nonStaticInt=2;
    // Inner class
    class InnerClass {
        void showInnerMethod() {
            System.out.println("Inside InnerClass.");
            System.out.println("The staticInt ="+staticInt );
            System.out.println("The nonStaticInt ="+nonStaticInt +"\n");
        }
    }

    // An outer class method that can invoke an Inner class method
    void invokeInner() {
        InnerClass innerOb = new InnerClass();
        System.out.println("**Invoking an inner class method from an outer class method.**");
        //Calling the inner class method
        innerOb.showInnerMethod();
    }
}

class Example5 {

    public static void main(String[] args) {
        System.out.println("***Example-5.Inner class demonstration.***\n");
        OuterClass outer = new OuterClass();// Ok
        //Calling the inner class method through an outer class method
        System.out.println("**Calling the inner class method through an outer class object.**");
        outer.invokeInner();
        // InnerClass inner=new InnerClass();//Error
        OuterClass.InnerClass inner = outer.new InnerClass();// Ok
        //Invoking the inner class method through an inner class object.
        System.out.println("Invoking the inner class method through an inner class object.");
        inner.showInnerMethod();
    }
}
