import org.junit.jupiter.api.*;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;


class RestaurantServiceTest {

    RestaurantService service = new RestaurantService();
    Restaurant restaurant;
    //REFACTOR ALL THE REPEATED LINES OF CODE

    OrderValue orderValue = new OrderValue();
    //>>>>>>>>>>>>>>>>>>>>>>SEARCHING<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    @Test
    public void searching_for_existing_restaurant_should_return_expected_restaurant_object() throws restaurantNotFoundException {
        //WRITE UNIT TEST CASE HERE
    }

    //You may watch the video by Muthukumaran on how to write exceptions in Course 3: Testing and Version control: Optional content
    @Test
    public void searching_for_non_existing_restaurant_should_throw_exception() throws restaurantNotFoundException {
        //WRITE UNIT TEST CASE HERE
    }
    //<<<<<<<<<<<<<<<<<<<<SEARCHING>>>>>>>>>>>>>>>>>>>>>>>>>>

    public void calculate_final_order_value_pass() {
        addFoodItemsToCart();

        assertEquals(1215, orderValue.totalOrderValue());
    }

    @Test
    public void calculate_final_order_value_fail() {
        addFoodItemsToCart();

        assertNotEquals(100, orderValue.totalOrderValue());
    }

    private void addFoodItemsToCart() {
        Item chapathi = new Item("chapathi", 25, true);
        orderValue.addFoodItemsToCart(chapathi, 10);

        Item meals = new Item("meals", 110, true);
        orderValue.addFoodItemsToCart(meals, 1);

        Item ChickenBiryani = new Item("chickenBiryani", 250, true);
        orderValue.addFoodItemsToCart(ChickenBiryani, 1);

        Item KajuCurry = new Item("KajuCurry", 180, true);
        orderValue.addFoodItemsToCart(KajuCurry, 1);

        Item gulabJamun = new Item("Gulab Jamun", 25, true);
        orderValue.addFoodItemsToCart(gulabJamun, 5);
    }


}