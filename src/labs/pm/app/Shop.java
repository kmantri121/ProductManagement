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
package labs.pm.app;

import labs.pm.data.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;


/**
 * {@code Shop} class represents an application that manages Products 
 * @version 4.0
 * @author oracle
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ProductManager pm = new ProductManager(Locale.UK);
        
        pm.createProduct(101,"Tea",BigDecimal.valueOf(1.99),Rating.NOT_RATED);
        pm.reviewProduct(101, Rating.FOUR_STAR, "Nice hot cup of Tea");
        pm.reviewProduct(101, Rating.TWO_STAR, "Rather Weak Tea");
        pm.reviewProduct(101, Rating.FOUR_STAR, "Good Tea");
        pm.reviewProduct(101, Rating.FOUR_STAR, "Fine Tea");
        pm.reviewProduct(101, Rating.FIVE_STAR, "Perfect Tea");
        pm.reviewProduct(101, Rating.THREE_STAR, "Add some lemon");
        pm.printProductReport(101);
        
        
        
        pm.createProduct(102,"Coffee",BigDecimal.valueOf(1.99),Rating.NOT_RATED);        
        pm.reviewProduct(102, Rating.FOUR_STAR, "Nice hot cup of Coffee");
        pm.reviewProduct(102, Rating.FIVE_STAR, "Nice Coffee");
        pm.reviewProduct(102, Rating.THREE_STAR, "Coffe was ok");
        pm.reviewProduct(102, Rating.ONE_STAR, "Not good Coffee");
        pm.printProductReport(102);
        
        
        pm.createProduct(103,"Cake", BigDecimal.valueOf(3.99), Rating.NOT_RATED , LocalDate.now().plusDays(2));
        pm.reviewProduct(103, Rating.FOUR_STAR, "Nice Cake");
        pm.reviewProduct(103, Rating.FIVE_STAR, "Nice Cake");
        pm.reviewProduct(103, Rating.THREE_STAR, "Cake was ok");
        pm.reviewProduct(103, Rating.ONE_STAR, "Not good Cake");
        pm.printProductReport(103);
        
        
        pm.createProduct(104,"Cookie",BigDecimal.valueOf(3.99),Rating.NOT_RATED,LocalDate.now()); 
        pm.reviewProduct(104, Rating.FOUR_STAR, "Nice Cookie");
        pm.reviewProduct(104, Rating.FIVE_STAR, "Nice Cookie");
        pm.reviewProduct(104, Rating.THREE_STAR, "Cookie was ok");
        pm.reviewProduct(104, Rating.FIVE_STAR, "Good Cookie");
        pm.printProductReport(104);
        
        pm.createProduct(105,"Hot Chocolate",BigDecimal.valueOf(2.50),Rating.NOT_RATED,LocalDate.now());
        pm.reviewProduct(105, Rating.FIVE_STAR, "Good HOT CHOCOLATE");
        pm.printProductReport(105);
        
        
        
        pm.createProduct(106,"Chocolate",BigDecimal.valueOf(2.99),Rating.NOT_RATED);
        pm.reviewProduct(106, Rating.FIVE_STAR, "Good  CHOCOLATE");
        pm.reviewProduct(106, Rating.ONE_STAR, "Bad CHOCOLATE");
        pm.printProductReport(106);
        
        
        
        //CONTINUE FROM PAGE 173      
    
    
    }
    
}
