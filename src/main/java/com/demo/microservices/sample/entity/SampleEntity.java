package com.demo.microservices.sample.entity;




import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;


@Entity
@Table(name = "Sample")
public class SampleEntity {

    @Id
    @Column(name = "Id")
    Integer Id;

    @Column(name = "Age")
    Integer age;

    @Column(name = "Name")
    String name;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}



