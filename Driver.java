import src.demo.DemoAdmin;
import src.demo.DemoCourier;
import src.demo.DemoCustomer;
import src.restaurant.Restaurant;
import src.test.TestCustomer;



public class Driver {

  public static void main(String[] args) {
    /*Restaurant restaurant = new Restaurant();
    DemoAdmin.adminDemo(restaurant);
    */
    testDemos();
  }

  public static void testUsers() {
    TestCustomer.testCustomer();
  }

  public static void testDemos() {
   DemoCourier.demoCourier();

  }

}
