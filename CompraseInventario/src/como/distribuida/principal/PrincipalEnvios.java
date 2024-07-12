package como.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.EnviosDAO;
import com.distribuida.entities.Envios;


public class PrincipalEnvios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		EnviosDAO enviosDAO = context.getBean("enviosDAOlmpl",EnviosDAO.class);
		//PedidoDAO pedidoDAO = context.getBean("pedidoDAOImpl",PedidoDAO.class);
		//SucursalOrigenDAO pedidoDAO = context.getBean("pedidoDAOImpl",PedidoDAO.class);
		
		//CRUD : CREATE, READ, UPDATE, DELETE 
		//
		
		//add agregar
		Envios envios = new Envios(0, new Date());
		envios.setIdPedido(5);
		envios.setIdSucursalOrigen(6);
		envios.setIdSucursalDestino(7);
		
		enviosDAO.add(envios);
		
		
//	    envios.setPedido(pedidoDAO.findOne(5));
//		envios.setSucursalOrigen(sucursalOrigenDAO.findOne(5));
//		envios.setSucursalDestino(sucursalDestinoDAO.findOne(5));
		
		
		
		
		//up
		Envios envios2 =  new Envios(101, new Date());
		//Envios2.setEnvios(EnviosDAO.findOne(6));
		
		//del
		//EnviosDAO.del(207);
		
		//findOne
		System.out.println("**********************DEL***********************"+enviosDAO.findOne(5));
		//finAll
		//List<Envios> Envios = enviosDAO.findAll();
		
		
		enviosDAO.findAll().forEach(item -> {System.out.println(item.toString());});
		
		context.close();
				


	}

}
