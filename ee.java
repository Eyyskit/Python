import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ee {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(30);
        numbers.add(40);
        numbers.add(55);
        numbers.add(56);

        Iterator<Integer>numbersIterator = numbers.iterator();
        int lastNum=0;
        while (numbersIterator.hasNext()){
            Integer num=numbersIterator.next();
            if (num>lastNum){
                lastNum=num;
                numbersIterator.remove();
            }
            System.out.println(numbersIterator);
        }
    }
}