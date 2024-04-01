package EMData.EnergyManagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface managementRepository extends JpaRepository<managementdetails,Integer>
{
//    HQL

    public List<managementdetails> findAllByUserdetails(energyEntity userdetails);


}
