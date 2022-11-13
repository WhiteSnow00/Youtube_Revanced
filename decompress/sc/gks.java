import java.util.Iterator;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gks implements gkt
{
    private final otk a;
    private final Map b;
    private asir c;
    
    public gks(final otk a) {
        this.b = (Map)new ConcurrentHashMap();
        this.a = a;
    }
    
    @Override
    public final void a() {
        if (this.c != null) {
            return;
        }
        this.c = this.a.a("Egl0aGVtZS1zZXQgSygB").af(asil.a()).K((asjs)fma.g).i(ashb.e).L((asjr)gkr.b).L((asjr)gkr.a).am((asjm)new ghy(this, 17));
    }
    
    @Override
    public final void b() {
        final asir c = this.c;
        if (c != null) {
            athz.f((AtomicReference)c);
            this.c = null;
        }
    }
    
    public final void c(final aosg aosg) {
        final afes h = afev.h();
        for (int i = 0; i < 3; ++i) {
            final int n = (new int[] { 1, 2, 3 })[i];
            if (n != 1) {
                if (n == 0) {
                    throw null;
                }
                final String av = aefb.av(n);
                final String s = Collections.unmodifiableMap((Map<?, ? extends String>)aosg.d).get(av);
                if (s != null) {
                    final aezp aezp = (aezp)this.a.a(s).aM();
                    if (aezp.h()) {
                        h.g(av, aezp.c());
                    }
                }
            }
        }
        this.b.put(aosg.c, h.c());
    }
    
    @Override
    public final void d(final aosg aosg, final int n) {
        this.c(aosg);
        this.e(n);
    }
    
    @Override
    public final void e(final int n) {
        for (final String s : this.b.keySet()) {
            if (this.b.get(s) != null) {
                final afev afev = this.b.get(s);
                final String av = aefb.av(n);
                if (n == 0) {
                    throw null;
                }
                if (!afev.containsKey(av)) {
                    continue;
                }
                this.a.b(s, (byte[])((afev)this.b.get(s)).get(aefb.av(n)));
            }
        }
    }
}
