
public class Conditionals {

  public static void main (String args[]) {
 =
    System.out.println(isOdd(8));
    System.out.println(isMultipleOfThree(69));
    System.out.println(isOddAndIsMultipleOfThree(18));
    fizzMultipleOfThree(7);
    System.out.println(person("london"));
    name("ygfyguy");
    System.out.println(cigarParty(39, true));
    System.out.println(speeding(65, true));
    lottery(1,1,1);
  }


//1. Write a method `isOdd` that takes in an `int` n.


  public static boolean isOdd(int n) {
    if (n % 2 == 1) {
      return true;
    }
    return false;
  }


//2. Write a method `isMultipleOfThree` that takes in an `int` n.
// Returns `true` if n is a multiple of three, and `false` otherwise.

  public static boolean isMultipleOfThree(int n) {
    if (n % 3 == 0) {
      return true;
    }
    return false;
  }
//3. Write a method `isOddAndIsMultipleOfThree` that takes in an `int` n. Returns `true` if n is both odd and a multiple of three, and false otherwise.

  public static boolean isOddAndIsMultipleOfThree(int n) {
    if (n % 2 == 1 && n % 3 == 0) {
      return true;

    }
    else {
      return false;
    }
  }
//4. Write a method `isOddAndIsMultipleOfThree2` - if you used `isOdd` and `isMultipleofThree` in your last solution, don't use it this time. If you did not, write this method building on your last methods.


//5. Write a method `fizzMultipleofThree` that takes in an `int` n and prints
// "Fizz" if n is a multiple of three, and prints n otherwise.

  public static void fizzMultipleOfThree(int n) {
    if (n % 3 == 0) {
      System.out.println("Fizz");
    }
    else {
      System.out.println("otherwise");
    }

  }


  //5. Write a method that takes in a `Person` and returns `true` if the person is from London, and `false` otherwise.
  public static boolean person(String person) {
    if (person.equals("London".toLowerCase())) {
      return true;

    }
    return false;


  }


//6. Write a method that takes in a `Person` and prints the name if the
// person has a name longer than 5 characters, and otherwise prints
// "Name is too short."

  public static void name(String person) {
    if (person.length() > 5) {
      System.out.println(person);
    }
    else {
      System.out.println("Name is too short.");
    }

  }

//1. Cigar Party
//When squirrels get together for a party,
// they like to have cigars. A squirrel party is successful when the number of cigars
// is between 40 and 60, inclusive. Unless it is the weekend,
// in which case there is no upper bound on the number of cigars.
// Write a method called `cigarParty` that takes an `int` (the number of cigars)
// and `boolean` (whether or not it is the weekend) as parameters, and returns
// `true` if the party with the given values is successful, or `false` otherwise.

  public static boolean cigarParty(int cigars, boolean weekend) {
    if (cigars >= 40 && cigars <= 60 && !weekend) {
      return true;
    }
    if (weekend && cigars >= 40) {
      return true;
    }
    else {
      return false;
    }
  }
//
//#### 2. Caught Speeding
//
//You are driving a little too fast, and a police officer stops you.
// Write code to compute the result, encoded as an int value: 0=no ticket,
// 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
// If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or
// more, the result is 2. Unless it is your birthday -- on that day, your speed
// can be 5 higher in all cases.


  public static int speeding(int speed, boolean birthday) {
    if (!birthday && speed <= 60) {
      return 0;
    }
    else if (!birthday && (speed > 61 && speed <= 80)) {
      return 1;
    }
    else if
    (!birthday && speed > 81) {
      return 2;
    }
    return -1;
  }


  3. Alarm Clock
    public static String alarm(int days, boolean vacation) {
        if (vacation) {
            if (days >= 1 && days <= 5) {
                return "10:00 AM";
            }
            else {
                return "7:00";
            }

            else (!vacation && days >= 6 && days <= 7) {
                System.out.println("OFF");
            }
            else {
                return "10:00 AM";
            }

            }

        }



//    4. Lottery Ticket
//
//You have a green lottery ticket, with `int`s a, b, and c on it.
// If the numbers are all different from each other,
// the result is 0. If all of the numbers are the same, the result is 20.
// If two of the numbers are the same, the result is 10. Write a method that takes
// 3 `int`s as parameters and returns the correct result.

  public static int lottery(int a, int b, int c) {
    if (a == b &&  b == c) {
      return 20;

    } else {
      return 10;
    }
  }
  //
//#### 5. Blackjack
//
//Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.


  //blackjack(19, 21) → 21
//blackjack(21, 19) → 21
//blackjack(19, 22) → 19
//```
//
//#### 6. Evenly Spaced
//
//Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced,
// so the difference between small and medium is the same as the difference between medium and large.
  public static boolean evenlySpaced(int a, int b, int c) {
      double avg = (a + b + c) / 3.0;
      return (avg == a || avg == b || avg == c);


  }
//evenlySpaced(2, 4, 6) → true
//evenlySpaced(4, 6, 2) → true
//evenlySpaced(4, 6, 3) → false
//```

}


  }
}
