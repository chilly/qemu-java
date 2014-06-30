package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=PciBridgeInfo, data={bus={number=int, secondary=int, subordinate=int, io_range=PciMemoryRange, memory_range=PciMemoryRange, prefetchable_range=PciMemoryRange}, *devices=[PciDeviceInfo]}, innerTypes=null}
public class PciBridgeInfo extends QApiType {
	// QApiTypeDescriptor{name=_Tbus, data={number=int, secondary=int, subordinate=int, io_range=PciMemoryRange, memory_range=PciMemoryRange, prefetchable_range=PciMemoryRange}, innerTypes=[]}
	public static class _Tbus {
		@SerializedName("number")
		@Nonnull public long number;
		@SerializedName("secondary")
		@Nonnull public long secondary;
		@SerializedName("subordinate")
		@Nonnull public long subordinate;
		@SerializedName("io_range")
		@Nonnull public PciMemoryRange ioRange;
		@SerializedName("memory_range")
		@Nonnull public PciMemoryRange memoryRange;
		@SerializedName("prefetchable_range")
		@Nonnull public PciMemoryRange prefetchableRange;
	}

	@SerializedName("bus")
	@Nonnull public _Tbus bus;
	@SerializedName("devices")
	@CheckForNull public List<PciDeviceInfo> devices;
}
