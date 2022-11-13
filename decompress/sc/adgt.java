import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import android.content.Context;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adgt extends adgn
{
    static final long a;
    long b;
    private boolean c;
    private final atke d;
    private final oby e;
    
    static {
        a = TimeUnit.MINUTES.toSeconds(2L);
    }
    
    public adgt(final atke d, final oby e) {
        this.c = false;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
    }
    
    public final void d(final aora aora) {
        if (aora != null && (aora.b & 0x100) != 0x0) {
            aoqt aoqt;
            if ((aoqt = aora.g) == null) {
                aoqt = aoqt.a;
            }
            this.c = aoqt.b;
            aoqt aoqt2;
            if ((aoqt2 = aora.g) == null) {
                aoqt2 = aoqt.a;
            }
            final long n = aoqt2.c;
            final long a = adgt.a;
            long b;
            if (n <= a) {
                b = TimeUnit.SECONDS.toMillis(a);
            }
            else {
                final TimeUnit seconds = TimeUnit.SECONDS;
                aoqt aoqt3;
                if ((aoqt3 = aora.g) == null) {
                    aoqt3 = aoqt.a;
                }
                b = seconds.toMillis(aoqt3.c);
            }
            this.b = b;
        }
    }
    
    public final boolean e() {
        return this.c;
    }
    
    public final boolean f(final Context context, final ahaz ahaz) {
        final long c = this.e.c();
        final aujg aujg = (aujg)this.d.a();
        final afke k = ((afev)aujg.c).s().k();
        long max = -1L;
        long n;
        while (true) {
            n = max;
            if (!k.hasNext()) {
                break;
            }
            final long ac = aujg.ac((String)k.next());
            if (ac == -2L) {
                n = -2L;
                break;
            }
            max = Math.max(ac, max);
        }
        if (n == -1L) {
            final afke i = ((afev)aujg.c).s().k();
            while (i.hasNext()) {
                aujg.ae((String)i.next());
            }
            final afke j = ((afev)aujg.c).s().k();
            while (j.hasNext()) {
                aujg.ak((String)j.next(), c);
            }
            return false;
        }
        if (n == -2L) {
            return false;
        }
        if (c - n >= this.b) {
            final HashMap hashMap = new HashMap();
            final afke l = ((afev)aujg.c).s().k();
            while (l.hasNext()) {
                final String s = l.next();
                final ajdn ad = aujg.ad(s, c);
                if (ad != null) {
                    hashMap.put(s, ad);
                }
            }
            Map map = hashMap;
            if (hashMap.isEmpty()) {
                map = null;
            }
            if (map != null) {
                if (!map.isEmpty()) {
                    ahaz.copyOnWrite();
                    final aoqk aoqk = (aoqk)ahaz.instance;
                    final aoqk a = aoqk.a;
                    aoqk.h = aoqk.emptyProtobufList();
                    ahaz.bL((Iterable)map.values());
                    for (final String s2 : map.keySet()) {
                        aujg.ae(s2);
                        aujg.ak(s2, this.e.c());
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
