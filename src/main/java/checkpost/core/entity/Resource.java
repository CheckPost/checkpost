package checkpost.core.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

@Data
@NoArgsConstructor
public class Resource {

    @Id
    private ObjectId id;

    private String path;

    private Application application;
    private User user;

    @Version
    private Long version;


}
