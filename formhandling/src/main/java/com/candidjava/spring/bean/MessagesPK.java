/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.candidjava.spring.bean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author lemonk
 */
@Embeddable
public class MessagesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sender")
    private int sender;
    @Basic(optional = false)
    @NotNull
    @Column(name = "receiver")
    private int receiver;

    public MessagesPK() {
    }

    public MessagesPK(int id, int sender, int receiver) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSender() {
        return sender;
    }

    public void setSender(int sender) {
        this.sender = sender;
    }

    public int getReceiver() {
        return receiver;
    }

    public void setReceiver(int receiver) {
        this.receiver = receiver;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) sender;
        hash += (int) receiver;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MessagesPK)) {
            return false;
        }
        MessagesPK other = (MessagesPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.sender != other.sender) {
            return false;
        }
        if (this.receiver != other.receiver) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.candidjava.spring.bean.MessagesPK[ id=" + id + ", sender=" + sender + ", receiver=" + receiver + " ]";
    }
    
}
