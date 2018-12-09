/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Network.Network;

/**
 *
 * @author raunak
 */
public class Employee {
    
    private String name;
    private int id;
    private String address;
    private Network network;
    private static int count = 1000;
    private int registrationID;
    private String regStatus;
    private static int countP =1;
    private String enterpriseAddress;
    private String enterpriseCity;
    private String enterpriseState;
    private String type;
    private float rating;
    private int noOfReviews;
    
    public Employee() {
        id = count;
        count++;
        registrationID = countP;
        countP++;
        noOfReviews = 0;
    }
    
    public void calculateRating(float Qrating){
        float sum;
        int round;
        sum = (rating*noOfReviews);
        noOfReviews++;
        rating = (sum + Qrating)/noOfReviews;
//        round = (int) (rating*100);
//        rating = (float)(round%100);
    }

    public int getNoOfReviews() {
        return noOfReviews;
    }

    public int getRegistrationID() {
        return registrationID;
    }

    public void setRegistrationID(int registrationID) {
        this.registrationID = registrationID;
    }

    public String getRegStatus() {
        return regStatus;
    }

    public void setRegStatus(String regStatus) {
        this.regStatus = regStatus;
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }

    public String getEnterpriseCity() {
        return enterpriseCity;
    }

    public void setEnterpriseCity(String enterpriseCity) {
        this.enterpriseCity = enterpriseCity;
    }

    public String getEnterpriseState() {
        return enterpriseState;
    }

    public void setEnterpriseState(String enterpriseState) {
        this.enterpriseState = enterpriseState;
    }
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
    

    @Override
    public String toString() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
