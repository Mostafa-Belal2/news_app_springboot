package task.web.app.news.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import task.web.app.news.entity.NewsEntity;

import java.util.List;
import task.web.app.news.entity.UsersEntity;

@Controller
public class GateWayService {

    @Autowired
    private NewsService newsService;
    @Autowired
    private UsersService usersService;
    
    

    public void setNewsService(NewsService newsService) {
        this.newsService = newsService;
    }

    public List<NewsEntity> findAllNews() {
        return newsService.findAllNews();
    }

    public NewsEntity findNewById(int id) {
        return newsService.findNewById(id);
    }

    public NewsEntity addNew(NewsEntity newsEntity) {
        return newsService.addNew(newsEntity);
    }

    public NewsEntity updateNew(NewsEntity newsEntity) {
        return newsService.updateNew(newsEntity);
    }

    public void removeNew(int id) {
        newsService.removeNew(id);
    }

    public UsersEntity addUser(UsersEntity usersEntity) {
        return usersService.addUser(usersEntity);
    }

    public UsersEntity updateUser(UsersEntity usersEntity) {
        return usersService.updateUser(usersEntity);
    }

    public void removeUser(int id) {
        usersService.removeUser(id);
    }
    
    
    
    
}
