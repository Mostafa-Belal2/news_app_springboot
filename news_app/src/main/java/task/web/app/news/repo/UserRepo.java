package task.web.app.news.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import task.web.app.news.entity.UsersEntity;

@Repository
public interface UserRepo extends JpaRepository<UsersEntity, Integer> {
}
