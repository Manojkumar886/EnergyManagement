package EMData.EnergyManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//http://localhost:8080 suppose using req mappin4
//http://localhost:8080/energymanagement/
@RestController
@RequestMapping("energymanagement")
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
    @GetMapping("/readbyid/{regno}")
    public energyEntity read(@PathVariable("regno")int regno)
    {
        return service.makeread(regno);
    }

    @DeleteMapping("/deletebyid/{regno}")
    public String deleting(@PathVariable("regno")int regno)
    {
       return service.makedelete(regno)+" ";
    }
}
