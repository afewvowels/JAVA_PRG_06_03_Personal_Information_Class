/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_06_03_personal_information_class;

/**
 *
 * @author bluebackdev
 */
public class Personal_Information {
    private String strName;
    private String strAddress;
    
    private int intAge;
    private int intPhoneNumber;
    
    /**
     * Main constructor, takes all variables as inputs for creation
     * of objects.
     * @param name Individual's name.
     * @param address Individual's address.
     * @param age Individual's age.
     * @param phone Individual's phone number.
     */
    public Personal_Information(String name, String address, int age, int phone) {
        strName = name;
        strAddress = address;
        intAge = age;
        intPhoneNumber = phone;
    }
    
    /**
     * No-arg constructor, initializes all variables with null values
     */
    public Personal_Information() {
        strName = "";
        strAddress = "";
        intAge = 0;
        intPhoneNumber = 0;
    }
    
    public void setName(String name) {
        strName = name;
    }
    
    public String getName() {
        return strName;
    }
    
    public void setAddress(String address) {
        strAddress = address;
    }
    
    public String getAddress() {
        return strAddress;
    }
    
    public void setAge(int age) {
        intAge = age;
    }
    
    public int getAge() {
        return intAge;
    }
    
    public void setPhoneNumber(int number) {
        intPhoneNumber = number;
    }
    
    public int getPhoneNumber() {
        return intPhoneNumber;
    }
}
