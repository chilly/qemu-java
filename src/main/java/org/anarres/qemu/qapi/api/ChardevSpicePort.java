package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=ChardevSpicePort, data={fqdn=str}, innerTypes=null}
public class ChardevSpicePort extends QApiType {

	@SerializedName("fqdn")
	@Nonnull public String fqdn;
}
