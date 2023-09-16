package org.example;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "DCXXI";
        RomanToInteger roman = new RomanToInteger();
        roman.romanToInt(s);
    }

    public int romanToInt(String s) {
        int answer = 0;
        char[] check = s.toCharArray();
        int i = 0;
        while (i < check.length) {
            switch (check[i]) {
                case 'I' -> {
                    if (i + 1 < check.length && (check[i + 1] == 'V' || check[i + 1] == 'X')) {
                        if (check[i + 1] == 'V') {
                            answer += 4;
                            i += 2;
                        } else if (check[i + 1] == 'X') {
                            answer += 9;
                            i += 2;
                        }
                    } else {
                        i++;
                        answer++;
                    }
                }
                case 'V' ->{
                    answer += 5;
                    i++;
                }
                case 'X' -> {
                    if (i + 1 < check.length && (check[i + 1] == 'L' || check[i + 1] == 'C')) {
                        if (check[i + 1] == 'L') {
                            answer += 40;
                            i += 2;
                        } else if (check[i + 1] == 'C') {
                            answer += 90;
                            i += 2;
                        }
                    } else {
                        i++;
                        answer += 10;
                    }
                }
                case 'L' ->{
                    answer += 50;
                    i++;
                }
                case 'C' ->{
                    if (i + 1 < check.length && (check[i + 1] == 'D' || check[i + 1] == 'M')) {
                        if (check[i + 1] == 'D') {
                            answer += 400;
                            i += 2;
                        } else if (check[i + 1] == 'M') {
                            answer += 900;
                            i += 2;
                        }
                    } else {
                        i++;
                        answer += 100;
                    }
                }
                case 'D' ->{
                    answer += 500;
                    i++;
                }
                case 'M' ->{
                    answer += 1000;
                    i++;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}
