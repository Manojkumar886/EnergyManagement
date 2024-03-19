package EMData.EnergyManagement;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(SpringRunner.class)
class EnergyManagementApplicationTests
{

	@MockBean
	energyRepository repo;
	@Autowired
	energyService service;

//	@Test
//	public void testall()
//	{
//		energyEntity emp1=new energyEntity(1001,"Maddymanoj","maddy123","manojgeetha@gmail.com",9789355930l);
//		energyEntity emp2=new energyEntity(1002,"vinethcbe","vineth123","vinethnamakkal@gmail.com",9078675645l);
//		energyEntity emp3=new energyEntity(1003,"AnnamalaiSubu","Annnamalai123","s.Annamalai@gmail.com",8907675645l);
//
//		when(repo.findAll()).thenReturn(Stream.of(emp1,emp2,emp3).collect(Collectors.toList()));
//		assertSame("AnnamalaiSubu",service.viewAll(purpose(user)).get(2).getUsername());
//	}
//
//
//	@Test
//	public void testcreate()
//	{
//		energyEntity emp1=new energyEntity(1001,"Maddymanoj","maddy123","manojgeetha@gmail.com",9789355930l);
//		energyEntity emp2=new energyEntity(1002,"vinethcbe","vineth123","vinethnamakkal@gmail.com",9078675645l);
//
//		when(repo.save(emp1)).thenReturn(emp1);
//		when(repo.save(emp2)).thenReturn(emp2);
//		assertTrue(service.makecreate(emp1).getStudentPassword().equals("maddy123"));
//	}
//
//	@Test
//	public void testReading()
//	{
//		Optional<energyEntity> emp1=Optional.of(new energyEntity(1001,"Maddymanoj","maddy123","manojgeetha@gmail.com",9789355930l));
//
//		when(repo.findById(1001)).thenReturn(emp1);
//		assertFalse(service.makeread(1001).equals(emp1));
//
//	}

}
