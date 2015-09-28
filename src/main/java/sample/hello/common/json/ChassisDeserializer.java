package sample.hello.common.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sample.hello.app.Chassis;
import sample.hello.app.service.ChassisService;

import java.io.IOException;

/**
 * Created by socrates on 9/28/15.
 */
@Component
public class ChassisDeserializer extends JsonDeserializer<Chassis> {

    @Autowired ChassisService chassisService;

    @Override
    public Chassis deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException {

        return chassisService.findChassisByName(jp.getValueAsString());
    }
}
