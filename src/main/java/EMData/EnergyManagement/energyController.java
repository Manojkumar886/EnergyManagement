package EMData.EnergyManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
