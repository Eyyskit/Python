package Part2.Example;

class Sample3 {
    // Private field
    private int priInt;
    private int test;
    //Getter
    public int getPriInt() {
        return priInt;	}
    //Setter
    public void setPriInt(int priInt) {
        this.priInt = priInt;
    }
}

class Example3 {
    public static void main(String[] args) {
        System.out.println("***Example-3.Introducing Getter-Setter method.***\n");
        Sample3 sampleOb=new Sample3();
        //Setting the value for the private field
        sampleOb.setPriInt(2);
        //Getting the value from the private field.
        System.out.println("The priInt="+ sampleOb.getPriInt());
    }
}

