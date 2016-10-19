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
@Table(name = "EMAILADDRESSLIST", catalog = "", schema = "EMAILSENDER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Emailaddresslist.findAll", query = "SELECT e FROM Emailaddresslist e"),
    @NamedQuery(name = "Emailaddresslist.findByEmailaddress", query = "SELECT e FROM Emailaddresslist e WHERE e.emailaddress = :emailaddress"),
    @NamedQuery(name = "Emailaddresslist.findByOwnername", query = "SELECT e FROM Emailaddresslist e WHERE e.ownername = :ownername"),
    @NamedQuery(name = "Emailaddresslist.findByContactnumber", query = "SELECT e FROM Emailaddresslist e WHERE e.contactnumber = :contactnumber")})
public class Emailaddresslist implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMAILADDRESS")
    private String emailaddress;
    @Column(name = "OWNERNAME")
    private String ownername;
    @Column(name = "CONTACTNUMBER")
    private String contactnumber;

    public Emailaddresslist() {
    }

    public Emailaddresslist(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emailaddress != null ? emailaddress.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emailaddresslist)) {
            return false;
        }
        Emailaddresslist other = (Emailaddresslist) object;
        if ((this.emailaddress == null && other.emailaddress != null) || (this.emailaddress != null && !this.emailaddress.equals(other.emailaddress))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.devstation.emailsender.model.Emailaddresslist[ emailaddress=" + emailaddress + " ]";
    }
    
}
