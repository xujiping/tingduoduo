package com.mall.cms.entity;

import java.io.Serializable;

/**
 *
 * @author xujiping
 * @since 2018-06-09
 */
public class CmsUser extends SuperEntity<CmsUser>{

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "CmsUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Serializable pkVal() {
        return id;
    }
}
