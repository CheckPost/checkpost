package checkpost.core.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import java.util.Collection;

public class User {

    @Id
    private ObjectId id;

    private UserCred userCred;

    private Collection<Application> applications;
    private Collection<Permission> permissions;

    @Version
    private Long version;

}
