/*
 * Represents a fast food restaurant
 */ 
public class Restaurant {
    private String name;      // The name of the restaurant
    private int locations;    // The number of locations in California
    private String revenues;     // 2023 Revenues

    /*
     * Sets name, location, and revenues to the specified values
     */     
    public Restaurant(String name, int locations, String revenues) {
        this.name = name;
        this.locations = locations;
        this.revenues = revenues;
    }

    /*
     * Returns the name of the restaurant
     */   
    public String getName() {
        return name;
    }
    
    /*
     * Returns the number of locations in California
     */   
    public int getLocations() {
        return locations;
    }
    
    /*
     * Returns the 2023 revenue
     */   
    public String getRevenues() {
        return revenues;
    }

    /*
     * Returns a String containing the name, location, and revenue of the restaurant
     */   
    public String toString() {
        return name + " (" + locations + " locations) - $" + revenues; 
    }
}
