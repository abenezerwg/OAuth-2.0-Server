package EAfinal.OauthAuthorizationServer.entity;

import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String userName;

    @Column(length = 60)
    private String userPass;

    private String firstName;

    private String lastName;

    private String email;

    private Boolean active = false;

    @Embedded
    private AuditData auditData;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;


}