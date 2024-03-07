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
}
