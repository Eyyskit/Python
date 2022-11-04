public class divisibility {
    public static void main(String[] args){
        String num ="2345";//the person enters a value
        int total = 0;//creating a variable total and initializing it as zero
        for (char x: num.toCharArray()) {//the .toCharArray splits each of the numbers 2345 to be alone as 2,3,4,5 and char x is variable
            total = total - (0-x) - '0';//this line adds each of the chars in string num as 2+3+4+5 to give a total of 14
            while (total>=9){//this line shows while 14 is greater than zero execute line 8 which is 14-9=5
                total-=9;
            }
        }
        System.out.println("Is the number divisible by 9?");//since the answer is not zero the num 2345 is not divisible by 9
        System.out.println(total==0);
    }
}
