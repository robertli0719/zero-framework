/*
 * Copyright 2016 Robert Li.
 * Released under the MIT license
 * https://opensource.org/licenses/MIT
 */
package robertli.zero.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * This is a Hibernate entity class which is mapped to a relevant database
 * table.<br>
 *
 * Each line of this table is kind of type for user.<br>
 * ex. common, admin, manager
 *
 * @version 1.0.1 2016-12-29
 * @author Robert Li
 */
@Entity
@Table(name = "users_type")
public class UserType implements Serializable {

    private String name;
    private List<UserPlatform> userPlatform;

    @Id
    @Column(length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "userType")
    public List<UserPlatform> getUserPlatform() {
        return userPlatform;
    }

    public void setUserPlatform(List<UserPlatform> userPlatform) {
        this.userPlatform = userPlatform;
    }

}
