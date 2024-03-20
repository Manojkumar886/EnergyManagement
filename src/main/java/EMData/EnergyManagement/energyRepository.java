package EMData.EnergyManagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface energyRepository extends JpaRepository<energyEntity,String>
{

//    HQL-HIbernate Query Langauges
    public energyEntity findByUsername(String registerno);



}
