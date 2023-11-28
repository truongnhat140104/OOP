 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ducbao
 */
public class BookRequest{
    String blCode, memberID, ISBN, dueDate, returnDate;

    public BookRequest() {
    }

    public BookRequest(String blCode, String memberID, String ISBN, String dueDate, String returnDate) {
        this.blCode = blCode;
        this.memberID = memberID;
        this.ISBN = ISBN;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
    }

      

    public String getBlCode() {
        return blCode;
    }

    public void setBlCode(String blCode) {
        this.blCode = blCode;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {                                                  //Format chỉnh theo cá nhân 
        String format = "BlCode | Your ID | Book Code | Date Borrow | Date Return \n";
        return format + blCode + "\t " + memberID + "\t   " + ISBN + "\t\t" + dueDate + "   " + returnDate; 
    }

    
    
        
}
