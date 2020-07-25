package vn.edu.ntu.lamlaibai2.controller;

import java.util.List;

import vn.edu.ntu.lamlaibai2.model.contact;

public interface Icontroller {
    public List<contact> GetAllContact();
    public void addcontact(contact p);
    public void edit(int id, contact p);
}
