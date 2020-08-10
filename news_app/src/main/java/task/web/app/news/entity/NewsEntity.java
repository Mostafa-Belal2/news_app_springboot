package task.web.app.news.entity;
// Generated Aug 9, 2020 4:28:20 PM by Hibernate Tools 4.3.1


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * NewsEntity generated by hbm2java
 */
@Entity
@Table(name="news"
    ,catalog="news_app"
)
public class NewsEntity  implements java.io.Serializable {


     private int id;
     @JsonBackReference
     private UsersEntity users;
     private String title;
     private String description;
     private String imagePath;

    public NewsEntity() {
    }

	
    public NewsEntity(int id, UsersEntity users, String title, String description) {
        this.id = id;
        this.users = users;
        this.title = title;
        this.description = description;
    }
    public NewsEntity(int id, UsersEntity users, String title, String description, String imagePath) {
       this.id = id;
       this.users = users;
       this.title = title;
       this.description = description;
       this.imagePath = imagePath;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="admin_id", nullable=false)
    public UsersEntity getUsers() {
        return this.users;
    }
    
    public void setUsers(UsersEntity users) {
        this.users = users;
    }

    
    @Column(name="title", nullable=false)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    
    @Column(name="description", nullable=false)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="image_path")
    public String getImagePath() {
        return this.imagePath;
    }
    
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }




}


