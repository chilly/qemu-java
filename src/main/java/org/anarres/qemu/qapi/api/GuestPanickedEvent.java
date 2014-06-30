package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiEventDescriptor{name=GUEST_PANICKED, data={action=GuestPanicAction}}
public class GuestPanickedEvent extends QApiEvent {
	@SerializedName("action")
	@Nonnull public GuestPanicAction action;
}
