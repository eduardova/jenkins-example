package dev.eduardova.entityresources;

import dev.eduardova.entityresources.entities.User;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(path = "users")
public interface UserEntityResource extends PanacheEntityResource<User, Long> {

}
