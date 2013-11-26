package xuewenjian.minaserver.filter;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinaServerDecoder implements ProtocolDecoder {

	private static final Logger LOG = LoggerFactory.getLogger(MinaServerDecoder.class);
	
	public void decode(IoSession session, IoBuffer iobuf, ProtocolDecoderOutput out)
			throws Exception {
		LOG.info("Mina Server Decoder begin");
	}

	public void dispose(IoSession arg0) throws Exception {
		LOG.info("Mina Server Decoder dispose");

	}

	public void finishDecode(IoSession arg0, ProtocolDecoderOutput arg1)
			throws Exception {
		LOG.info("Mina Server Decoder finish");

	}

}
