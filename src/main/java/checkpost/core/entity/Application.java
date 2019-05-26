package checkpost.core.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import java.util.Collection;

@Data
@NoArgsConstructor
public class Application {

    @Id
    private ObjectId id;

    private Collection<Resource> resources;
    private Collection<User> users;

    @Version
    private Long version;

}
