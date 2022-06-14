package src.restaurant;

/**
 * It's a class that represents a food item
 * @author Group 2
 * @version 2.0.0
 * @since 14.06.2022
 */

/**
 * It's a class that represents a food item
 */
public class Food implements Comparable<Food> {

  private int foodID;
  private String foodName;
  private double foodPrice;
  private String foodType;

  /**
   * Constructor of the Food class
   *
   * @param foodID    the food id
   * @param foodName  the food name
   * @param foodPrice the food price
   * @param foodType  the food type
   */
  public Food(int foodID, String foodName, double foodPrice, String foodType) { // type is added for extra
    this.foodID = foodID;
    this.foodName = foodName;
    this.foodPrice = foodPrice;
    this.foodType = foodType;
  }

  /** Default Constructer of the Food class */
  public Food() {
    // Intentionally empty
  }

  /**
   * This function sets the foodID variable to the value of the id parameter.
   *
   * @param id The ID of the food item.
   */
  public void setFoodID(int id) {
    foodID = id;
  }

  /**
   * It sets the foodName variable to the value of the food_name parameter.
   *
   * @param food_name The name of the food.
   */
  public void setFoodName(String food_name) {
    foodName = food_name;
  }

  /**
   * It sets the price of the food.
   *
   * @param price The price of the food item
   */
  public void setFoodPrice(double price) {
    foodPrice = price;
  }

  /**
   * This function takes a string as an argument and sets the foodType variable to
   * that string
   *
   * @param type The type of food.
   */
  public void setFoodType(String type) {
    foodType = type;
  }

  /**
   * It returns the foodID.
   *
   * @return The foodID
   */
  public int getFoodID() {
    return foodID;
  }

  /**
   * It returns the value of the price of the food
   *
   * @return The price of the food is being returned.
   */
  public double getFoodPrice() {
    return foodPrice;
  }

  /**
   * This function returns the food type
   *
   * @return The type of the food is being returned.
   */
  public String getFoodType() {
    return foodType;
  }

  /**
   * This function returns the food name
   *
   * @return The name of the food is being returned.
   */
  public String getFoodName() {
    return foodName;
  }

  /**
   * If the account number of the current object is greater than the account
   * number of the object passed
   * in, return 1. If the account number of the current object is less than the
   * account number of the
   * object passed in, return -1. Otherwise, return 0
   *
   * @param o The object to be compared.
   */
  @Override
  public int compareTo(Food o) {
    if (getFoodPrice() > o.getFoodPrice()) {
      return 1;
    } else if (getFoodPrice() < o.getFoodPrice()) {
      return -1;
    } else return 0;
  }

  /**
   * If the object is the same as this, return true. If the object is not an instance of Food, return
   * false. Otherwise, return true if the foodID, foodName, foodPrice, and foodType are the same
   *
   * @param obj The object to compare this Food to.
   * @return The hashcode of the object.
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (!(obj instanceof Food)) return false;
    Food other = (Food) obj;
    return (
      foodID == other.foodID &&
      foodName.equals(other.foodName) &&
      foodPrice == other.foodPrice &&
      foodType.equals(other.foodType)
    );
  }

  /**
   * The toString() method returns a string representation of the Food
   *
   * @return The string representation of the Food is being returned.
   */
  @Override
  public String toString() {
    StringBuilder foodInfo = new StringBuilder();
    foodInfo.append("Food Informations: ");
    foodInfo.append("\nFood ID : " + foodID + "\n");
    foodInfo.append("Food Name : " + foodName + "\n");
    foodInfo.append("Food Price : " + foodPrice + "\n");
    foodInfo.append("Food Type : " + foodType + "\n");
    return foodInfo.toString();
  }
}
