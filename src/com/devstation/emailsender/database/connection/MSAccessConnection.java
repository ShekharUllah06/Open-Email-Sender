/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devstation.emailsender.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Shekhar Ullah
 */
public class MSAccessConnection {

    /**
     * @author Shekhar Ullah
     * @return Database Connection
     * @throws Exception
     */
    public static Connection getConnection() throws Exception {
        //Database driver
        String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
        //Database access file
        String accessFileName = "com/devstation/emailsender/data/EmailSender";
        //connection url
        String connURL = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + accessFileName + ".accdb;";
        //database username
        String username = "";
        //database password
        String password = "";
        Class.forName(driver);
        return DriverManager.getConnection(connURL, username, password);
    }
}
