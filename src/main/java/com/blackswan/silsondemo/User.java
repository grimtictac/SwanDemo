package com.blackswan.silsondemo;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String first_name;
    private String last_name;

    @OneToMany(mappedBy = "user")
    private List<Task> tasks;

    public User() {
        super();
    }

    public User( String username,
                 String first_name,
                 String last_name ) {
        super();
        this.username   = username;
        this.first_name = first_name;
        this.last_name  = last_name;
    }

    public Long   getId()         { return id;         }
    public String getUsername()   { return username;   }
    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name()  { return last_name;  }

    public List<Task> getTasks()  { return tasks;      }

    public void setId        (Long id)           { this.id         = id;         }
    public void setUsername  (String username)   { this.username   = username;   }
    public void setFirst_name(String first_name) { this.first_name = first_name; }
    public void setLast_name (String last_name ) { this.last_name  = last_name;  }

    @Override
    public String toString() {
        return String.format("User [id=%s, " +
                             "username=%s, "    +
                             "first_name=%s,"   +
                             " last_name=%s]",
                id,
                username,
                first_name,
                last_name);
    }

}
