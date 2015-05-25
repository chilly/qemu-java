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
 * <pre>QApiCommandDescriptor{name=cont, returns=null, data=null}</pre>
 */
// QApiCommandDescriptor{name=cont, returns=null, data=null}
public class ContCommand extends QApiCommand<java.lang.Void, ContCommand.Response> {

	/** Response to a ContCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new ContCommand. */
	public ContCommand() {
		super("cont", Response.class, null);
	}

}
