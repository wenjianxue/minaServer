package xuewenjian.minaserver.handle;


import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MsgPrintHandle extends IoHandlerAdapter {

	private static final Logger LOG = LoggerFactory.getLogger(MsgPrintHandle.class);
	
	public void exceptionCaught(IoSession session, Throwable cause) throws Exception
    {
        LOG.warn(cause.getMessage(), cause);
    }
	
	public void messageReceived(IoSession session, Object message) throws Exception
    {
        String expression = message.toString();
       
        LOG.debug("Get Msg:" + expression);
    }
	
}
