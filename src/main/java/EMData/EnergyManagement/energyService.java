package EMData.EnergyManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class energyService implements UserDetailsService
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

    public energyEntity makeread(String regno)
    {
        return repo.findById(regno).orElse(new energyEntity());
    }

    public String makedelete(String regno)
    {
        energyEntity temp=repo.findById(regno).orElse(new energyEntity());

        repo.deleteById(regno);
        return  temp.getUsername()+"has been deleted successfully";
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        energyEntity studentdetails=repo.findByUsername(username);
        if(studentdetails==null)
        {
            throw new UsernameNotFoundException(" registration no is not found..!");
        }
        return studentdetails;
    }
}
