import android.util.ArrayMap;
import android.os.BaseBundle;
import java.util.Iterator;
import java.util.Collections;
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;
import android.os.Bundle;
import android.os.PersistableBundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aegp
{
    private static final aefs a;
    
    static {
        a = new aefs("PersistableBundles");
    }
    
    public static Bundle a(final PersistableBundle persistableBundle) {
        final Bundle bundle = new Bundle();
        bundle.putAll(persistableBundle);
        return bundle;
    }
    
    public static PersistableBundle b(final PersistableBundle persistableBundle, PersistableBundle persistableBundle2, final PersistableBundle... array) {
        final ArrayList list = new ArrayList();
        list.addAll(Arrays.asList(persistableBundle, persistableBundle2));
        Collections.addAll(list, array);
        persistableBundle2 = new PersistableBundle();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final PersistableBundle persistableBundle3 = (PersistableBundle)list.get(i);
            for (final String s : persistableBundle3.keySet()) {
                aegu.j(persistableBundle2.containsKey(s) ^ true, String.format("Found duplicate key [%s] while attempting to merge bundles.", s));
            }
            persistableBundle2.putAll(persistableBundle3);
        }
        return persistableBundle2;
    }
    
    public static boolean c(final PersistableBundle persistableBundle, final PersistableBundle persistableBundle2) {
        return persistableBundle == persistableBundle2 || e((BaseBundle)persistableBundle).equals((Object)e((BaseBundle)persistableBundle2));
    }
    
    public static void d(final PersistableBundle persistableBundle) {
        aegu.l(persistableBundle, "PersistableBundle cannot be null!");
        for (final String s : persistableBundle.keySet()) {
            final Object value = persistableBundle.get(s);
            aegu.j(f(value), String.format("Unknown/unsupported data type [%s] for key %s", value, s));
        }
    }
    
    private static ArrayMap e(final BaseBundle baseBundle) {
        if (baseBundle != null && !baseBundle.isEmpty()) {
            final ArrayMap arrayMap = new ArrayMap(baseBundle.size());
            for (final String s : baseBundle.keySet()) {
                final Object value = baseBundle.get(s);
                if (!f(value)) {
                    aegp.a.f(String.format("Unknown/unsupported data type [%s] for key %s", value, s));
                }
                else {
                    arrayMap.put((Object)s, baseBundle.get(s));
                }
            }
            return arrayMap;
        }
        return new ArrayMap(0);
    }
    
    private static boolean f(final Object o) {
        return o instanceof Integer || o instanceof Long || o instanceof Double || o instanceof Float || o instanceof String || o instanceof Boolean;
    }
}
