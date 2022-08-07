package com.example.Resume.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
@GeneratedValue(strategy = GenerationType.AUTO)
@Id
private int id;

private String userName;
private String password;
private String role;
private boolean isActive;

}
