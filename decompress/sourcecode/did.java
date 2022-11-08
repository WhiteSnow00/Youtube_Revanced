import java.util.Iterator;
import android.text.TextUtils;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class did implements dhz
{
    private final Map b;
    private volatile Map c;
    
    public did(final Map map) {
        this.b = Collections.unmodifiableMap((Map<?, ?>)map);
    }
    
    public final Map a() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    final HashMap hashMap = new HashMap();
                    for (final Map.Entry<K, List> entry : this.b.entrySet()) {
                        final List list = entry.getValue();
                        final StringBuilder sb = new StringBuilder();
                        for (int size = list.size(), i = 0; i < size; ++i) {
                            final String a = ((dia)list.get(i)).a();
                            if (!TextUtils.isEmpty((CharSequence)a)) {
                                sb.append(a);
                                if (i != list.size() - 1) {
                                    sb.append(',');
                                }
                            }
                        }
                        final String string = sb.toString();
                        if (!TextUtils.isEmpty((CharSequence)string)) {
                            hashMap.put(entry.getKey(), string);
                        }
                    }
                    this.c = Collections.unmodifiableMap((Map<?, ?>)hashMap);
                }
            }
        }
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof did && this.b.equals(((did)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("LazyHeaders{headers=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
