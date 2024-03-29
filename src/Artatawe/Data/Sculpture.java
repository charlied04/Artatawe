package Artatawe.Data;

import java.util.Date;

/**
 * @author Charlie Daley
 */
public class Sculpture extends Artwork {

    private double depth;

    public Sculpture(String name, String description, Picture photo, int year, int reservedPrice, Date dateTime, double width, double height, double depth){
        super(name, description, photo, year, reservedPrice, dateTime, width, height);

        this.depth = depth;

    }

    public double getDepth() {
        return depth;
    }

    @Override
    public String toString(){
        return ("Name: "+getName()+ "\nYear: " + getYear() +"\nReserved price: " + getReservedPrice()
                + "\nWidth: " + getWidth() +"\nHeight: " + getHeight() + "\nDepth:" + getDepth());
    }

}
