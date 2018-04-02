package com.knowmyminister.searchservice.domain;

/**
 * Created by mahendra.hiraman on 4/2/2018.
 */
//@Document(indexName = "knowmyminister", type = "authors")
public class Author
{
    //  @Id
    private String id;
    private String firstName;
    private String lastName;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}
