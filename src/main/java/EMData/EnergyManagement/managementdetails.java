package EMData.EnergyManagement;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "emdata")
public class managementdetails
{
    @Id
    private  int serialno;
    private String title;
    private String url;
    @ManyToOne
    @JoinColumn(name = "username")
    @Nullable
    private energyEntity userdetails;


}
