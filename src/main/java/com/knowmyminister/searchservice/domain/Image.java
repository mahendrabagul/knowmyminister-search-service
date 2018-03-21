package com.knowmyminister.searchservice.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Image.
 */
public class Image implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String title;

    private String link;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public Image title(String title)
    {
        this.title = title;
        return this;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getLink()
    {
        return link;
    }

    public Image link(String link)
    {
        this.link = link;
        return this;
    }

    public void setLink(String link)
    {
        this.link = link;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Image image = (Image) o;
        if (image.getId() == null || getId() == null)
        {
            return false;
        }
        return Objects.equals(getId(), image.getId());
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString()
    {
        return "Image{" + "id=" + getId() + ", title='" + getTitle() + "'" + ", link='" + getLink() + "'" + "}";
    }
}
