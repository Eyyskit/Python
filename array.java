public class array {
    public static void main(String[] args){
        int examMarks[] = {100, 37, 65, 72,32};
        int noFails = 0;
        for (int i = 0; i < examMarks.length; i++) {
            if(examMarks[i] < 40) {
                System.out.println(examMarks[i]+ " FAILED");
                noFails++;
            }
        }
        System.out.println(noFails+ " student(s) failed");
    }
}
