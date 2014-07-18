package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=SpiceInfo, data={enabled=bool, migrated=bool, *host=str, *port=int, *tls-port=int, *auth=str, *compiled-version=str, mouse-mode=SpiceQueryMouseMode, *channels=[SpiceChannel]}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=SpiceInfo, data={enabled=bool, migrated=bool, *host=str, *port=int, *tls-port=int, *auth=str, *compiled-version=str, mouse-mode=SpiceQueryMouseMode, *channels=[SpiceChannel]}, innerTypes=null}
public class SpiceInfo extends QApiType {

	@SerializedName("enabled")
	@Nonnull
	public boolean enabled;
	@SerializedName("migrated")
	@Nonnull
	public boolean migrated;
	@SerializedName("host")
	@CheckForNull
	public java.lang.String host;
	@SerializedName("port")
	@CheckForNull
	public long port;
	@SerializedName("tls-port")
	@CheckForNull
	public long tlsPort;
	@SerializedName("auth")
	@CheckForNull
	public java.lang.String auth;
	@SerializedName("compiled-version")
	@CheckForNull
	public java.lang.String compiledVersion;
	@SerializedName("mouse-mode")
	@Nonnull
	public SpiceQueryMouseMode mouseMode;
	@SerializedName("channels")
	@CheckForNull
	public List<SpiceChannel> channels;
}