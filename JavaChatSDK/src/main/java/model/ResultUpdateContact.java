package model;

import mainmodel.Contact;

import java.util.List;

public class ResultUpdateContact {
    private List<Contact> contacts ;
    private long contentCount;

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public long getContentCount() {
        return contentCount;
    }

    public void setContentCount(long contentCount) {
        this.contentCount = contentCount;
    }
}
