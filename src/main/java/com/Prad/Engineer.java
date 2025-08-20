package com.Prad;

import jakarta.persistence.*;
import org.hibernate.Incubating;

/*Note:
So there are 3 levels
You get the table name from the entity name and the entity name from the class name by default. You can cahange the "Entity" name
or the "Table" name this way @Entity(name = "Developer"), @Table(name = "Developer"). You can change the column name to using Ex: @Column(name = "EngineerName")

 */
@Entity
@Table(name = "Developer")
public class Engineer {

    @Id
    private int eID;
    @Column(name = "EngineerName")
    private String eName;
    private String tech;

   // @Transient//When you use this annotation it will not be stored in the database.
   // private String thisWillBeIgnored;

    public int geteID() {
        return eID;
    }

    public void seteID(int eID) {
        this.eID = eID;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "eID=" + eID +
                ", eName='" + eName + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
