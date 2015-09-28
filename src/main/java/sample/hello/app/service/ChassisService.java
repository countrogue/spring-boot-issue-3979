package sample.hello.app.service;

import sample.hello.app.Chassis;

/**
 * Created by socrates on 9/28/15.
 */
public interface ChassisService {

    Chassis findChassisByName(String name);
}
