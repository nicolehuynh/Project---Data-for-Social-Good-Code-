public class DataRunner {
    public static void main(String[] args) {
         {
            RestaurantDatabase restaurants = new RestaurantDatabase("names.txt", "locations.txt", "revenues.txt");
            System.out.println(restaurants);
            System.out.println("Check for duplicates: " + restaurants.checkForDuplicates());
        } 
        }
    }

