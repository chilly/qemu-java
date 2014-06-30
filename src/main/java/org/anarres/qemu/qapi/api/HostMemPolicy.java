package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;

// QApiEnumDescriptor{name=HostMemPolicy, data=[default, preferred, bind, interleave], fields=null}
public enum HostMemPolicy {
	@SerializedName("default")
	_default,
	@SerializedName("preferred")
	preferred,
	@SerializedName("bind")
	bind,
	@SerializedName("interleave")
	interleave,
	__UNKNOWN;
}
