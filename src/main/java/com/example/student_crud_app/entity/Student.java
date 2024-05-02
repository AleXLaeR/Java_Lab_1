package com.example.student_crud_app.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String standard;
  private String firstName;
  private String lastName;

  private String email;
  private String address;

  public String getFullName() {
    return firstName + " " + lastName;
  }
}
