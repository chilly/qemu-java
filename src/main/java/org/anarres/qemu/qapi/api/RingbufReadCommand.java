package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=ringbuf-read, returns=str, data={device=str, size=int, *format=DataFormat}}</pre></p>
 */
// QApiCommandDescriptor{name=ringbuf-read, returns=str, data={device=str, size=int, *format=DataFormat}}
public class RingbufReadCommand extends QApiCommand<RingbufReadCommand.Arguments, RingbufReadCommand.Response> {
	/** Compound arguments to a RingbufReadCommand. */
	public static class Arguments {
		@SerializedName("device")
		@Nonnull
		public java.lang.String device;
		@SerializedName("size")
		@Nonnull
		public long size;
		@SerializedName("format")
		@CheckForNull
		public DataFormat format;
	}

	/** Response to a RingbufReadCommand. */
	public static class Response extends QApiResponse<java.lang.String> {
	}

	/** Constructs a new RingbufReadCommand. */
	public RingbufReadCommand(@Nonnull RingbufReadCommand.Arguments argument) {
		super("ringbuf-read", Response.class, argument);
	}
}