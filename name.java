public class name {
    public static void main(String[] args){
        String[] students = {"Bill", "Geezer", "Ozzy", "Tom"}; // Shadow Array of names
        double christmasExam[] = {10.5, 34, 59, 79};
        double easterExam[] = {76, 49, 33, 79};
        String longeststudent = "";
        for (String student : students) {
            if (student.length() > longeststudent.length()) {
                longeststudent = student;
            }
        }
        String shorteststudent = longeststudent;
        for (String student : students) {
            if (student.length() < shorteststudent.length()) {
                shorteststudent = student;
            }
        }
        System.out.println("Shortest name is "+shorteststudent);
        System.out.println("longest name is "+longeststudent);
        double sum = 0;
        for(int i=0; i < easterExam.length ; i++){
            sum = sum + easterExam[i];
        }
        double average = sum / easterExam.length;
        System.out.println(average);

    }
}
