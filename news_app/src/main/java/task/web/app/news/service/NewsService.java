package task.web.app.news.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import task.web.app.news.entity.NewsEntity;
import task.web.app.news.repo.NewsRepo;

import java.util.List;
import java.util.Optional;

@Service
public class NewsService  {

    @Autowired
    private NewsRepo newsRepo;

    public NewsRepo getNewsRepo() {
        return newsRepo;
    }

    public List<NewsEntity> findAllNews() {
        return newsRepo.findAll();
    }

    public NewsEntity findNewById(int id) {
        NewsEntity entity = newsRepo.findById(id).orElse(null);
        return entity;
    }

    public NewsEntity addNew(NewsEntity newsEntity) {
        return newsRepo.save(newsEntity);
    }

    public NewsEntity updateNew(NewsEntity newsEntity) {
        return newsRepo.save(newsEntity);
    }

    public void removeNew(int id) {
        newsRepo.deleteById(id);
    }
}
