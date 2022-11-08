import java.util.Iterator;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkk implements gkl
{
    private final osb a;
    private final Map b;
    private asic c;
    
    public gkk(final osb a) {
        this.b = (Map)new ConcurrentHashMap();
        this.a = a;
    }
    
    public final void a() {
        if (this.c != null) {
            return;
        }
        this.c = this.a.a("Egl0aGVtZS1zZXQgSygB").aa(ashw.a()).J((asjd)flu.g).i(asgm.e).L((asjc)gkj.b).L((asjc)gkj.a).al((asix)new ghp(this, 16));
    }
    
    public final void b() {
        final asic c = this.c;
        if (c != null) {
            athh.f((AtomicReference)c);
            this.c = null;
        }
    }
    
    public final void c(final aoqd aoqd) {
        final afct h = afcw.h();
        for (int i = 0; i < 3; ++i) {
            final int n = (new int[] { 1, 2, 3 })[i];
            if (n != 1) {
                final String az = aesy.aZ(n);
                if (n == 0) {
                    throw null;
                }
                final String s = Collections.unmodifiableMap((Map<?, ? extends String>)aoqd.d).get(az);
                if (s != null) {
                    final aexq aexq = (aexq)this.a.a(s).aG();
                    if (aexq.h()) {
                        h.g((Object)az, (Object)aexq.c());
                    }
                }
            }
        }
        this.b.put(aoqd.c, h.c());
    }
    
    public final void d(final aoqd aoqd, final int n) {
        this.c(aoqd);
        this.e(n);
    }
    
    public final void e(final int n) {
        for (final String s : this.b.keySet()) {
            if (this.b.get(s) != null) {
                final afcw afcw = this.b.get(s);
                final String az = aesy.aZ(n);
                if (n == 0) {
                    throw null;
                }
                if (!afcw.containsKey((Object)az)) {
                    continue;
                }
                this.a.b(s, (byte[])((afcw)this.b.get(s)).get((Object)aesy.aZ(n)));
            }
        }
    }
}
