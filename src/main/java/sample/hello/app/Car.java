package sample.hello.app;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import sample.hello.common.json.ChassisDeserializer;
import sample.hello.common.json.ChassisSerializer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by socrates on 9/28/15.
 */
@Entity
public class Car implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @JsonSerialize(using = ChassisSerializer.class)
    @JsonDeserialize(using = ChassisDeserializer.class)
    private Chassis chassis;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }
}
