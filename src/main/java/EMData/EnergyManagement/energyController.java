package EMData.EnergyManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class energyController
{
    @Autowired
    energyService service;

//    url mappings (Post,put,get,delete)
//    http://localhost:8080

//    http://localhost:8080/create
    @PostMapping("/create")
    public String Creation(@RequestBody energyEntity mydetails)
    {
        return service.makecreate(mydetails).getStudentUsername()+" has been added successfully";
    }
    @GetMapping("/list")
    public List<energyEntity>  List()
    {
        return  service.viewAll();
    }

    @PutMapping("/updating")
    public String updating(@RequestBody energyEntity mydetails)
    {
        energyEntity temp=service.makecreate(mydetails);

        return temp.getStudentUsername()+" has been updated successfully";
    }
}
