package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=dump-guest-memory, returns=null, data={paging=bool, protocol=str, *begin=int, *length=int, *format=DumpGuestMemoryFormat}}
public class DumpGuestMemoryCommand extends QApiCommand<DumpGuestMemoryCommand.Arguments, DumpGuestMemoryCommand.Response> {
	public static class Arguments {
		@SerializedName("paging")
		@Nonnull public boolean paging;
		@SerializedName("protocol")
		@Nonnull public String protocol;
		@SerializedName("begin")
		@CheckForNull public long begin;
		@SerializedName("length")
		@CheckForNull public long length;
		@SerializedName("format")
		@CheckForNull public DumpGuestMemoryFormat format;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public DumpGuestMemoryCommand(@Nonnull DumpGuestMemoryCommand.Arguments argument) {
		super("dump-guest-memory", Response.class, argument);
	}
}
