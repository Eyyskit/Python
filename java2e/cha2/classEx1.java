package java2e.cha2;

public class classEx1 {
    public int myInt = 25;

}
class Demonstration{
    public static void main(String[] args){
        System.out.println("**Demonstration-1.A class demo with 2 objects***");
        classEx1 obA = new classEx1();
        classEx1 obB = new classEx1();
        System.out.println("obA.myInt =" + obA.myInt);
        System.out.println("obB.myInt =" + obB.myInt);
        /*ClassEx1 obA = new ClassEx1();
        obA.myInt=25;
        System.out.println("obA.myInt = "+ obA.myInt);
         */



    }
}

