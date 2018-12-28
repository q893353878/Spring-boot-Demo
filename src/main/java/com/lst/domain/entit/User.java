package com.lst.domain.entit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * @author lst
 * @date  2018-12-28
 * @Entity 将常规的普通Java对象（有时被称作POJO）映射到数据库
 * @Id 标注用于声明一个实体类的属性映射为数据库的主键列
 * @GeneratedValue 用于标注主键的生成策略，通过strategy 属性指定
 * @Column 用来标识实体类中属性与数据表中字段的对应关系 nullable 是否可为空 unique 是否为宜
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private Integer age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
