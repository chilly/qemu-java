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
 * <pre>QApiTypeDescriptor{name=BlockDeviceMapEntry, data={start=int, length=int, depth=int, zero=bool, data=bool, *offset=int}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=BlockDeviceMapEntry, data={start=int, length=int, depth=int, zero=bool, data=bool, *offset=int}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockDeviceMapEntry extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("start")
	@Nonnull
	public long start;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("length")
	@Nonnull
	public long length;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("depth")
	@Nonnull
	public long depth;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("zero")
	@Nonnull
	public boolean zero;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("data")
	@Nonnull
	public boolean data;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("offset")
	@CheckForNull
	public java.lang.Long offset;

	@Nonnull
	public BlockDeviceMapEntry withStart(long value) {
		this.start = value;
		return this;
	}

	@Nonnull
	public BlockDeviceMapEntry withLength(long value) {
		this.length = value;
		return this;
	}

	@Nonnull
	public BlockDeviceMapEntry withDepth(long value) {
		this.depth = value;
		return this;
	}

	@Nonnull
	public BlockDeviceMapEntry withZero(boolean value) {
		this.zero = value;
		return this;
	}

	@Nonnull
	public BlockDeviceMapEntry withData(boolean value) {
		this.data = value;
		return this;
	}

	@Nonnull
	public BlockDeviceMapEntry withOffset(java.lang.Long value) {
		this.offset = value;
		return this;
	}

	public BlockDeviceMapEntry() {
	}

	public BlockDeviceMapEntry(long start, long length, long depth, boolean zero, boolean data, java.lang.Long offset) {
		this.start = start;
		this.length = length;
		this.depth = depth;
		this.zero = zero;
		this.data = data;
		this.offset = offset;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("start");
		names.add("length");
		names.add("depth");
		names.add("zero");
		names.add("data");
		names.add("offset");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("start".equals(name))
			return start;
		if ("length".equals(name))
			return length;
		if ("depth".equals(name))
			return depth;
		if ("zero".equals(name))
			return zero;
		if ("data".equals(name))
			return data;
		if ("offset".equals(name))
			return offset;
		return super.getFieldByName(name);
	}
}
