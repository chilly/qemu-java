package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiTypeDescriptor{name=SchemaInfoArray, data={element-type=str}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=SchemaInfoArray, data={element-type=str}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SchemaInfoArray extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("element-type")
	@Nonnull
	public java.lang.String elementType;

	@Nonnull
	public SchemaInfoArray withElementType(java.lang.String value) {
		this.elementType = value;
		return this;
	}

	public SchemaInfoArray() {
	}

	public SchemaInfoArray(java.lang.String elementType) {
		this.elementType = elementType;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("element-type");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("element-type".equals(name))
			return elementType;
		return super.getFieldByName(name);
	}
}
