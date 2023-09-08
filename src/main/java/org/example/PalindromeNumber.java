package org.example;

public class PalindromeNumber {
    public static void main(String[] args) {
        int verificationLine = 1000021;
        PalindromeNumber pn = new PalindromeNumber();
        pn.isPalindrome(verificationLine);
    }

    public boolean isPalindrome(int x) {
        boolean answer = false;
        String check = Integer.toString(x);
        for (int i = 0; i < check.length(); i++){
            if (Character.compare(check.charAt(0), '-') == 0){
                answer = false;
                break;
            }
            if (check.charAt(i) == check.charAt(check.length() - i - 1)){
                answer = true;
            }else {
                answer = false;
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
