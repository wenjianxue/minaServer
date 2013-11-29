package xuewenjian.minaserver.server;

import java.net.URL;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xuewenjian.minaserver.bean.User;
import xuewenjian.minaserver.mapper.UserMapper;

public class MainServer {

	private static final Logger LOG = LoggerFactory.getLogger(MainServer.class);
	private static ClassPathXmlApplicationContext springContext = null;
	
	public static void main(String[] args) {
		initSpringMinaServer();

	}

	public static void initSpringMinaServer()
	{
		try {
			springContext = new ClassPathXmlApplicationContext("spring-mina.xml");
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
}
