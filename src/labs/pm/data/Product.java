/*
 * Copyright (C) 2022 karan
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package labs.pm.data;

import java.math.BigDecimal;
import static java.math.RoundingMode.HALF_UP;
import java.time.LocalDate;
import java.util.Objects;

/**
 * {@code Product} class represents properties and behaviors of product objects
 * in the Product Management System
 * <br>
 * Each product has an id,name and price
 * <br>
 * Each product can have a discount, calculated based on a (@link DISCOUNT_RATE
 * discount rate)
 *
 * @version 4.0
 * @author oracle
 */
public abstract class Product implements Rateable<Product> {

    private int id;
    private String name;
    private BigDecimal price;
    private Rating rating;
    /**
     * A constant that defines a {@link java.math.BigDecimal BigDecimal} value
     * of the discount rate
     * <br>
     * Discount rate is 10%
     */
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }


    public int getId() {
        return id;
    }

    

    public String getName() {
        return name;
    }

    

    public BigDecimal getPrice() {
        return price;
    }

    

    /**
     * Calculates discount based on the product price and
     * {@link DISCOUNT_RATE discount rate}
     *
     * @return a {@link java.math.BigDecimal BigDecimal} value of the discount
     */
    public BigDecimal getDiscount() {
        return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
    }

    @Override
    public Rating getRating() {
        return rating;
    }

    
    /**
     * Assumes that the best before date is today
     *
     * @return current date
     */
    public LocalDate getBestBefore() {
        return LocalDate.now();
    }

    @Override
    public String toString() {
        return id+" " + name+" " + price+" "  + getDiscount()+" "+rating.getStars()+" "+getBestBefore();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
       
        if (obj instanceof Product){
        final Product other = (Product) obj;
        
            return this.id==other.id;
        }
        return false;
    }
    
    
}
