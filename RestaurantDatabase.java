import java.util.Scanner;
 /*
 * Manages data about restaurants from the Restaurant Database
 */   
public class RestaurantDatabase {

    private Restaurant[] restaurantData;  // The 1D array of Restaurant objects

    /*
     * Reads the data from the three different files to initialize restaurantData
     */     
    public RestaurantDatabase(String namesFile, String locationsFile, String revenuesFile) {
        restaurantData = createRestaurants(namesFile, locationsFile, revenuesFile);
    }

    /*
     * Creates Restaurant objects from the data files
     */   
    public Restaurant[] createRestaurants(String namesFile, String locationsFile, String revenuesFile) {
        String[] namesData = FileReader.toStringArray(namesFile);
        int[] locationsData = FileReader.toIntArray(locationsFile);
        String[] revenuesData = FileReader.toStringArray(revenuesFile);  

        Restaurant[] tempRestaurant = new Restaurant[namesData.length];

        for (int index = 0; index < tempRestaurant.length; index++) {
            tempRestaurant[index] = new Restaurant(namesData[index], locationsData[index], revenuesData[index]);
        }

        return tempRestaurant;
    }

    /*
     * Returns true if any restaurants in restaurantData have the same amount of locations, otherwise returns false
     */   
    public boolean checkForDuplicates() {
        for (int outer = 0; outer < restaurantData.length; outer++) {
            for (int inner = outer + 1; inner < restaurantData.length; inner++) {
                if (restaurantData[outer].getLocations() == restaurantData[inner].getLocations()) {
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * Returns a String containing each restaurant's information
     */   
    public String toString() {
        String result = "";

        for (Restaurant theRestaurant : restaurantData) {
            result += theRestaurant + "\n";
        }

        return result;
    }
}
