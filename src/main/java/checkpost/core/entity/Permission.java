package checkpost.core.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

public class Permission {

    @Id
    private ObjectId id;

    private String type;
    private Application application;
    private Resource resource;
    private User user;

    @Version
    private Long version;

}
