package com.example.demo.entity;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password_hash;
    private String role;
    private Integer failed_attempts;
    private Date locked_until;
    private Boolean mfa_enabled;

    public User(){}

    public User(String email, String password_hash, String role, Integer failed_attempts, Date locked_until, Boolean mfa_enabled) {
        this.email = email;
        this.password_hash = password_hash;
        this.role = role;
        this.failed_attempts = failed_attempts;
        this.locked_until = locked_until;
        this.mfa_enabled = mfa_enabled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getFailed_attempts() {
        return failed_attempts;
    }

    public void setFailed_attempts(Integer failed_attempts) {
        this.failed_attempts = failed_attempts;
    }

    public Date getLocked_until() {
        return locked_until;
    }

    public void setLocked_until(Date locked_until) {
        this.locked_until = locked_until;
    }

    public Boolean getMfa_enabled() {
        return mfa_enabled;
    }

    public void setMfa_enabled(Boolean mfa_enabled) {
        this.mfa_enabled = mfa_enabled;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", failed_attempts=" + failed_attempts +
                ", locked_until=" + locked_until +
                ", mfa_enabled=" + mfa_enabled +
                '}';
    }
}