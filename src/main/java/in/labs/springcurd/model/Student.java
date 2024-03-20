package in.labs.springcurd.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Builder
@Document(collection = "Student")
public class Student {

    private int id;
    private String name;
    private String loc;
}
