package EMData.EnergyManagement;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "management")
public class energyEntity
{
    @Id //primary key
    private int studentRegno;
    private String studentUsername;
    private String studentPassword;
    @Column(name = "mail_id")
    private String studentMailid;
    private Long studentContactno;

}
