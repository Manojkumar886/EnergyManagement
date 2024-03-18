package EMData.EnergyManagement;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.security.Security;

@Configuration
@EnableWebSecurity
public class My_Authentication
{
    @Bean //collection of object
    public PasswordEncoder encoder()
    {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public InMemoryUserDetailsManager userallocation()
    {
        UserDetails user1= User.withUsername("vineth")
                            .password(encoder().encode("Vineth@123"))
                            .roles("Manager")
                            .build();
        UserDetails user2=User.withUsername("manoj")
                            .password(encoder().encode("Manoj@123"))
                            .roles("Assistant Manager")
                            .build();
        return new InMemoryUserDetailsManager(user1,user2);
    }

    @Bean
    public SecurityFilterChain accessauthentication(HttpSecurity hp) throws Exception
    {
//        hp.authorizeHttpRequests().anyRequest().authenticated(); any req to perform in current fil username ,password
        hp.authorizeHttpRequests()
                .requestMatchers("/energymanagement/**")
                        .authenticated();
        hp.csrf().disable();//cross site request forgery
        hp.cors(); //cross -origin resource sharing
        hp.httpBasic();
        hp.formLogin();

      return   hp.build();
    }

}