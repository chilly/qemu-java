package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiTypeDescriptor{name=NetdevNetmapOptions, data={ifname=str, *devname=str}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=NetdevNetmapOptions, data={ifname=str, *devname=str}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NetdevNetmapOptions extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("ifname")
	@Nonnull
	public java.lang.String ifname;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("devname")
	@CheckForNull
	public java.lang.String devname;

	@Nonnull
	public NetdevNetmapOptions withIfname(java.lang.String value) {
		this.ifname = value;
		return this;
	}

	@Nonnull
	public NetdevNetmapOptions withDevname(java.lang.String value) {
		this.devname = value;
		return this;
	}

	public NetdevNetmapOptions() {
	}

	public NetdevNetmapOptions(java.lang.String ifname, java.lang.String devname) {
		this.ifname = ifname;
		this.devname = devname;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("ifname");
		names.add("devname");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("ifname".equals(name))
			return ifname;
		if ("devname".equals(name))
			return devname;
		return super.getFieldByName(name);
	}
}
