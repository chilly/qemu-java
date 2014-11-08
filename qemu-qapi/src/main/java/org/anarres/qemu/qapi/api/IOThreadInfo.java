package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=IOThreadInfo, data={id=str, thread-id=int}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=IOThreadInfo, data={id=str, thread-id=int}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class IOThreadInfo extends QApiType {

	@JsonProperty("id")
	@Nonnull
	public java.lang.String id;
	@JsonProperty("thread-id")
	@Nonnull
	public long threadId;

	@Nonnull
	public IOThreadInfo withId(java.lang.String value) {
		this.id = value;
		return this;
	}

	@Nonnull
	public IOThreadInfo withThreadId(long value) {
		this.threadId = value;
		return this;
	}

	public IOThreadInfo() {
	}

	public IOThreadInfo(java.lang.String id, long threadId) {
		this.id = id;
		this.threadId = threadId;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("id");
		names.add("thread-id");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("id".equals(name))
			return id;
		if ("thread-id".equals(name))
			return threadId;
		return super.getFieldByName(name);
	}
}