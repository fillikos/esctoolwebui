package de.fillikos.rf2.service.webui.httpss.model.standings;

import java.util.ArrayList;
import java.util.List;

public class Standings {

    public ArrayList<User> users;

    public Standings() {
        users = new ArrayList();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Standings{" +
                "users=" + users +
                '}';
    }
}
