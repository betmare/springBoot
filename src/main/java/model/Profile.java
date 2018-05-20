package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "profile")
public class Profile implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "css")
    private String css;

    @ManyToOne(optional = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private User user;

    public Profile() {
    }

    public Profile(Long id, String css, User user) {
        this.id = id;
        this.css = css;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
