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
 * <pre>QApiCommandDescriptor{name=query-version, returns=VersionInfo, data=null}</pre>
 */
// QApiCommandDescriptor{name=query-version, returns=VersionInfo, data=null}
public class QueryVersionCommand extends QApiCommand<java.lang.Void, QueryVersionCommand.Response> {

	/** Response to a QueryVersionCommand. */
	public static class Response extends QApiResponse<VersionInfo> {
	}

	/** Constructs a new QueryVersionCommand. */
	public QueryVersionCommand() {
		super("query-version", Response.class, null);
	}

}
