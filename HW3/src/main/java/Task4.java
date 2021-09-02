public class Task4 {
    //Create your own example with increment/decrement, count it manually and then run program and verify your value. Example has to contain more then 5 increment operation, more then 5 decrement operations, *=, +=, -=, and more then 5 resetting of value for each variable.
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        x = x++ + y++; // x5, y4
        y = x + y + ++x; //y15 x6
        x = --y - --x;// x9 y14
        y = x - y - ++x; // y-15 x10
        x = x++ * y++ - --y; // x-135 y-15
        y = y++ - (--x + y);// y135 x-136
        x += x-- * (++y + x++);// x0 y136
        y -= --x + y;// y1 x-1
        x -= 1 + (--x - ++y);// x1 y2
        y *= ++x * y++; // y12 x3
        System.out.println(""+x);
        System.out.println(""+y);





    }
    }

