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
 * <pre>QApiCommandDescriptor{name=blockdev-add, returns=null, data={options=BlockdevOptions}}</pre>
 */
// QApiCommandDescriptor{name=blockdev-add, returns=null, data={options=BlockdevOptions}}
public class BlockdevAddCommand extends QApiCommand<BlockdevAddCommand.Arguments, BlockdevAddCommand.Response> {
	/** Compound arguments to a BlockdevAddCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
		@JsonProperty("options")
		@Nonnull
		public BlockdevOptions options;

		public Arguments() {
		}

		public Arguments(BlockdevOptions options) {
			this.options = options;
		}
	}

	/** Response to a BlockdevAddCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new BlockdevAddCommand. */
	public BlockdevAddCommand(@Nonnull BlockdevAddCommand.Arguments argument) {
		super("blockdev-add", Response.class, argument);
	}

	/** Constructs a new BlockdevAddCommand. */
	public BlockdevAddCommand(BlockdevOptions options) {
		this(new Arguments(options));
	}
}
