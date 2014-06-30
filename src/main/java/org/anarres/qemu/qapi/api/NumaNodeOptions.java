package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=NumaNodeOptions, data={*nodeid=uint16, *cpus=[uint16], *mem=size, *memdev=str}, innerTypes=null}
public class NumaNodeOptions extends QApiType {

	@SerializedName("nodeid")
	@CheckForNull public int nodeid;
	@SerializedName("cpus")
	@CheckForNull public List<Integer> cpus;
	@SerializedName("mem")
	@CheckForNull public long mem;
	@SerializedName("memdev")
	@CheckForNull public String memdev;
}
