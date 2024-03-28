package EMData.EnergyManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class managementService
{

    @Autowired
    managementRepository mrepo;

    public managementdetails linkCreate(managementdetails mydatas)
    {
        return mrepo.save(mydatas);
    }



}
