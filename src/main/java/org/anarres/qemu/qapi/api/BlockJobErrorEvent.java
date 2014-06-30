package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiEventDescriptor{name=BLOCK_JOB_ERROR, data={device=str, operation=IoOperationType, action=BlockErrorAction}}
public class BlockJobErrorEvent extends QApiEvent {
	@SerializedName("device")
	@Nonnull public String device;
	@SerializedName("operation")
	@Nonnull public IoOperationType operation;
	@SerializedName("action")
	@Nonnull public BlockErrorAction action;
}
