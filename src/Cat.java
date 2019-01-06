
public class Cat {

  public class Cat {
    private String name;
    private String favoriteFood;
    private int age;
    private Person owner;



    public Cat(String name) {
      this.name = name;
    }

    public String getFavoriteFood() {
      return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
      this.favoriteFood = favoriteFood;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public boolean setOwner(Person owner) {
      this.owner = owner;
      return false;
    }

    public Person getOwner() {
      return owner;
    }

    private boolean isOlder(int garfield, int catwoman){
      if (garfield < catwoman){
        isOlder(garfield,catwoman);
        return false;

      }else {
        return true;
      }
    }
    public static boolean isOlder (Cat cat1, Cat cat2) {
      if (cat1.getAge() > cat2.getAge()) {
        return true;
      } else {
        return false;
      }
    }
    public static void makeBestFriends (Cat cat1, Cat cat2) {
      cat1.setFavoriteFood(cat2.getFavoriteFood());
    }
  }


