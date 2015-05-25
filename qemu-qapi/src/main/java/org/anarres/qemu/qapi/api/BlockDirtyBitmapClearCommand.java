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
 * <pre>QApiCommandDescriptor{name=block-dirty-bitmap-clear, returns=null, data=BlockDirtyBitmap}</pre>
 */
// QApiCommandDescriptor{name=block-dirty-bitmap-clear, returns=null, data=BlockDirtyBitmap}
public class BlockDirtyBitmapClearCommand extends QApiCommand<BlockDirtyBitmap, BlockDirtyBitmapClearCommand.Response> {

	/** Response to a BlockDirtyBitmapClearCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new BlockDirtyBitmapClearCommand. */
	public BlockDirtyBitmapClearCommand(@Nonnull BlockDirtyBitmap argument) {
		super("block-dirty-bitmap-clear", Response.class, argument);
	}

}
