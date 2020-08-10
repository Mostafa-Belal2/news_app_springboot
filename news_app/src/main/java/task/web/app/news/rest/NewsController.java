package task.web.app.news.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import task.web.app.news.entity.NewsEntity;
import task.web.app.news.service.GateWayService;

import java.util.List;

@RestController
public class NewsController {

    @Autowired
    private GateWayService gateWay;

    @GetMapping("findAllNews")
    public List<NewsEntity> findAllNews() {
        return gateWay.findAllNews();
    }

    public void setGateWay(GateWayService gateWay) {
        this.gateWay = gateWay;
    }

    @GetMapping("findNewById/{new_id}")
    public NewsEntity findNewById(@PathVariable(name = "new_id") int id) {
        NewsEntity entity = gateWay.findNewById(id);
        return entity;
    }

    @PostMapping("addNew")
    public NewsEntity addNew(@RequestBody NewsEntity newsEntity) {
        return gateWay.addNew(newsEntity);
    }

    @PutMapping("updateNew")
    public NewsEntity updateNew(@RequestBody NewsEntity newsEntity) {
        return gateWay.updateNew(newsEntity);
    }

    @DeleteMapping("removeNew")
    public void removeNew(@RequestParam(name = "new_id") int id) {
        gateWay.removeNew(id);
    }


}
