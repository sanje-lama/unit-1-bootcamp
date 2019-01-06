
public class Methods {

  public static void main (String args[]) {

      calculateSquares(7);
      calculateSquareRoot(9);
      System.out.println(isMultiple(7, 100));
      prettyInteger(11);
      random(1, 100);

  }

    public static void calculateSquares(int n) {
        System.out.println("Square of " + n + " is " + n * n);
    }


// 2. Calculate Square Root


    public static void calculateSquareRoot(int n) {
        System.out.println("square root of " + n + " is " + Math.sqrt(n));


    }


//#### 3. toLowerCase
//
//Write a method called `toLowerCase` that takes a String as a parameter and
// returns the String in lower case.

//    public static String toLowerCase(String string) {
//        if
//
//
//    }


//4. isMultiple


    public static boolean isMultiple(int a, int b) {
        if (a % b == 0) {
            //   System.out.println(a);
            return true;
        }
        else {

            return false;

        }

    }


//5. Pretty Integer

    public static void prettyInteger(int n) {
        String str = " ";

        for (int i = 0; i < n; i++) {
            str += "*";
        }

        System.out.println(str + n + str);

    }


//
//#### 6. Random
//
//Write a method called `random` that takes 2 ints as parameters and returns a random int within that range.
//
//```
//ex: random(1, 100) returns a random int between 1 and 100
//```

    public static int random(int a, int b) {
        Random random = new Random();

        random.nextInt();

        return a + b;
    }

}
