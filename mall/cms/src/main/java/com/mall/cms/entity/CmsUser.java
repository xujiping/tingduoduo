package com.mall.cms.entity;

import java.io.Serializable;

/**
 *
 *
 * @author xujiping
 * @since 2018-06-09
 */
public class CmsUser extends SuperEntity<CmsUser> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;

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
                "id=" + super.getId() +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
