package com.hello.dansfinaltest.model;

import com.hello.dansfinaltest.model.audit.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity @Getter @Setter @EqualsAndHashCode @NoArgsConstructor @ToString
//@AttributeOverride(name="id", column=@Column(name="user_id"))
public class UserCustom extends BaseEntity<String>  implements Serializable {

    private @Id @GeneratedValue Long id;
    private String name;
    private String login_code;
    private String password;

    public UserCustom(String name, String password){
        this.name = name;
        this.password = password;
        this.login_code = null;
    }

}
