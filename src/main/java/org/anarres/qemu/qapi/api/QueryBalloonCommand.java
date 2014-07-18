package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=query-balloon, returns=BalloonInfo, data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-balloon, returns=BalloonInfo, data=null}
public class QueryBalloonCommand extends QApiCommand<java.lang.Void, QueryBalloonCommand.Response> {

	/** Response to a QueryBalloonCommand. */
	public static class Response extends QApiResponse<BalloonInfo> {
	}

	/** Constructs a new QueryBalloonCommand. */
	public QueryBalloonCommand() {
		super("query-balloon", Response.class, null);
	}
}