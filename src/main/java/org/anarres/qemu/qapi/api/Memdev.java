package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=Memdev, data={size=size, merge=bool, dump=bool, prealloc=bool, host-nodes=[uint16], policy=HostMemPolicy}, innerTypes=null}
public class Memdev extends QApiType {

	@SerializedName("size")
	@Nonnull public long size;
	@SerializedName("merge")
	@Nonnull public boolean merge;
	@SerializedName("dump")
	@Nonnull public boolean dump;
	@SerializedName("prealloc")
	@Nonnull public boolean prealloc;
	@SerializedName("host-nodes")
	@Nonnull public List<Integer> hostNodes;
	@SerializedName("policy")
	@Nonnull public HostMemPolicy policy;
}
