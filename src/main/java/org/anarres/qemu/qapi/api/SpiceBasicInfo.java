package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=SpiceBasicInfo, data={host=str, port=str, family=NetworkAddressFamily}, innerTypes=null}
public class SpiceBasicInfo extends QApiType {

	@SerializedName("host")
	@Nonnull public String host;
	@SerializedName("port")
	@Nonnull public String port;
	@SerializedName("family")
	@Nonnull public NetworkAddressFamily family;
}
