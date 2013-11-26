package xuewenjian.minaserver.filter;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoder;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinaServerEncoder implements ProtocolEncoder {

	
	private static final Logger LOG = LoggerFactory.getLogger(MinaServerEncoder.class);
	
	public void dispose(IoSession arg0) throws Exception {
		LOG.info("Mina Server Encoder dispose");

	}

	public void encode(IoSession arg0, Object arg1, ProtocolEncoderOutput arg2)
			throws Exception {
		LOG.info("Mina Server Encoder begin");

	}

}
