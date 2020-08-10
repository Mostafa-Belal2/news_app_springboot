package task.web.app.news.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import task.web.app.news.entity.UsersEntity;
import task.web.app.news.service.GateWayService;




@RestController
public class usersController {

    @Autowired
    private GateWayService gateWay;


    public void setGateWay(GateWayService gateWay) {
        this.gateWay = gateWay;
    }


    @PostMapping("adduser")
    public UsersEntity adduser(@RequestBody UsersEntity usersEntity) {
        return gateWay.addUser(usersEntity);
    }

    @PutMapping("updateuser")
    public UsersEntity updateuser(@RequestBody UsersEntity usersEntity) {
        return gateWay.updateUser(usersEntity);
    }

    @DeleteMapping("removeuser")
    public void removeuser(@RequestParam(name = "new_id") int id) {
        gateWay.removeUser(id);
    }


}
