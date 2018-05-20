package model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "mail")
    private String mail;
    @OneToMany
    private Set<Profile> profiles;

    public User() {
    }

    public User(String name, String mail, Set<Profile> profiles) {
        this.name = name;
        this.mail = mail;
        this.profiles = profiles;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Set<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(Set<Profile> profiles) {
        this.profiles = profiles;
    }
}
