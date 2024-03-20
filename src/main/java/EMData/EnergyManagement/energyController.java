package EMData.EnergyManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
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

    @Autowired
    PasswordEncoder encoder;
//    url mappings (Post,put,get,delete)
//    http://localhost:8080

    @GetMapping("/{user}")
    public energyEntity purpose(@PathVariable("user") String user)
    {
        energyEntity temp=(energyEntity) service.loadUserByUsername(user);
        return temp;
    }
//    http://localhost:8080/create
    @PostMapping("/create")
    public String Creation(@RequestBody energyEntity mydetails)
    {
        String temp= encoder.encode(mydetails.getPassword());
        mydetails.setPassword(temp);
        return service.makecreate(mydetails).getUsername()+" has been added successfully";
    }
    @GetMapping("/list")
    public List<energyEntity>  List(@PathVariable("user")String user)
    {
        return  service.viewAll();
    }

    @PutMapping("/updating")
    public String updating(@RequestBody energyEntity mydetails)
    {
        energyEntity temp=service.makecreate(mydetails);

        return temp.getUsername()+" has been updated successfully";
    }
    @GetMapping("/readbyid/{regno}")
    public energyEntity read(@PathVariable("regno")String regno)
    {
        return service.makeread(regno);
    }

    @DeleteMapping("/deletebyid/{regno}")
    public String deleting(@PathVariable("regno")String regno)
    {
       return service.makedelete(regno)+" ";
    }
}
