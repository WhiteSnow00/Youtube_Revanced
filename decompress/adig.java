import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import android.content.Context;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adig extends adia
{
    static final long a;
    long b;
    private boolean c;
    private final atnb d;
    private final oco e;
    
    static {
        a = TimeUnit.MINUTES.toSeconds(2L);
    }
    
    public adig(final atnb d, final oco e) {
        this.c = false;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
    }
    
    public final void f(final aotm aotm) {
        if (aotm != null && (aotm.b & 0x100) != 0x0) {
            aote aote;
            if ((aote = aotm.g) == null) {
                aote = aote.a;
            }
            this.c = aote.b;
            aote aote2;
            if ((aote2 = aotm.g) == null) {
                aote2 = aote.a;
            }
            final long n = aote2.c;
            final long a = adig.a;
            long b;
            if (n <= a) {
                b = TimeUnit.SECONDS.toMillis(a);
            }
            else {
                final TimeUnit seconds = TimeUnit.SECONDS;
                aote aote3;
                if ((aote3 = aotm.g) == null) {
                    aote3 = aote.a;
                }
                b = seconds.toMillis(aote3.c);
            }
            this.b = b;
        }
    }
    
    public final boolean g() {
        return this.c;
    }
    
    public final boolean h(final Context context, final ahcr ahcr) {
        final long c = this.e.c();
        final aapu aapu = (aapu)this.d.a();
        final aflu k = ((afgm)aapu.b).s().k();
        long max = -1L;
        long n;
        while (true) {
            n = max;
            if (!((Iterator)k).hasNext()) {
                break;
            }
            final long p2 = aapu.p((String)((Iterator)k).next());
            if (p2 == -2L) {
                n = -2L;
                break;
            }
            max = Math.max(p2, max);
        }
        if (n == -1L) {
            final aflu i = ((afgm)aapu.b).s().k();
            while (((Iterator)i).hasNext()) {
                aapu.r((String)((Iterator)i).next());
            }
            final aflu j = ((afgm)aapu.b).s().k();
            while (((Iterator)j).hasNext()) {
                aapu.x((String)((Iterator)j).next(), c);
            }
            return false;
        }
        if (n == -2L) {
            return false;
        }
        if (c - n >= this.b) {
            final HashMap hashMap = new HashMap();
            final aflu l = ((afgm)aapu.b).s().k();
            while (((Iterator)l).hasNext()) {
                final String s = (String)((Iterator)l).next();
                final ajfl q = aapu.q(s, c);
                if (q != null) {
                    hashMap.put(s, q);
                }
            }
            Map map = hashMap;
            if (hashMap.isEmpty()) {
                map = null;
            }
            if (map != null) {
                if (!map.isEmpty()) {
                    ahcr.copyOnWrite();
                    final aosv aosv = (aosv)ahcr.instance;
                    final aosv a = aosv.a;
                    aosv.h = aosv.emptyProtobufList();
                    ahcr.bM((Iterable)map.values());
                    for (final String s2 : map.keySet()) {
                        aapu.r(s2);
                        aapu.x(s2, this.e.c());
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
