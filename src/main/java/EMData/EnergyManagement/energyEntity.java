package EMData.EnergyManagement;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "management")
public class energyEntity implements UserDetails
{
    @Id
    @Column(name = "Registerno")
    private String username;
    private String password;
    @Column(name = "mail_id")
    private String emailid;
    private Long contactno;
    private String roomno;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "allrecords",
            joinColumns = @JoinColumn(name = "username"),
            inverseJoinColumns = @JoinColumn(name = "serialno"))
    @Nullable
    @JsonBackReference
    private Collection<managementdetails> myemdata
            =new ArrayList<managementdetails>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public String getUsername() {
        return username;
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return true;
    }
}
