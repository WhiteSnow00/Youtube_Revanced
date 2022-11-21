import java.util.Iterator;
import java.util.List;
import j$.util.Map$_EL;
import java.util.Map;
import android.util.Pair;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.LinkedHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aanr
{
    public final yrv a;
    public ablj[] b;
    public final aans c;
    private long d;
    
    public aanr(final aans c, final yrv a) {
        this.c = c;
        this.a = a;
    }
    
    public final long a() {
        final yrv a = this.a;
        if (a != null && this.b == null) {
            this.b = this.b(a, aans.a(this.c));
        }
        return aans.a(this.c) + this.d;
    }
    
    public final ablj[] b(yrv f, long n) {
        final List f2 = aans.f(f, "Stitched-Video-Id");
        final List f3 = aans.f(f, "Stitched-Video-Duration-Us");
        final List f4 = aans.f(f, "Stitched-Video-Cpn");
        f = (yrv)aans.f(f, "Stitched-Video-Start-Time-Within-Ad-Us");
        final int size = f2.size();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final HashMap hashMap = new HashMap();
        for (int i = 0; i < size; ++i) {
            try {
                final long millis = TimeUnit.MICROSECONDS.toMillis(Long.parseLong(f3.get(i)));
                final long millis2 = TimeUnit.MICROSECONDS.toMillis(Long.parseLong(((List<String>)f).get(i)));
                try {
                    this.d += millis;
                    final long n2 = millis + n;
                    final String s = f4.get(i);
                    if (linkedHashMap.containsKey(s)) {
                        n = (long)((Pair)linkedHashMap.get(s)).first;
                        linkedHashMap.remove(s);
                    }
                    linkedHashMap.put(s, new Pair((Object)n, (Object)n2));
                    if (!hashMap.containsKey(s)) {
                        hashMap.put(s, n - millis2);
                    }
                    n = n2;
                }
                catch (final NumberFormatException ex) {}
            }
            catch (final NumberFormatException ex2) {}
        }
        final ablj[] array = new ablj[linkedHashMap.size()];
        final Iterator iterator = linkedHashMap.entrySet().iterator();
        int n3 = 0;
        while (iterator.hasNext()) {
            final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)iterator.next();
            n = (long)Map$_EL.getOrDefault((Map)hashMap, entry.getKey(), (Object)((Pair)entry.getValue()).first);
            array[n3] = new ablj(entry.getKey(), (long)((Pair)entry.getValue()).first, (long)((Pair)entry.getValue()).second, n);
            ++n3;
        }
        return array;
    }
}
