/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ken Wood
 */
public class Order implements java.io.Serializable {
    private String productName;
    private int productQuantityNum;
    private double productPriceNum;
    private String userName;
    private String userAddr;
    private String creditCard;
    private String ccNo;
    
    public Order() {
        productName = "";
        productQuantityNum = 0;
        productPriceNum = 0.0;
        userName = "";
        userAddr = "";
        creditCard = "";
        ccNo = "";        
    }
    public Order(String productName, int productQuantityNum, double productPriceNum, String userName, String userAddr, String creditCard, String ccNo) {
        this.productName = productName;
        this.productQuantityNum = productQuantityNum;
        this.productPriceNum = productPriceNum;
        this.userName = userName;
        this.userAddr = userAddr;
        this.creditCard = creditCard;
        this.ccNo = ccNo;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }  
    
    
    public int getProductQuantityNum() {
        return productQuantityNum;
    }
    public void setProductQuantityNum(int productQuantityNum) {
        this.productQuantityNum = productQuantityNum;
    }  

    
    public double getProductPriceNum() {
        return productPriceNum;
    }
    public void setProductPriceNum(double productPriceNum) {
        this.productPriceNum = productPriceNum;
    }  
    
    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }  
    
    
    public String getUserAddr() {
        return userAddr;
    }
    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }  
    
    
    public String getCreditCard() {
        return creditCard;
    }
    public void setCreditCard(String userAddr) {
        this.creditCard = creditCard;
    }  
    
    
    public String getCcNo() {
        return ccNo;
    }
    public void setCcNo(String ccNo) {
        this.ccNo = ccNo;
    }  
}

