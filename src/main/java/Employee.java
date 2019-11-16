package SmartOffice;

import com.google.gson.Gson;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String title;

    public Employee(){}
    public Employee(int id, String name, String email, String title) {
        this.id = id;
        this.name = name;
        this.email = email;
        title = title;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTitle(String title) {
        title = title;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
