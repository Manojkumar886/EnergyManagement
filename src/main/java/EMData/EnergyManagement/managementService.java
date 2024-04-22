package EMData.EnergyManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class managementService
{

    @Autowired
    managementRepository mrepo;

    public managementdetails linkCreate(managementdetails mydatas)
    {
        return mrepo.save(mydatas);
    }


    public List<managementdetails> getbyuserdetails(energyEntity userdetails)
    {
        return  mrepo.findAllByUserdetails(userdetails);
    }

    public managementdetails getsingleurl(String title)
    {
        return  mrepo.findByTitle(title);
    }

    public String makeurldelete(String title)
    {
        managementdetails temp=mrepo.findById(title).orElse(new managementdetails());

        mrepo.deleteById(title);
        return  temp.getTitle()+"has been deleted successfully";
    }
}
