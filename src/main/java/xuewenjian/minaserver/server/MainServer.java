package xuewenjian.minaserver.server;

import java.net.URL;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainServer {

	private static final Logger LOG = LoggerFactory.getLogger(MainServer.class);
	
	public static void main(String[] args) {
		initSpringMinaServer();

	}

	public static void initSpringMinaServer()
	{
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-mina.xml");  
	}
}
