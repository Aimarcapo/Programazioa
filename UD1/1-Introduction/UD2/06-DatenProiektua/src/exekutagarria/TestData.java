package exekutagarria;


import model.Data;
public class TestData {

    public static void main(String[] args) {
        
        // Test constructor and toString()
        Data d1 = new Data(2020, 12, 20);
       

        // Test Setters and Getters
        d1.setYear(2020);
        d1.setMonth(14);
        d1.setDay(33);
        System.out.println(d1);  // run toString() to inspect the modified instance
        System.out.println("Year is: " + d1.getYear());
        System.out.println("Month is: " + d1.getMonth());
        System.out.println("Day is: " + d1.getDay());

        // Test setDate()
        d1.setDate(2988, 1, 2);
        System.out.println(d1);  // toString()

        System.out.println("********************************");
        // Test getHilabeteaLetretan
        System.out.println(d1.getHilabeteaLetretan());
        System.out.println(d1.getHilabeteaLetretan("EN"));
        
        }
        

        
    }
