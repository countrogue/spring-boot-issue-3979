package sample.hello.app.service;

import org.springframework.stereotype.Service;
import sample.hello.app.Chassis;

/**
 * Created by socrates on 9/28/15.
 */
@Service
public class ChassisServiceImpl implements ChassisService {

    public Chassis findChassisByName(String name) {
        Chassis ret = new Chassis();
        ret.setId(121414L);
        ret.setName(name);
        return ret;
    }
}
