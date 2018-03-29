package spring.data.jpa.database.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created on 3/28/2018
 *
 * @author Pankaj Nimgade
 */

@Embeddable
public class Person {

    @Column
    private String firstName;

    @Column
    private String lastName;

    public Person() {
        this.firstName = "firstName";
        this.lastName = "lastName";
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return " firstName='" + firstName + '\'' +
                ", lastname='" + lastName + "\' ";
    }
}
