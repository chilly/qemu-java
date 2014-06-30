package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiEventDescriptor{name=QUORUM_FAILURE, data={reference=str, sector-num=int, sector-count=int}}
public class QuorumFailureEvent extends QApiEvent {
	@SerializedName("reference")
	@Nonnull public String reference;
	@SerializedName("sector-num")
	@Nonnull public long sectorNum;
	@SerializedName("sector-count")
	@Nonnull public long sectorCount;
}
