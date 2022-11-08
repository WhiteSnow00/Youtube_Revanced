// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger extends cml
{
    public final cmh a(final List list) {
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            hashMap2.putAll(((cmh)iterator.next()).c());
        }
        cjz.e((Map)hashMap2, (Map)hashMap);
        return cjz.d((Map)hashMap);
    }
}
