package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=netdev_del, returns=null, data={id=str}}
public class NetdevDelCommand extends QApiCommand<NetdevDelCommand.Arguments, NetdevDelCommand.Response> {
	public static class Arguments {
		@SerializedName("id")
		@Nonnull public String id;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public NetdevDelCommand(@Nonnull NetdevDelCommand.Arguments argument) {
		super("netdev_del", Response.class, argument);
	}
}
