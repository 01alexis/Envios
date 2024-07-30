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
		
		
		//up para actualizar un dato
		//Envios envios2 = new Envios(16, new Date());
		//envios2.setIdPedido(5);
		//envios2.setIdSucursalOrigen(6);
		//envios2.setIdSucursalDestino(7);
		
		//enviosDAO.up(envios2);
		
//	    envios2.setPedido(pedidoDAO.findOne(5));
//		envios2.setSucursalOrigen(sucursalOrigenDAO.findOne(5));
//		envios2.setSucursalDestino(sucursalDestinoDAO.findOne(5));
		
		
		
		//del para eliminar un dato
		//enviosDAO.del(17);
		
		//findOne
		System.out.println("**********************DEL***********************"+enviosDAO.findOne(5));
		//finAll
		//List<Envios> Envios = enviosDAO.findAll();
		
		
		enviosDAO.findAll().forEach(item -> {System.out.println(item.toString());});
		
		context.close();
				


	}

}
