package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=query-spice, returns=SpiceInfo, data=null}</pre>
 */
// QApiCommandDescriptor{name=query-spice, returns=SpiceInfo, data=null}
public class QuerySpiceCommand extends QApiCommand<java.lang.Void, QuerySpiceCommand.Response> {

	/** Response to a QuerySpiceCommand. */
	public static class Response extends QApiResponse<SpiceInfo> {
	}

	/** Constructs a new QuerySpiceCommand. */
	public QuerySpiceCommand() {
		super("query-spice", Response.class, null);
	}

}
