import java.util.Arrays;
import java.util.ArrayList;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cci
{
    final List a;
    final boolean b;
    
    public cci(final List list, final boolean b) {
        List<Object> emptyList = list;
        if (list == null) {
            emptyList = Collections.emptyList();
        }
        this.a = emptyList;
        this.b = b;
    }
    
    public static cci a(final Bundle bundle) {
        final List list = null;
        if (bundle == null) {
            return null;
        }
        final ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        List list2 = list;
        if (parcelableArrayList != null) {
            list2 = list;
            if (!parcelableArrayList.isEmpty()) {
                final int size = parcelableArrayList.size();
                list2 = new ArrayList(size);
                for (int i = 0; i < size; ++i) {
                    list2.add(ccb.l((Bundle)parcelableArrayList.get(i)));
                }
            }
        }
        return new cci(list2, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }
    
    public final boolean b() {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final ccb ccb = this.a.get(i);
            if (ccb == null || !ccb.u()) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
        sb.append(Arrays.toString(this.a.toArray()));
        sb.append(", isValid=");
        sb.append(this.b());
        sb.append(" }");
        return sb.toString();
    }
}
