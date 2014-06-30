package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=block_passwd, returns=null, data={*device=str, *node-name=str, password=str}}
public class BlockPasswdCommand extends QApiCommand<BlockPasswdCommand.Arguments, BlockPasswdCommand.Response> {
	public static class Arguments {
		@SerializedName("device")
		@CheckForNull public String device;
		@SerializedName("node-name")
		@CheckForNull public String nodeName;
		@SerializedName("password")
		@Nonnull public String password;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public BlockPasswdCommand(@Nonnull BlockPasswdCommand.Arguments argument) {
		super("block_passwd", Response.class, argument);
	}
}
