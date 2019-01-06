
    public class ClassesAndObjects {

      public static void main (String args[]) {

        Cat garfield = new Cat ("Garfield");
        Cat pinkPanther = new Cat ("Pink Panther");
        Cat catWoman = new Cat ("Catwoman");

        garfield.setFavoriteFood("Lasangna");
        pinkPanther.setFavoriteFood("shrimp");
        catWoman.setFavoriteFood("tuna");

        garfield.setAge(5);
        pinkPanther.setAge(10);
        catWoman.setAge(20);

        System.out.println(isOlder(garfield, pinkPanther));
        makeBestFriends(catWoman, pinkPanther);
        System.out.println(catWoman.getFavoriteFood());

        Person john = new Person ("John");
        adoption(pinkPanther, john);

        adoption(catWoman, john);

        System.out.println(isFree(pinkPanther));
        System.out.println(isFree(catWoman));

        System.out.println(isSibling(pinkPanther, catWoman));

      }






      public static void adoption(Cat cat, Person person) {
        if (cat.setOwner(person)) {
          System.out.println(cat.getName() + " is now " + person.getName() + "'s pet!");
        }
      }


      public static boolean isFree(Cat cat) {
        if (cat.getOwner() == null) {
          return true;
        } else {
          return false;
        }
      }



      public static boolean isSibling (Cat cat1, Cat cat2) {
        if (cat1.getOwner().equals(cat2.getOwner())) {
          return true;
        } else {
          return false;
        }
      }

    }

