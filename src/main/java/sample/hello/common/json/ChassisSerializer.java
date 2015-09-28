package sample.hello.common.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.stereotype.Component;
import sample.hello.app.Chassis;

import java.io.IOException;

/**
 * Created by socrates on 9/28/15.
 */
@Component
public class ChassisSerializer extends JsonSerializer<Chassis> {

    @Override
    public void serialize(Chassis chassis, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonProcessingException {

        jgen.writeString(chassis.getName());
    }
}
