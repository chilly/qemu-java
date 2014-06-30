package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=MemoryDeviceInfo, data={dimm=PCDIMMDeviceInfo}, innerTypes=null, fields=null}
public class MemoryDeviceInfo extends QApiUnion {
	@SerializedName("dimm")
	@Nonnull public PCDIMMDeviceInfo dimm;

	@Override
	public boolean isUnion() {
		int count = 0;
		if (dimm != null)
			count++;
		return (count == 1);
	}
}
