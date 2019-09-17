package com.imozayozturk.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity(name = "userTable")
public class UserEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 3161469476052945136L;

    @Id
    @GeneratedValue
    @Getter
    @Setter
    private long id;
    @NotNull
    @Getter
    @Setter
    private String userId;
    @Column(length = 50)
    @NotNull
    @Getter
    @Setter
    private String firstName;
    @Column(length = 50)
    @NotNull
    @Getter
    @Setter
    private String lastName;
    @Column(length = 50)
    @NotNull
    @Getter
    @Setter
    private String email;
    @Column(length = 50)
    @NotNull
    @Getter
    @Setter
    private String password;
    @Column
    @NotNull
    @Getter
    @Setter
    private String encryptedPassword;
    @Getter
    @Setter
    private String emailToken;
    @Column(length = 50)
    @NotNull
    @Getter
    @Setter
    private Boolean emailStatus = false;

}
