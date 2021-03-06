package com.slyak.util;

import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.List;

/**
 * .
 * <p/>
 *
 * @author <a href="mailto:stormning@163.com">stormning</a>
 * @version V1.0, 2015/6/19
 */
public class Menu implements Serializable {
    private String title;
    private String name;
    private String url;
    private boolean active;
    private List<Menu> subMenus;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Menu> getSubMenus() {
        return subMenus;
    }

    public void setSubMenus(List<Menu> subMenus) {
        this.subMenus = subMenus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu clone(){
        Menu copy = new Menu();
        BeanUtils.copyProperties(this,copy);
        return copy;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", active=" + active +
                ", subMenus=" + subMenus +
                '}';
    }
}
