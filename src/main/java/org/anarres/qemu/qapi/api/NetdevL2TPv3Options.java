package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=NetdevL2TPv3Options, data={src=str, dst=str, *srcport=str, *dstport=str, *ipv6=bool, *udp=bool, *cookie64=bool, *counter=bool, *pincounter=bool, *txcookie=uint64, *rxcookie=uint64, txsession=uint32, *rxsession=uint32, *offset=uint32}, innerTypes=null}
public class NetdevL2TPv3Options extends QApiType {

	@SerializedName("src")
	@Nonnull public String src;
	@SerializedName("dst")
	@Nonnull public String dst;
	@SerializedName("srcport")
	@CheckForNull public String srcport;
	@SerializedName("dstport")
	@CheckForNull public String dstport;
	@SerializedName("ipv6")
	@CheckForNull public boolean ipv6;
	@SerializedName("udp")
	@CheckForNull public boolean udp;
	@SerializedName("cookie64")
	@CheckForNull public boolean cookie64;
	@SerializedName("counter")
	@CheckForNull public boolean counter;
	@SerializedName("pincounter")
	@CheckForNull public boolean pincounter;
	@SerializedName("txcookie")
	@CheckForNull public long txcookie;
	@SerializedName("rxcookie")
	@CheckForNull public long rxcookie;
	@SerializedName("txsession")
	@Nonnull public long txsession;
	@SerializedName("rxsession")
	@CheckForNull public long rxsession;
	@SerializedName("offset")
	@CheckForNull public long offset;
}
