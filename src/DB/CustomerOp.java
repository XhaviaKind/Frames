/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author but-anonju_sd2022
 */
public class CustomerOp {

    Connection conn = null;
    Statement stmt = null;

    public void purchaseMedForAllergy(String brandname, String genericname, int quantity) {
//        Connection conn = null;
//        Statement stmt = null;
        String deleteQuery;
        String updateQuery;
        String selectQuery;
        selectQuery = "SELECT quantity from `medicine_for_allergy` WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "' ";
        deleteQuery = "DELETE FROM `medicine_for_allergy` WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "' ";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/but-anon", "root", "");
            stmt = conn.createStatement();
            ResultSet select = stmt.executeQuery(selectQuery);
            while (select.next()) {
                int qty = select.getInt("quantity");
                if (qty == quantity) {
                    stmt.executeUpdate(deleteQuery);
                    JOptionPane.showMessageDialog(null, "You purchased all " + genericname);
                } else if (qty > quantity) {
                    int upqty = qty - quantity;
                    updateQuery = "UPDATE `medicine_for_allergy` SET quantity = '" + upqty + "' WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "'";
                    stmt.executeUpdate(updateQuery);
                    JOptionPane.showMessageDialog(null, "You purchased " + quantity + " of " + genericname);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerOp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void purchaseMedForBodyPain(String brandname, String genericname, int quantity) {
//        Connection conn = null;
//        Statement stmt = null;
        String deleteQuery;
        String updateQuery;
        String selectQuery;
        selectQuery = "SELECT quantity from `medicine_for_body_pain` WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "' ";
        deleteQuery = "DELETE FROM `medicine_for_body_pain` WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "' ";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/but-anon", "root", "");
            stmt = conn.createStatement();
            ResultSet select = stmt.executeQuery(selectQuery);
            while (select.next()) {
                int qty = select.getInt("quantity");
                if (qty == quantity) {
                    stmt.executeUpdate(deleteQuery);
                    JOptionPane.showMessageDialog(null, "You purchased all " + genericname);
                } else if (qty > quantity) {
                    int upqty = qty - quantity;
                    updateQuery = "UPDATE `medicine_for_body_pain` SET quantity = '" + upqty + "' WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "'";
                    stmt.executeUpdate(updateQuery);
                    JOptionPane.showMessageDialog(null, "You purchased " + quantity + " of " + genericname);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerOp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void purchaseMedForCough(String brandname, String genericname, int quantity) {
//        Connection conn = null;
//        Statement stmt = null;
        String deleteQuery;
        String updateQuery;
        String selectQuery;
        selectQuery = "SELECT quantity from `medicine_for_cough` WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "' ";
        deleteQuery = "DELETE FROM `medicine_for_cough` WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "' ";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/but-anon", "root", "");
            stmt = conn.createStatement();
            ResultSet select = stmt.executeQuery(selectQuery);
            while (select.next()) {
                int qty = select.getInt("quantity");
                if (qty == quantity) {
                    stmt.executeUpdate(deleteQuery);
                    JOptionPane.showMessageDialog(null, "You purchased all " + genericname);
                } else if (qty > quantity) {
                    int upqty = qty - quantity;
                    updateQuery = "UPDATE `medicine_for_cough` SET quantity = '" + upqty + "' WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "'";
                    stmt.executeUpdate(updateQuery);
                    JOptionPane.showMessageDialog(null, "You purchased " + quantity + " of " + genericname);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerOp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void purchaseMedForHeadache(String brandname, String genericname, int quantity) {
//        Connection conn = null;
//        Statement stmt = null;
        String deleteQuery;
        String updateQuery;
        String selectQuery;
        selectQuery = "SELECT quantity from `medicine_for_headache` WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "' ";
        deleteQuery = "DELETE FROM `medicine_for_headache` WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "' ";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/but-anon", "root", "");
            stmt = conn.createStatement();
            ResultSet select = stmt.executeQuery(selectQuery);
            while (select.next()) {
                int qty = select.getInt("quantity");
                if (qty == quantity) {
                    stmt.executeUpdate(deleteQuery);
                    JOptionPane.showMessageDialog(null, "You purchased all " + genericname);
                } else if (qty > quantity) {
                    int upqty = qty - quantity;
                    updateQuery = "UPDATE `medicine_for_headache` SET quantity = '" + upqty + "' WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "'";
                    stmt.executeUpdate(updateQuery);
                    JOptionPane.showMessageDialog(null, "You purchased " + quantity + " of " + genericname);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerOp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Object[][] viewMedicineForAllergy() {
//        Connection conn = null;
//        Statement stmt = null;
        Object[][] data = new Object[10][5];
        
        String selectQuery;

        selectQuery = "SELECT * from `medicine` WHERE Med_For = 'Allergy'";
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            int cols = 0;
            conn = DriverManager.getConnection("jdbc:mysql://localhost/butanon", "root", "");
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(selectQuery);
            while (result.next()) {
                data[cols][0] = result.getString("GenericName");
                data[cols][1] = result.getString("BrandName");
                data[cols][2] = result.getString("Price");
                data[cols][3] = result.getString("Description");
                data[cols][4] = result.getString("Quantity");
                ++cols;
            }
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerOp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    public Object[][] viewMedicineForBodyPain() {
//        Connection conn = null;
//        Statement stmt = null;
        Object[][] data = new Object[10][5];

        String selectQuery;

        selectQuery = "SELECT * from `medicine` WHERE Med_For = 'Body Pain'";
        try {
            int cols = 0;
            Class.forName("com.mysql.jdbc.Driver");  
            conn = DriverManager.getConnection("jdbc:mysql://localhost/butanon", "root", "");
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(selectQuery);
            while (result.next()) {
                data[cols][0] = result.getString("GenericName");
                data[cols][1] = result.getString("BrandName");
                data[cols][2] = result.getString("Price");
                data[cols][3] = result.getString("Description");
                data[cols][4] = result.getString("Quantity");
                ++cols;
            }
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerOp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    public Object[][] viewMedicineForCough() {
//        Connection conn = null;
//        Statement stmt = null;
        Object[][] data = new Object[10][5];

        String selectQuery;

        selectQuery = "SELECT * from `medicine` WHERE Med_For = 'Cough'";
        try {
            int cols = 0;
            Class.forName("com.mysql.jdbc.Driver");  
            conn = DriverManager.getConnection("jdbc:mysql://localhost/butanon", "root", "");
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(selectQuery);
            while (result.next()) {
                data[cols][0] = result.getString("GenericName");
                data[cols][1] = result.getString("BrandName");
                data[cols][2] = result.getString("Price");
                data[cols][3] = result.getString("Description");
                data[cols][4] = result.getString("Quantity");
                ++cols;
            }
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerOp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    public Object[][] viewMedicineForHeadache() {
//        Connection conn = null;
//        Statement stmt = null;
        Object[][] data = new Object[10][5];

        String selectQuery;

        selectQuery = "SELECT * from `medicine` WHERE Med_For = 'Headache'";
        try {
            int cols = 0;
            Class.forName("com.mysql.jdbc.Driver");  
            conn = DriverManager.getConnection("jdbc:mysql://localhost/butanon", "root", "");
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(selectQuery);
            while (result.next()) {
                data[cols][0] = result.getString("GenericName");
                data[cols][1] = result.getString("BrandName");
                data[cols][2] = result.getString("Price");
                data[cols][3] = result.getString("Description");
                data[cols][4] = result.getString("Quantity");
                ++cols;
            }
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerOp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

}
