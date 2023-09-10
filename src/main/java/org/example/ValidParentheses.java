package org.example;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String verificationLine = "{[]}";
        ValidParentheses validParentheses = new ValidParentheses();
        validParentheses.isValid(verificationLine);
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c); // Если символ - открывающая скобка, добавляем ее в стек
            } else if (!stack.isEmpty() && isMatchingPair(stack.peek(), c)) {
                stack.pop(); // Если символ - закрывающая скобка и соответствует открывающей, удаляем открывающую из стека
            } else {
                return false; // Несоответствующая или лишняя закрывающая скобка
            }
        }

        return stack.isEmpty(); // Если стек пуст, значит, все скобки сбалансированы
    }

    private boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '[' && closing == ']') ||
                (opening == '{' && closing == '}');
    }
// проверяет только ближайшие две скобки
//    public boolean isValid(String s) {
//        char[] charArray = s.toCharArray();
//        boolean answer = false;
//        System.out.println(charArray.length);
//        for (int i = 0; i < charArray.length; i++){
//            for (int j = i + 1; j <=charArray.length - 1; j++){
//                char openingChar = charArray[i];
//                char closingChar = charArray[j];
//                boolean isPair = (openingChar == '(' && closingChar == ')' ||
//                        openingChar == '[' && closingChar == ']' ||
//                        openingChar == '{' && closingChar == '}');
//                answer = isPair;
////                if (charArray.length == 2){
////                    break;
////                }
//            }
//        }
//        System.out.println(answer);
//        return answer;
//    }
}
