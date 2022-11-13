import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihd
{
    public final Map a;
    public final otk b;
    public final afvs c;
    public String[] d;
    public aosg e;
    private final gkt f;
    private final gkx g;
    
    public ihd(final otk b, final gkt f, final gkx g, final afvs c) {
        this.a = (Map)new ConcurrentHashMap();
        this.d = new String[0];
        this.b = b;
        this.f = f;
        this.g = g;
        this.c = c;
        this.e = null;
    }
    
    final void a(final aezp aezp) {
        final aosg e = this.e;
        if (e != null) {
            this.f.d(e, this.g.a().d);
            if (aezp.h()) {
                ((Runnable)aezp.c()).run();
            }
        }
    }
    
    public final void b(final String s, final Runnable runnable) {
        final asir asir = this.a.remove(s);
        if (asir != null) {
            asir.dispose();
        }
        if (this.a.isEmpty()) {
            this.a(aezp.k((Object)runnable));
        }
    }
}
