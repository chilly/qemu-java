package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiEventDescriptor{name=SPICE_DISCONNECTED, data={server=SpiceBasicInfo, client=SpiceBasicInfo}}
public class SpiceDisconnectedEvent extends QApiEvent {
	@SerializedName("server")
	@Nonnull public SpiceBasicInfo server;
	@SerializedName("client")
	@Nonnull public SpiceBasicInfo client;
}
