package task.web.app.news.entity;
// Generated Aug 9, 2020 4:28:20 PM by Hibernate Tools 4.3.1


import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * RolesEntity generated by hbm2java
 */
@Entity
@Table(name="roles"
    ,catalog="news_app"
)
public class RolesEntity  implements java.io.Serializable {


     private Integer id;
     private String role;
     @JsonManagedReference
     private Set<UsersEntity> userses = new HashSet<UsersEntity>(0);

    public RolesEntity() {
    }

	
    public RolesEntity(String role) {
        this.role = role;
    }
    public RolesEntity(String role, Set<UsersEntity> userses) {
       this.role = role;
       this.userses = userses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="role", nullable=false, length=45)
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="roles")
    public Set<UsersEntity> getUserses() {
        return this.userses;
    }
    
    public void setUserses(Set<UsersEntity> userses) {
        this.userses = userses;
    }




}


