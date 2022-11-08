import java.util.Iterator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bkj implements bks
{
    private final Object a;
    private aym b;
    private bkr c;
    
    public bkj() {
        this.a = new Object();
    }
    
    public final bkr a(final ayt ayt) {
        dk.d((Object)ayt.b);
        final aym c = ayt.b.c;
        if (c != null) {
            final int a = baw.a;
            synchronized (this.a) {
                if (!baw.aa(c, this.b)) {
                    this.b = c;
                    final bbs bbs = new bbs();
                    byte[] copy = null;
                    bbs.b = null;
                    final blg blg = new blg((bbj)bbs);
                    final afie k = c.c.r().k();
                    while (((Iterator)k).hasNext()) {
                        final Map.Entry<String, V> entry = (Map.Entry<String, V>)((Iterator)k).next();
                        final String s = entry.getKey();
                        final String s2 = (String)entry.getValue();
                        dk.d((Object)s);
                        dk.d((Object)s2);
                        synchronized (blg.b) {
                            blg.b.put(s, s2);
                            continue;
                        }
                        break;
                    }
                    final els els = new els();
                    final UUID a2 = c.a;
                    final blc b = blf.b;
                    els.d = a2;
                    els.a = b;
                    els.c(aesy.D((Collection)c.g));
                    final bki c2 = new bki((UUID)els.d, (bli)blg, (HashMap)els.e, (int[])els.b, (brh)els.c);
                    final byte[] h = c.h;
                    if (h != null) {
                        copy = Arrays.copyOf(h, h.length);
                    }
                    dk.h(c2.c.isEmpty());
                    c2.k = copy;
                    this.c = (bkr)c2;
                }
                final bkr c3 = this.c;
                dk.d((Object)c3);
                return c3;
            }
        }
        return bkr.m;
    }
}
