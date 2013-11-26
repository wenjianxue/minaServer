package xuewenjian.minaserver.filter;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;


public class MinaCodecFactory implements ProtocolCodecFactory {

	public ProtocolDecoder getDecoder(IoSession arg0) throws Exception {
		return new MinaServerDecoder();
	}

	public ProtocolEncoder getEncoder(IoSession arg0) throws Exception {
		return new MinaServerEncoder();
	}

}
