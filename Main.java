package ru.geekbrains.lesson1_hw;

public class Main {

    public static void main(String[] args) {

        private static void example() {
            int a = 9;
            int b = 5;
            int c = 10;
            int d = 2;
            double result = a * (b + (c / d));
            System.out.println(result);
        }

        private static void TrueFalse() {
            int userInputX = 10;
            int userInputY = 10;
            int x = userInputX + userInputY;
                if(x >= 10 && x <= 20){
                    System.out.println(x);
                }
            }
        private static void positiveNumber(int z) {
            int userInputZ = 10;
                if(userInputZ >= 0){
                    System.out.println("positive");
                } else{
                    System.out.println("negative");
                }

        }

      /*  private static char helloName(){
            System.out.println("Hello, " + res)
            char userName = 'n';
            char res = helloName('n');
        }
         ??????????????? не могу сообразить как это сделать
         почему char
         не понимаю как вернуть в метод строку с приветствием*/

        private static void leapYear(){
            int year = 0;
            int leap = 0;
            year++;
                    // аааааа, что происходит
            if(year == 4 || year == 400){
                leap++;
            }

            else if(year == 100){//не 100 а кратен сотне, по идее здесь должна быть формула)
                leap = leap;
            }
        }
    }       //это всё, на что меня пока хватило
