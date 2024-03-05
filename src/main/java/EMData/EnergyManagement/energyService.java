package EMData.EnergyManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class energyService
{
    @Autowired
    energyRepository repo;


    public energyEntity makecreate(energyEntity mydetails)
    {
        return repo.save(mydetails);
    }
}
