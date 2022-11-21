import java.util.Iterator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bkn implements bkw
{
    private final Object a;
    private ayo b;
    private bkv c;
    
    public bkn() {
        this.a = new Object();
    }
    
    public final bkv a(final ayv ayv) {
        bad.b(ayv.b);
        final ayo c = ayv.b.c;
        if (c != null) {
            final int a = baz.a;
            synchronized (this.a) {
                if (!baz.aa(c, this.b)) {
                    this.b = c;
                    final bbv bbv = new bbv();
                    byte[] copy = null;
                    bbv.b = null;
                    final blk blk = new blk((bbm)bbv);
                    final aflu k = c.c.r().k();
                    while (((Iterator)k).hasNext()) {
                        final Map.Entry<String, V> entry = (Map.Entry<String, V>)((Iterator)k).next();
                        final String s = entry.getKey();
                        final String s2 = (String)entry.getValue();
                        bad.b(s);
                        bad.b(s2);
                        synchronized (blk.b) {
                            blk.b.put(s, s2);
                            continue;
                        }
                        break;
                    }
                    final elw elw = new elw();
                    final UUID a2 = c.a;
                    final blg b = blj.b;
                    elw.d = a2;
                    elw.a = b;
                    elw.c(afxr.I(c.g));
                    final bkm c2 = new bkm((UUID)elw.d, blk, (HashMap)elw.e, (int[])elw.b, (brl)elw.c);
                    final byte[] h = c.h;
                    if (h != null) {
                        copy = Arrays.copyOf(h, h.length);
                    }
                    bad.f(c2.c.isEmpty());
                    c2.k = copy;
                    this.c = (bkv)c2;
                }
                final bkv c3 = this.c;
                bad.b(c3);
                return c3;
            }
        }
        return bkv.m;
    }
}
