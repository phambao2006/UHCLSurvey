/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pham Bao
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.sql.*;


@ManagedBean(name= "c")
@SessionScoped
public class Choice
{

   private static String choice ;
   
   public static ArrayList<String> choices = new ArrayList<String>();

  
   public ArrayList<String> getchoices()
    {
        return choices;
    }
    public String getchoice()
    {
        return choice;
    }
    public void setchoice(String choice)
    {
        if(choice != null)
        {
        this.choice = choice;
        choices.add(choice);
        }
        else
        {
            choice = "NOT ANSWERED";
            setchoice(choice);
        }

    }
    public void storedata()
    {
        try
        {  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/eval?zeroDateTimeBehavior=CONVERT_TO_NULL","root","root");  
        Statement stmt=con.createStatement();  
        con.commit();
        
        stmt.executeUpdate("INSERT INTO teaching(q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,TComment) VALUE(" 
                + choices.get(0) + ","
                + choices.get(1) + ","
                + choices.get(2) + ","
                + choices.get(3) + ","
                + choices.get(4) + ","
                + choices.get(5) + ","
                + choices.get(6) + ","
                + choices.get(7) + ","
                + choices.get(8) + ","
                + choices.get(9) + ","
                + choices.get(10)+ ");");
        stmt.executeUpdate("INSERT INTO feedback(q11,q12,q13,q14,FComment) VALUE(" 
                + choices.get(11) + ","
                + choices.get(12) + ","
                + choices.get(13) + ","
                + choices.get(14) + ");");
        stmt.executeUpdate("INSERT INTO resourse(q14,q15,q16,RComment) VALUE(" 
                + choices.get(15) + ","
                + choices.get(16) + ","
                + choices.get(17) + ");");

        stmt.executeUpdate("INSERT INTO addition(q17,q18,q19,q20,q21,AComment) VALUE(" 
                + choices.get(18) + ","
                + choices.get(19) + ","
                + choices.get(20) + ","
                + choices.get(21) + ","
                + choices.get(22) + ","
                + choices.get(23) +");");
        stmt.executeUpdate("INSERT INTO experience(q22,q23,q24,q25,EComment) VALUE(" 
                + choices.get(24) + ","
                + choices.get(25) + ","
                + choices.get(26) + ","
                + choices.get(27) + ","
                + choices.get(28) + ","
                + choices.get(29) +");");
        stmt.executeUpdate("INSERT INTO self(q26,q27,SComment,q28,q29,q30,q31) VALUE(" 
                + choices.get(30) + ","
                + choices.get(31) + ","
                + choices.get(32) + ","
                + choices.get(33) + ","
                + choices.get(34) + ","
                + choices.get(35) + ","
                + choices.get(36) + ");");
        
        con.close();
        }
        catch(Exception e)
        { 
            System.out.println(e);}  
        }  
}  