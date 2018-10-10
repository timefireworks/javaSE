package com.test;

import java.util.Scanner;
import java.util.Stack;

/**
 * author: San Jinhong
 * date: 2018/10/9 15:00
 **/
public class EvaluateExpression {

    public static void main(String[] args) {
        //Check number of arguments passed
        /*if(args.length != 1){
            System.out.println("Usage: java EvaluateExpression \"expression\"");
            System.exit(1);
        }*/

        System.out.print("请输入表达式：");
        String expression = new Scanner(System.in).nextLine();

        try {
            System.out.println(evaluateExpression(expression));
        } catch (Exception e) {
            System.out.println("Wrong expression: " + expression);
        }
    }

    public static int evaluateExpression(String expression){
        //存储表达式数值
        Stack<Integer> operandStack = new Stack<>();
        //存储表达式的操作符
        Stack<Character> operatorStack = new Stack<>();
        //在操作符两端添加空格
        //如果已有空格
        expression = insertBlanks(expression);

        String[] tokens = expression.split(" ");
        for(String token : tokens) {
            if(token.length() == 0) {
                continue;
            } else if(token.charAt(0) == '+' || token.charAt(0) == '-'){
                while( !operatorStack.isEmpty() &&
                        (operatorStack.peek() == '+' || operatorStack.peek() == '-'||
                        operatorStack.peek() == '*' || operatorStack.peek() == '/')){
                        processAnOperator(operandStack, operatorStack);
                }
                operatorStack.push(token.charAt(0));
            } else if(token.charAt(0) == '*' || token.charAt(0) == '/'){
                while( !operatorStack.isEmpty() &&
                        (operatorStack.peek() == '*' || operatorStack.peek() == '/')){
                    processAnOperator(operandStack, operatorStack);
                }
                operatorStack.push(token.charAt(0));
            } else if(token.trim().charAt(0) == '('){
                operatorStack.push('(');
            } else if(token.trim().charAt(0) == ')'){
                while (operatorStack.peek() != '('){
                    processAnOperator(operandStack, operatorStack);
                }

                operatorStack.pop();
            } else {
                operandStack.push(new Integer(token));
            }
        }

        while (!operatorStack.isEmpty()){
            processAnOperator(operandStack, operatorStack);
        }
        return operandStack.pop();
    }

    private static void processAnOperator(Stack<Integer> operandStack, Stack<Character> operatorStack) {
        char op = operatorStack.pop();
        int op1 = operandStack.pop();
        int op2 = operandStack.pop();
        if(op == '+'){
            operandStack.push(op2 + op1);
        } else if(op == '-'){
            operandStack.push(op2 - op1);
        } else if(op == '*'){
            operandStack.push(op2 * op1);
        } else if(op == '/'){
            operandStack.push(op2 / op1);
        }

    }

    private static String insertBlanks(String expression) {
        String result = "";
        int length = expression.length();
        for (int i =0; i < length; i++){
            if(expression.charAt(i) == '(' || expression.charAt(i) == ')' ||
               expression.charAt(i) == '+' || expression.charAt(i) == '-' ||
               expression.charAt(i) == '*' || expression.charAt(i) == '/' ){
                result += " " + expression.charAt(i) + " ";
            } else {
                result += expression.charAt(i);
            }
        }
        return result;
    }


}
