package EMData.EnergyManagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface managementRepository extends JpaRepository<managementdetails,Integer>
{


}
