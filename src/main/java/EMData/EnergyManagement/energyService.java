package EMData.EnergyManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class energyService
{
    @Autowired
    energyRepository repo;


    public energyEntity makecreate(energyEntity mydetails)
    {
        return repo.save(mydetails);
    }
    public List<energyEntity> viewAll()
    {
        return repo.findAll();
    }

    public energyEntity makeread(int regno)
    {
        return repo.findById(regno).orElse(new energyEntity());
    }

    public String makedelete(int regno)
    {
        energyEntity temp=repo.findById(regno).orElse(new energyEntity());

        repo.deleteById(regno);
        return  temp.getStudentUsername()+"has been deleted successfully";
    }
}
