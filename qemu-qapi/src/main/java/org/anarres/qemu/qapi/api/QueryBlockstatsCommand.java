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
 * <pre>QApiCommandDescriptor{name=query-blockstats, returns=[BlockStats], data={*query-nodes=bool}}</pre>
 */
// QApiCommandDescriptor{name=query-blockstats, returns=[BlockStats], data={*query-nodes=bool}}
public class QueryBlockstatsCommand extends QApiCommand<QueryBlockstatsCommand.Arguments, QueryBlockstatsCommand.Response> {
	/** Compound arguments to a QueryBlockstatsCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("query-nodes")
		@CheckForNull
		public java.lang.Boolean queryNodes;

		public Arguments() {
		}

		public Arguments(java.lang.Boolean queryNodes) {
			this.queryNodes = queryNodes;
		}
	}

	/** Response to a QueryBlockstatsCommand. */
	public static class Response extends QApiResponse<java.util.List<BlockStats>> {
	}

	/** Constructs a new QueryBlockstatsCommand. */
	public QueryBlockstatsCommand(@Nonnull QueryBlockstatsCommand.Arguments argument) {
		super("query-blockstats", Response.class, argument);
	}

	/** Constructs a new QueryBlockstatsCommand. */
	public QueryBlockstatsCommand(java.lang.Boolean queryNodes) {
		this(new Arguments(queryNodes));
	}
}
