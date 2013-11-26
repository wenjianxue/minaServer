package xuewenjian.minaserver.util;

import java.beans.PropertyEditorSupport;
import java.nio.charset.Charset;

public class CharsetUtil extends PropertyEditorSupport{

	private Object value;

	public void setAsText(String text) throws IllegalArgumentException {
		if (text != null)
			this.value = Charset.forName(text);
		else
			this.value = Charset.forName("UTF-8");
	}

	public Object getValue() {
		return value;
	}
}
