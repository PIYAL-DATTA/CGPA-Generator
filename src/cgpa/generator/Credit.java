/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpa.generator;

/**
 *
 * @author SCC
 */
public class Credit {
    
    public static double total_credit;
    public static String dept;
    public static void setTotal_credit(double total_credit){
        Credit.total_credit = total_credit;
    }
    public static double getTotal_credit(){
        return total_credit;
    }
    public static void setDept(String dept){
        Credit.dept = dept;
    }
    public static String getDept(){
        return dept;
    }
}
