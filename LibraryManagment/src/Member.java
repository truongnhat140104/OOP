
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducbao
 */
public class Member extends Account{
    String memberShipDate;
    int nBook;

    public Member() {
    }
     

    public Member(String memberShipDate, int nBook) {
        this.memberShipDate = memberShipDate;
        this.nBook = nBook;
    }

    public Member(String memberShipDate, int nBook, String accountID, String accountType, String fullName, String date, String phoneNumber, String email, String address, String status) {
        super(accountID, accountType, fullName, date, phoneNumber, email, address, status);
        this.memberShipDate = memberShipDate;
        this.nBook = nBook;
    }

     
     

    public String getMemberShipDate() {
        return memberShipDate;
    }

    public void setMemberShipDate(String memberShipDate) {
        this.memberShipDate = memberShipDate;
    }

    public int getnBook() {
        return nBook;
    }

    public void setnBook(int nBook) {
        this.nBook = nBook;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {                                                  //Format chỉnh theo cá nhân 
        return accountID + " " + accountType + " " + fullName + " " + date + " " + phoneNumber + " " + email + " " + address + " " + status + " " + memberShipDate + " " + nBook; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }



     

      

     
    
     
 

     
     
}
