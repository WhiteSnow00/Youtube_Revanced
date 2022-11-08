import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import android.content.Context;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ader extends adel
{
    static final long a;
    long b;
    private boolean c;
    private final atjj d;
    private final oas e;
    
    static {
        a = TimeUnit.MINUTES.toSeconds(2L);
    }
    
    public ader(final atjj d, final oas e) {
        this.c = false;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
    }
    
    public final void d(final aoox aoox) {
        if (aoox != null && (aoox.b & 0x100) != 0x0) {
            aooq aooq;
            if ((aooq = aoox.g) == null) {
                aooq = aooq.a;
            }
            this.c = aooq.b;
            aooq aooq2;
            if ((aooq2 = aoox.g) == null) {
                aooq2 = aooq.a;
            }
            final long n = aooq2.c;
            final long a = ader.a;
            long b;
            if (n <= a) {
                b = TimeUnit.SECONDS.toMillis(a);
            }
            else {
                final TimeUnit seconds = TimeUnit.SECONDS;
                aooq aooq3;
                if ((aooq3 = aoox.g) == null) {
                    aooq3 = aooq.a;
                }
                b = seconds.toMillis(aooq3.c);
            }
            this.b = b;
        }
    }
    
    public final boolean e() {
        return this.c;
    }
    
    public final boolean f(final Context context, final agza agza) {
        final long c = this.e.c();
        final auip auip = (auip)this.d.a();
        final afie k = ((afcw)auip.b).s().k();
        long max = -1L;
        long n;
        while (true) {
            n = max;
            if (!((Iterator)k).hasNext()) {
                break;
            }
            final long ac = auip.ac((String)((Iterator)k).next());
            if (ac == -2L) {
                n = -2L;
                break;
            }
            max = Math.max(ac, max);
        }
        if (n == -1L) {
            final afie i = ((afcw)auip.b).s().k();
            while (((Iterator)i).hasNext()) {
                auip.ae((String)((Iterator)i).next());
            }
            final afie j = ((afcw)auip.b).s().k();
            while (((Iterator)j).hasNext()) {
                auip.ak((String)((Iterator)j).next(), c);
            }
            return false;
        }
        if (n == -2L) {
            return false;
        }
        if (c - n >= this.b) {
            final HashMap hashMap = new HashMap();
            final afie l = ((afcw)auip.b).s().k();
            while (((Iterator)l).hasNext()) {
                final String s = (String)((Iterator)l).next();
                final ajbj ad = auip.ad(s, c);
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
                    agza.copyOnWrite();
                    final aooh aooh = (aooh)agza.instance;
                    final aooh a = aooh.a;
                    aooh.h = aooh.emptyProtobufList();
                    agza.bK((Iterable)map.values());
                    for (final String s2 : map.keySet()) {
                        auip.ae(s2);
                        auip.ak(s2, this.e.c());
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
