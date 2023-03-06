package Resource;

import Model.Item;
import Repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class ItemController {

    @Autowired
    private ItemRepo repo;

    @PostMapping("/addItem")
    public String saveItem(@RequestBody Item item) {
        repo.save(item);
        return " Added Item with id : " + item.getId();
    }
    @GetMapping("/findallItem")
    public List<Item> getItem(){
        return repo.findAll();
    }

    @GetMapping("/findallItem/{id}")
    public Optional<Item> getItem(@PathVariable int id){
        return repo.findById(id);
    }

    @DeleteMapping("/deleteItem/{id}")
    public String deleteItem(@PathVariable int id)  {
         repo.deleteById(id);
         return " Deleted Item with id : " + id;
    }
}
