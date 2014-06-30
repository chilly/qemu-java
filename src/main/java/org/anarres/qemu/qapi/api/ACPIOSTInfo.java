package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=ACPIOSTInfo, data={*device=str, slot=str, slot-type=ACPISlotType, source=int, status=int}, innerTypes=null}
public class ACPIOSTInfo extends QApiType {

	@SerializedName("device")
	@CheckForNull public String device;
	@SerializedName("slot")
	@Nonnull public String slot;
	@SerializedName("slot-type")
	@Nonnull public ACPISlotType slotType;
	@SerializedName("source")
	@Nonnull public long source;
	@SerializedName("status")
	@Nonnull public long status;
}
