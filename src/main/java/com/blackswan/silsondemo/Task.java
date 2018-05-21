package com.blackswan.silsondemo;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Task {

    @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long   id;
                                                        private String name;
                                                        private String description;
                                                        private Date   dateCreated;
    @ManyToOne @JoinColumn(name="user_id")              private User   user;

    public Task() { super(); }

    public Task(String name,
                String description,
                Date   dateCreated) {
        super();
        //this.id          = ;
        this.name        = name;
        this.description = description;
        this.dateCreated = dateCreated;
    }

    // Getters
    public Long   getId()          { return id;          }
    public String getName()        { return name;        }
    public String getDescription() { return description; }
    public Date   getDateCreated() { return dateCreated; }

    // Setters
    public void setId         ( Long id            ) { this.id          = id;          }
    public void setName       ( String name        ) { this.name        = name;        }
    public void setDescription( String description ) { this.description = description; }
    public void setDateCreated( Date dateCreated   ) { this.dateCreated = dateCreated; }

    @Override
    public String toString() {
        return "Task{" +
                "id="             + id          +
                ", name='"        + name        + '\'' +
                ", description='" + description + '\'' +
                ", dateCreated="  + dateCreated +
                '}';
    }

}
