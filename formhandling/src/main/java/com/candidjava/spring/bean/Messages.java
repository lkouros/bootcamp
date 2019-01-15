/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.candidjava.spring.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lemonk
 */
@Entity
@Table(name = "Messages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Messages.findAll", query = "SELECT m FROM Messages m")
    , @NamedQuery(name = "Messages.findById", query = "SELECT m FROM Messages m WHERE m.messagesPK.id = :id")
    , @NamedQuery(name = "Messages.findBySender", query = "SELECT m FROM Messages m WHERE m.messagesPK.sender = :sender")
    , @NamedQuery(name = "Messages.findByReceiver", query = "SELECT m FROM Messages m WHERE m.messagesPK.receiver = :receiver")
    , @NamedQuery(name = "Messages.findByDos", query = "SELECT m FROM Messages m WHERE m.dos = :dos")
    , @NamedQuery(name = "Messages.findByData", query = "SELECT m FROM Messages m WHERE m.data = :data")
    , @NamedQuery(name = "Messages.findBySdStatus", query = "SELECT m FROM Messages m WHERE m.sdStatus = :sdStatus")
    , @NamedQuery(name = "Messages.findByRcStatus", query = "SELECT m FROM Messages m WHERE m.rcStatus = :rcStatus")})
public class Messages implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MessagesPK messagesPK;
    @Column(name = "dos")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dos;
    @Size(max = 250)
    @Column(name = "data")
    private String data;
    @Column(name = "sd_status")
    private Integer sdStatus;
    @Column(name = "rc_status")
    private Integer rcStatus;
    @JoinColumn(name = "receiver", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Users users;
    @JoinColumn(name = "sender", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Users users1;

    public Messages() {
    }

    public Messages(MessagesPK messagesPK) {
        this.messagesPK = messagesPK;
    }

    public Messages(int id, int sender, int receiver) {
        this.messagesPK = new MessagesPK(id, sender, receiver);
    }

    public MessagesPK getMessagesPK() {
        return messagesPK;
    }

    public void setMessagesPK(MessagesPK messagesPK) {
        this.messagesPK = messagesPK;
    }

    public Date getDos() {
        return dos;
    }

    public void setDos(Date dos) {
        this.dos = dos;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getSdStatus() {
        return sdStatus;
    }

    public void setSdStatus(Integer sdStatus) {
        this.sdStatus = sdStatus;
    }

    public Integer getRcStatus() {
        return rcStatus;
    }

    public void setRcStatus(Integer rcStatus) {
        this.rcStatus = rcStatus;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Users getUsers1() {
        return users1;
    }

    public void setUsers1(Users users1) {
        this.users1 = users1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (messagesPK != null ? messagesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Messages)) {
            return false;
        }
        Messages other = (Messages) object;
        if ((this.messagesPK == null && other.messagesPK != null) || (this.messagesPK != null && !this.messagesPK.equals(other.messagesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.candidjava.spring.bean.Messages[ messagesPK=" + messagesPK + " ]";
    }
    
}
