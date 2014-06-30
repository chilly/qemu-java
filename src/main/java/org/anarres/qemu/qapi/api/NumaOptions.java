package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiUnionDescriptor{name=NumaOptions, data={node=NumaNodeOptions}, innerTypes=null, fields=null}
public class NumaOptions extends QApiUnion {
	@SerializedName("node")
	@Nonnull public NumaNodeOptions node;

	@Override
	public boolean isUnion() {
		int count = 0;
		if (node != null)
			count++;
		return (count == 1);
	}
}
