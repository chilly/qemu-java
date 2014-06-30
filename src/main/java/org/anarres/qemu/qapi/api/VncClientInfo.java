package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=VncClientInfo, data={*x509_dname=str, *sasl_username=str}, innerTypes=null}
public class VncClientInfo extends QApiType {

	@SerializedName("x509_dname")
	@CheckForNull public String x509Dname;
	@SerializedName("sasl_username")
	@CheckForNull public String saslUsername;
}
