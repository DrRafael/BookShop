package org.javalearncourse.bookshop.services;

import org.javalearncourse.bookshop.beans.PrintEdition;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Dbase {



        public Connection connection(){
            final String url = "jdbc:postgresql://localhost:15432/postgres";
            final String user = "postgres";
            final String password = "Post";
             //opening database connection to postgres server
            Connection con = null;
            try {
                Class.forName("org.postgresql.Driver");
                con = DriverManager.getConnection(url, user, password);

            } catch (Exception e) {
                e.printStackTrace();
            }
            return con;
        }

        public List<PrintEdition> getAllProduct(){
            String sql = "SELECT * FROM product ";
            List<PrintEdition> product = new ArrayList<>();
            Connection con = connection();
            try {
                Statement st =con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()) {
                    PrintEdition c = new PrintEdition(rs.getInt("id"), rs.getString("title"), rs.getString("author"),rs.getDouble("price"));
                    product.add(c);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            if(con != null){
                try {
                    con.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return product;
        }
    }


