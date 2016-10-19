/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devstation.emailsender.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Shekhar Ullah
 */
@Entity
@Table(name = "SETTINGS", catalog = "", schema = "EMAILSENDER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Settings.findAll", query = "SELECT s FROM Settings s"),
    @NamedQuery(name = "Settings.findById", query = "SELECT s FROM Settings s WHERE s.id = :id"),
    @NamedQuery(name = "Settings.findByEmailaddress", query = "SELECT s FROM Settings s WHERE s.emailaddress = :emailaddress"),
    @NamedQuery(name = "Settings.findByHost", query = "SELECT s FROM Settings s WHERE s.host = :host"),
    @NamedQuery(name = "Settings.findByPort", query = "SELECT s FROM Settings s WHERE s.port = :port"),
    @NamedQuery(name = "Settings.findByPassword", query = "SELECT s FROM Settings s WHERE s.password = :password")})
public class Settings implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Short id;
    @Basic(optional = false)
    @Column(name = "EMAILADDRESS")
    private String emailaddress;
    @Basic(optional = false)
    @Column(name = "HOST")
    private String host;
    @Basic(optional = false)
    @Column(name = "PORT")
    private int port;
    @Basic(optional = false)
    @Column(name = "PASSWORD")
    private String password;

    public Settings() {
    }

    public Settings(Short id) {
        this.id = id;
    }

    public Settings(Short id, String emailaddress, String host, int port, String password) {
        this.id = id;
        this.emailaddress = emailaddress;
        this.host = host;
        this.port = port;
        this.password = password;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Settings)) {
            return false;
        }
        Settings other = (Settings) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.devstation.emailsender.model.Settings[ id=" + id + " ]";
    }
    
}
