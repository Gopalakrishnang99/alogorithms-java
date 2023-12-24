package org.ggk.numbers;

public class DecimalToBinary {

    public static void main(String[] args) {
        DecimalToBinary obj = new DecimalToBinary();
        int n = 4;
        System.out.println("Binary string rep of " + n + " is " + obj.decimalToBinaryString(n));
        n = 25;
        System.out.println("Binary string rep of " + n + " is " + obj.decimalToBinaryString(n));
        n = 4;
        System.out.println("Binary string rep of " + n + " is " + obj.decimalToBinaryNumber(n));
        n = 25;
        System.out.println("Binary string rep of " + n + " is " + obj.decimalToBinaryNumber(n));
    }

    public String decimalToBinaryString(int n) {
        StringBuilder sb = new StringBuilder();
        for (; n > 0; n /= 2)
            sb.append(n % 2);
        return sb.reverse().toString();
    }

    public long decimalToBinaryNumber(int n) {
        long answer = 0;
        int place = 1;
        for (; n > 0; n /= 2) {
            answer += (n % 2) * place;
            place *= 10;
        }
        return answer;
    }
}
