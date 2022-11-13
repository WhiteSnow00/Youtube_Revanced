import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import android.window.OnBackInvokedDispatcher;
import android.window.OnBackInvokedCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqn
{
    static OnBackInvokedCallback a(final Runnable runnable) {
        runnable.getClass();
        return (OnBackInvokedCallback)new pq(runnable, 3);
    }
    
    static OnBackInvokedDispatcher b(final aqr aqr) {
        return aqr.findOnBackInvokedDispatcher();
    }
    
    static void c(final Object o, final Object o2) {
        ((OnBackInvokedDispatcher)o).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback)o2);
    }
    
    static void d(final Object o, final Object o2) {
        ((OnBackInvokedDispatcher)o).unregisterOnBackInvokedCallback((OnBackInvokedCallback)o2);
    }
    
    public static final avi e(final Bundle bundle, final Bundle bundle2) {
        if (bundle == null) {
            avi avi;
            if (bundle2 == null) {
                avi = new avi();
            }
            else {
                final HashMap hashMap = new HashMap();
                for (final String s : bundle2.keySet()) {
                    s.getClass();
                    hashMap.put(s, bundle2.get(s));
                }
                avi = new avi((Map)hashMap);
            }
            return avi;
        }
        final ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        final ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int size = parcelableArrayList.size(), i = 0; i < size; ++i) {
                final Object value = parcelableArrayList.get(i);
                value.getClass();
                linkedHashMap.put(value, parcelableArrayList2.get(i));
            }
            return new avi((Map)linkedHashMap);
        }
        throw new IllegalStateException("Invalid bundle passed as restored state");
    }
}
