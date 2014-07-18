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
 * <p><pre>QApiTypeDescriptor{name=PciInfo, data={bus=int, devices=[PciDeviceInfo]}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=PciInfo, data={bus=int, devices=[PciDeviceInfo]}, innerTypes=null}
public class PciInfo extends QApiType {

	@SerializedName("bus")
	@Nonnull
	public long bus;
	@SerializedName("devices")
	@Nonnull
	public List<PciDeviceInfo> devices;
}