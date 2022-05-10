package org.example;

public class App {


    public static float squareMethod(int a, int b, int c) throws MyException {
        if (a < 0 || b < 0 || c < 0) throw new MyException("Текст моей ошибки");
        float result= (float) Math.sqrt(((a + b + c) / 2.f) * (((a + b + c) / 2.f) - a) * (((a + b + c) / 2.f) - b) * (((a + b + c) / 2.f)- c));
   return result;
    }
}
