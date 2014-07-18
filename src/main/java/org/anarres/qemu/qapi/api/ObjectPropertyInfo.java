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
 * <p><pre>QApiTypeDescriptor{name=ObjectPropertyInfo, data={name=str, type=str}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=ObjectPropertyInfo, data={name=str, type=str}, innerTypes=null}
public class ObjectPropertyInfo extends QApiType {

	@SerializedName("name")
	@Nonnull
	public java.lang.String name;
	@SerializedName("type")
	@Nonnull
	public java.lang.String type;
}