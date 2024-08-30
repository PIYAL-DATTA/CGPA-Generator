/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpa.generator;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author SCC
 */
public class connect {
    
    public static Connection connectdb()
    {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/CGPA_info", "piyal", "204204204");
            return con;
        } catch (SQLException ex) {
            System.out.println("Coonect 1st");
        }
        return null;
    }
}
