package com.bezkoder.cv_management.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username"),
                @UniqueConstraint(columnNames = "email")
        })
@Getter
@Setter
public class UserEntity extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "username", length = 50, nullable = false, unique = true)
    @Size(max = 50)
    @NotNull
    private String username;

    @Column(name = "password",length = 50,nullable = false)
    private String password;


    @Column(name = "email", length = 50, nullable = false, unique = true)
    private String email;

    @Column(name = "full_name",  length = 50, nullable = false)
    private String fullName;

//    @Enumerated(EnumType.STRING)
//    @Column(name = "role")
//    @NotNull
//    private ERole role;

    @ManyToOne
    @JoinColumn(name = "dep_id", nullable = false)
    private DepEntity depEntity;

    @OneToMany(mappedBy = "userEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<TicketUserRelationEntity> ticketUserRelationEntities;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

}
