package com.mall.cms.entity;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author xujiping
 * @since 2018-06-11
 */
public class CmsContent extends Model<CmsContent> {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String title;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CmsContent{" +
                "id=" + id +
                ", title=" + title +
                ", content=" + content +
                "}";
    }
}
