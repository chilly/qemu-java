package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=PCDIMMDeviceInfo, data={*id=str, addr=int, size=int, slot=int, node=int, memdev=str, hotplugged=bool, hotpluggable=bool}, innerTypes=null}
public class PCDIMMDeviceInfo extends QApiType {

	@SerializedName("id")
	@CheckForNull public String id;
	@SerializedName("addr")
	@Nonnull public long addr;
	@SerializedName("size")
	@Nonnull public long size;
	@SerializedName("slot")
	@Nonnull public long slot;
	@SerializedName("node")
	@Nonnull public long node;
	@SerializedName("memdev")
	@Nonnull public String memdev;
	@SerializedName("hotplugged")
	@Nonnull public boolean hotplugged;
	@SerializedName("hotpluggable")
	@Nonnull public boolean hotpluggable;
}
