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
 * <pre>QApiCommandDescriptor{name=query-migrate-parameters, returns=MigrationParameters, data=null}</pre>
 */
// QApiCommandDescriptor{name=query-migrate-parameters, returns=MigrationParameters, data=null}
public class QueryMigrateParametersCommand extends QApiCommand<java.lang.Void, QueryMigrateParametersCommand.Response> {

	/** Response to a QueryMigrateParametersCommand. */
	public static class Response extends QApiResponse<MigrationParameters> {
	}

	/** Constructs a new QueryMigrateParametersCommand. */
	public QueryMigrateParametersCommand() {
		super("query-migrate-parameters", Response.class, null);
	}

}
