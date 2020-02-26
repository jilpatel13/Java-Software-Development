/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarDealer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class cCustomer {
    
   
    
    private String CustomerID;
    private String Firstname;
    private String Surname;
    private String Address;
    private String Postcode;
    private String Town;
    private String ProveofID;
    private String DownPayment;

    
    
    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String Town) {
        this.Town = Town;
    }

    public String getProveofID() {
        return ProveofID;
    }

    public void setProveofID(String ProveofID) {
        this.ProveofID = ProveofID;
    }


    public String getDownPayment() {
        return DownPayment;
    }

    public void setDownPayment(String DownPayment) {
        this.DownPayment = DownPayment;
    }
    
    
    private JFrame frame;
    
    public void iExitSystem()
    {
        frame = new JFrame("EXIT");
        
        if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit","J&J Automobiles PVT. LTD.",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }
    
    
}
