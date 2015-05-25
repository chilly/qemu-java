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
 * <pre>QApiCommandDescriptor{name=eject, returns=null, data={device=str, *force=bool}}</pre>
 */
// QApiCommandDescriptor{name=eject, returns=null, data={device=str, *force=bool}}
public class EjectCommand extends QApiCommand<EjectCommand.Arguments, EjectCommand.Response> {
	/** Compound arguments to a EjectCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("device")
		@Nonnull
		public java.lang.String device;
		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("force")
		@CheckForNull
		public java.lang.Boolean force;

		public Arguments() {
		}

		public Arguments(java.lang.String device, java.lang.Boolean force) {
			this.device = device;
			this.force = force;
		}
	}

	/** Response to a EjectCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new EjectCommand. */
	public EjectCommand(@Nonnull EjectCommand.Arguments argument) {
		super("eject", Response.class, argument);
	}

	/** Constructs a new EjectCommand. */
	public EjectCommand(java.lang.String device, java.lang.Boolean force) {
		this(new Arguments(device, force));
	}
}
