package test101.spring.testing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created on 4/5/2018
 *
 * @author Pankaj Nimgade
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long _id;

    @Column(unique = true)
    private String username;

    private VehicleIdentificationNumber vin;


    protected User() {
    }

    public User(String username, VehicleIdentificationNumber vin) {
        this.username = username;
        this.vin = vin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public VehicleIdentificationNumber getVin() {
        return vin;
    }

    public void setVin(VehicleIdentificationNumber vin) {
        this.vin = vin;
    }
}
