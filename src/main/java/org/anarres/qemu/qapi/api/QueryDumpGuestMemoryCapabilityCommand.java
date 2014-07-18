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
 * <p><pre>QApiCommandDescriptor{name=query-dump-guest-memory-capability, returns=DumpGuestMemoryCapability, data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-dump-guest-memory-capability, returns=DumpGuestMemoryCapability, data=null}
public class QueryDumpGuestMemoryCapabilityCommand extends QApiCommand<java.lang.Void, QueryDumpGuestMemoryCapabilityCommand.Response> {

	/** Response to a QueryDumpGuestMemoryCapabilityCommand. */
	public static class Response extends QApiResponse<DumpGuestMemoryCapability> {
	}

	/** Constructs a new QueryDumpGuestMemoryCapabilityCommand. */
	public QueryDumpGuestMemoryCapabilityCommand() {
		super("query-dump-guest-memory-capability", Response.class, null);
	}
}